
package com.anova.anovacloud.client.application.customer;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import com.google.common.base.Strings;
import com.google.gwt.user.client.Window;
import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.ApplicationPresenter;
import com.anova.anovacloud.client.application.event.ActionBarEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent.ActionType;
import com.anova.anovacloud.client.application.event.DisplayMessageEvent;
import com.anova.anovacloud.client.application.event.GoBackEvent;
import com.anova.anovacloud.client.application.customer.CustomerDetailPresenter.MyProxy;
import com.anova.anovacloud.client.application.customer.CustomerDetailPresenter.MyView;
import com.anova.anovacloud.client.application.widget.message.Message;
import com.anova.anovacloud.client.application.widget.message.MessageStyle;
import com.anova.anovacloud.client.place.NameTokens;
import com.anova.anovacloud.client.resources.EditCustomerMessages;
import com.anova.anovacloud.client.rest.CustomerService;
import com.anova.anovacloud.client.util.AbstractAsyncCallback;
import com.anova.anovacloud.client.util.ErrorHandlerAsyncCallback;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.gwtplatform.dispatch.rest.shared.RestDispatch;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest.Builder;

public class CustomerDetailPresenter extends Presenter<MyView, MyProxy>
        implements GoBackEvent.GoBackHandler, ActionBarEvent.ActionBarHandler, CustomerDetailUiHandlers {

    interface MyView extends View, HasUiHandlers<CustomerDetailUiHandlers> {
        void edit(CustomerDto customerDto);

        void getCustomer();
    }

    @ProxyCodeSplit
    @NameToken(NameTokens.DETAIL_CUSTOMER)
    interface MyProxy extends ProxyPlace<CustomerDetailPresenter> {
    }

    private final RestDispatch dispatcher;
    private final CustomerService customerService;
    private final PlaceManager placeManager;
    private final EditCustomerMessages messages;

    private CustomerDto currentCustomer;
    private Boolean createNew;

    @Inject
    CustomerDetailPresenter(EventBus eventBus,
                                MyView view,
                                MyProxy proxy,
                                RestDispatch dispatcher,
                                CustomerService customerService,
                                PlaceManager placeManager,
                                EditCustomerMessages messages) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN_CONTENT);

        this.dispatcher = dispatcher;
        this.customerService = customerService;
        this.placeManager = placeManager;
        this.messages = messages;

        getView().setUiHandlers(this);
    }

    @Override
    public void prepareFromRequest(PlaceRequest request) {
        String param = request.getParameter("id", null);
        createNew = Strings.isNullOrEmpty(param);

        if (!createNew) {
            Long id = Long.parseLong(param);
            dispatcher.execute(customerService.get(id), new AbstractAsyncCallback<CustomerDto>() {
                @Override
                public void onSuccess(CustomerDto customer) {
                    currentCustomer = customer;
                    getView().edit(currentCustomer);
                }
            });
        } else {
            currentCustomer = new CustomerDto();
            getView().edit(currentCustomer);
        }
    }

    @Override
    public void onGoBack(GoBackEvent event) {
        placeManager.revealPlace(new Builder().nameToken(NameTokens.getCustomer()).build());
    }

    @Override
    public void onActionEvent(ActionBarEvent event) {
        if (event.isTheSameToken(NameTokens.getDetailCustomer())) {
            switch (event.getActionType()) {
                case UPDATE:
                    getView().getCustomer();
                    break;
                case DONE:
                    getView().getCustomer();
                    break;
                case DELETE:
                    deleteCustomer();
                    break;
            }
        }
    }

    @Override
    public void onSave(CustomerDto customerDto) {
        dispatcher.execute(customerService.saveOrCreate(customerDto),
                new ErrorHandlerAsyncCallback<CustomerDto>(this) {
                    @Override
                    public void onSuccess(CustomerDto savedCustomerDto) {
                        DisplayMessageEvent.fire(CustomerDetailPresenter.this,
                                new Message(messages.customerSaved(), MessageStyle.SUCCESS));
                        placeManager.revealPlace(new Builder().nameToken(NameTokens.getCustomer()).build());
                    }
                });
    }

    @Override
    protected void onBind() {
        addRegisteredHandler(GoBackEvent.getType(), this);
        addRegisteredHandler(ActionBarEvent.getType(), this);
    }

    @Override
    protected void onReveal() {
        List<ActionType> actions;
        if (createNew) {
            actions = Arrays.asList(ActionType.DONE);
            ChangeActionBarEvent.fire(this, actions, false);
        } else {
            actions = Arrays.asList(ActionType.DELETE, ActionType.UPDATE);
            ChangeActionBarEvent.fire(this, actions, false);
        }
    }

    private void deleteCustomer() {
        Boolean confirm = Window.confirm("Are you sure you want to delete " + currentCustomer.getName() + "?");
        if (confirm) {
            dispatcher.execute(customerService.delete(currentCustomer.getId()),
                    new ErrorHandlerAsyncCallback<Void>(this) {
                        @Override
                        public void onSuccess(Void nothing) {
                            placeManager.revealPlace(new Builder().nameToken(NameTokens.getCustomer()).build());
                        }
                    });
        }
    }
}
