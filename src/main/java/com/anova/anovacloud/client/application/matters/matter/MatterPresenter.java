

package com.anova.anovacloud.client.application.matters.matter;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import com.google.gwt.user.client.Window;
import com.google.inject.assistedinject.Assisted;
import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.matters.matter.MatterPresenter.MyView;
import com.anova.anovacloud.client.application.matters.matter.navigation.NavigationTab;
import com.anova.anovacloud.client.application.matters.matter.navigation.NavigationTabEvent;
import com.anova.anovacloud.client.application.matters.event.MatterAddedEvent;
import com.anova.anovacloud.client.application.event.ActionBarEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent.ActionType;
import com.anova.anovacloud.client.application.event.DisplayMessageEvent;
import com.anova.anovacloud.client.application.event.GoBackEvent;
import com.anova.anovacloud.client.application.widget.message.Message;
import com.anova.anovacloud.client.application.widget.message.MessageStyle;
import com.anova.anovacloud.client.place.NameTokens;
import com.anova.anovacloud.client.resources.MatterMessages;
import com.anova.anovacloud.client.rest.MattersService;
import com.anova.anovacloud.client.rest.CustomerService;
import com.anova.anovacloud.client.util.AbstractAsyncCallback;
import com.anova.anovacloud.client.util.ErrorHandlerAsyncCallback;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.gwtplatform.dispatch.rest.shared.RestDispatch;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;

public class MatterPresenter extends Presenter<MyView, MatterPresenter.MyProxy>
        implements MatterUiHandlers, NavigationTab, GoBackEvent.GoBackHandler, ActionBarEvent.ActionBarHandler {

    public interface MyView extends View, HasUiHandlers<MatterUiHandlers> {
        void edit(MatterDto matterDto);

        void setAllowedCustomers(List<CustomerDto> customerDtos);

        void resetFields(MatterDto matterDto);

        void getMatter();
    }

    public interface MyProxy extends ProxyPlace<MatterPresenter> {
    }

    private final MattersService mattersService;
    private final CustomerService customerService;
    private final MatterMessages messages;
    private final RestDispatch dispatcher;
    private final PlaceManager placeManager;
    private final MatterProxyFactory matterProxyFactory;

    private MatterDto matterDto;

    @Inject
    public MatterPresenter(EventBus eventBus,
                        MyView view,
                        RestDispatch dispatcher,
                        MattersService mattersService,
                        CustomerService customerService,
                        PlaceManager placeManager,
                        MatterProxyFactory matterProxyFactory,
                        MatterMessages messages,
                        @Assisted MyProxy proxy,
                        @Assisted MatterDto matterDto) {
        super(eventBus, view, proxy, RootMatterPresenter.SLOT_SetMatterContent);

        this.dispatcher = dispatcher;
        this.mattersService = mattersService;
        this.customerService = customerService;
        this.messages = messages;
        this.placeManager = placeManager;
        this.matterProxyFactory = matterProxyFactory;
        this.matterDto = matterDto != null ? matterDto : new MatterDto();

        getView().setUiHandlers(this);
    }

    @Override
    public void onGoBack(GoBackEvent event) {
        placeManager.revealPlace(new PlaceRequest.Builder().nameToken(NameTokens.getMatters()).build());
    }

    @Override
    public void onActionEvent(ActionBarEvent event) {
        if (event.isTheSameToken(NameTokens.NEW_MATTER)) {
            if (event.getActionType() == ActionType.DONE) {
                getView().getMatter();
            }
        } else if (event.isTheSameToken(matterDto.getCustomer().getName() + matterDto.getMatterNum()+matterDto.getMatterSerialNum())) {
            if (event.getActionType() == ActionType.UPDATE) {
                getView().getMatter();
            } else if (event.getActionType() == ActionType.DELETE) {
                onDeleteMatter();
            }
        }
    }

    @Override
    public void onCancel() {
        NavigationTabEvent.fireClose(this, this);
    }

    @Override
    public void onSave(final MatterDto matterDto) {
        dispatcher.execute(mattersService.saveOrCreate(matterDto), new ErrorHandlerAsyncCallback<MatterDto>(this) {
            @Override
            public void onSuccess(MatterDto newMatter) {
                onMatterSaved(matterDto, newMatter);
            }
        });
    }

    @Override
    public String getName() {
        if (matterDto.getId() != null) {
            return matterDto.getCustomer().getName() + " " + matterDto.getMatterNum()+" " + matterDto.getMatterSerialNum();
        } else {
            return "New Matter";
        }
    }

    @Override
    public String getToken() {
        return getProxy().getNameToken();
    }

    @Override
    public boolean isClosable() {
        return true;
    }

    @Override
    protected void onBind() {
        addRegisteredHandler(GoBackEvent.getType(), this);
        addRegisteredHandler(ActionBarEvent.getType(), this);
    }

    @Override
    protected void onReveal() {
        dispatcher.execute(customerService.getCustomers(), new AbstractAsyncCallback<List<CustomerDto>>() {
            @Override
            public void onSuccess(List<CustomerDto> customers) {
                onGetCustomerSuccess(customers);
            }
        });

        Boolean createNew = placeManager.getCurrentPlaceRequest().matchesNameToken(NameTokens.NEW_MATTER);
        List<ActionType> actions;
        if (createNew) {
            actions = Arrays.asList(ActionType.DONE);
            ChangeActionBarEvent.fire(this, actions, false);
        } else {
            actions = Arrays.asList(ActionType.DELETE, ActionType.UPDATE);
            ChangeActionBarEvent.fire(this, actions, false);
        }

        NavigationTabEvent.fireReveal(this, this);
    }

    private void onGetCustomerSuccess(List<CustomerDto> customerDtos) {
        getView().setAllowedCustomers(customerDtos);
        getView().edit(matterDto);
    }

    private void onMatterSaved(MatterDto oldMatter, MatterDto newMatter) {
        DisplayMessageEvent.fire(MatterPresenter.this, new Message(messages.matterSaved(), MessageStyle.SUCCESS));
        MatterAddedEvent.fire(MatterPresenter.this, newMatter, oldMatter.getId() == null);

        if (oldMatter.getId() == null) {
            matterDto = new MatterDto();
            getView().resetFields(matterDto);

            MyProxy proxy = matterProxyFactory.create(newMatter, newMatter.getCustomer().getName() + newMatter.getMatterNum()+newMatter.getMatterSerialNum());

            placeManager.revealPlace(new PlaceRequest.Builder().nameToken(proxy.getNameToken()).build());
        }
    }

    private void onDeleteMatter() {
        Boolean confirm = Window.confirm("Are you sure you want to delete " + matterDto.getMatterNum()+"."+matterDto.getMatterSerialNum() + "?");
        if (confirm) {
            dispatcher.execute(mattersService.matter(matterDto.getId()).delete(), new ErrorHandlerAsyncCallback<Void>(this) {
                @Override
                public void onSuccess(Void nothing) {
                    NavigationTabEvent.fireClose(MatterPresenter.this, MatterPresenter.this);
                }
            });
        }
    }
}
