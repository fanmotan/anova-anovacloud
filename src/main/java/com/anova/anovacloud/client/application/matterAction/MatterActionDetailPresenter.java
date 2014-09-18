

package com.anova.anovacloud.client.application.matterAction;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.ApplicationPresenter;
import com.anova.anovacloud.client.application.event.ActionBarEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent.ActionType;
import com.anova.anovacloud.client.application.event.DisplayMessageEvent;
import com.anova.anovacloud.client.application.event.GoBackEvent;
import com.anova.anovacloud.client.application.matterAction.MatterActionDetailPresenter.MyProxy;
import com.anova.anovacloud.client.application.matterAction.MatterActionDetailPresenter.MyView;
import com.anova.anovacloud.client.application.widget.message.Message;
import com.anova.anovacloud.client.application.widget.message.MessageStyle;
import com.anova.anovacloud.client.place.NameTokens;
import com.anova.anovacloud.client.resources.MatterActionMessages;
import com.anova.anovacloud.client.rest.AttorneyRoleService;
import com.anova.anovacloud.client.rest.AttorneyService;
import com.anova.anovacloud.client.rest.MatterActionStatusService;
import com.anova.anovacloud.client.rest.MattersService;
import com.anova.anovacloud.client.rest.MatterActionService;
import com.anova.anovacloud.client.util.AbstractAsyncCallback;
import com.anova.anovacloud.client.util.ErrorHandlerAsyncCallback;
import com.anova.anovacloud.shared.dto.AttorneyDto;
import com.anova.anovacloud.shared.dto.AttorneyRoleDto;
import com.anova.anovacloud.shared.dto.MatterActionStatusDto;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.anova.anovacloud.shared.dto.MatterActionDto;
import com.gwtplatform.dispatch.rest.shared.RestDispatch;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest.Builder;

public class MatterActionDetailPresenter extends Presenter<MyView, MyProxy>
        implements MatterActionDetailUiHandlers, ActionBarEvent.ActionBarHandler, GoBackEvent.GoBackHandler {

    interface MyView extends View, HasUiHandlers<MatterActionDetailUiHandlers> {
        void edit(MatterActionDto matterActionDto);
        void setAllowedMatters(List<MatterDto> matterDtos);
        void setAllowedMatterActionStatuss(List<MatterActionStatusDto> actionStatusDtos);
        void setAllowedAttorneys(List<AttorneyDto> attorneyDtos);
        void setAllowedAttorneyRoles(List<AttorneyRoleDto> attorneyRoleDtos);
        void getMatterAction();
    }

    @ProxyCodeSplit
    @NameToken(NameTokens.DETAIL_MATTERACTION)
    interface MyProxy extends ProxyPlace<MatterActionDetailPresenter> {
    }

    private final RestDispatch dispatcher;
    private final MattersService mattersService;
    private final MatterActionService matterActionService;
    private final MatterActionStatusService matterActionStatusService;
    private final AttorneyService attorneyService;
    private final AttorneyRoleService attorneyRoleService;
    private final MatterActionMessages messages;
    private final PlaceManager placeManager;

    @Inject
    MatterActionDetailPresenter(EventBus eventBus,
                          MyView view,
                          MyProxy proxy,
                          RestDispatch dispatcher,
                          MattersService mattersService,
                          MatterActionService matterActionService,
                          MatterActionStatusService matterActionStatusService,
                          AttorneyService attorneyService,
                          AttorneyRoleService attorneyRoleService,
                          MatterActionMessages messages,
                          PlaceManager placeManager) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN_CONTENT);

        this.dispatcher = dispatcher;
        this.mattersService = mattersService;
        this.matterActionService = matterActionService;
        this.matterActionStatusService = matterActionStatusService;
        this.attorneyService = attorneyService;
        this.attorneyRoleService = attorneyRoleService;
        this.messages = messages;
        this.placeManager = placeManager;

        getView().setUiHandlers(this);
    }

    @Override
    public void onGoBack(GoBackEvent event) {
        placeManager.revealPlace(new Builder().nameToken(NameTokens.getMatterAction()).build());
    }

    @Override
    public void onActionEvent(ActionBarEvent event) {
        if (event.getActionType() == ActionType.DONE && event.isTheSameToken(NameTokens.getDetailMatterAction())) {
            getView().getMatterAction();
        }
    }

    @Override
    public void onSave(MatterActionDto matterActionDto) {
        dispatcher.execute(matterActionService.saveOrCreate(matterActionDto), new ErrorHandlerAsyncCallback<MatterActionDto>(this) {
            @Override
            public void onSuccess(MatterActionDto savedMatterAction) {
                DisplayMessageEvent.fire(MatterActionDetailPresenter.this, new Message(messages.matterActionSaved(),
                        MessageStyle.SUCCESS));
                placeManager.revealPlace(new Builder().nameToken(NameTokens.getMatterAction()).build());
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
        List<ActionType> actions = Arrays.asList(ActionType.DONE);
        ChangeActionBarEvent.fire(this, actions, false);

        dispatcher.execute(mattersService.getMatters(), new AbstractAsyncCallback<List<MatterDto>>() {
            @Override
            public void onSuccess(List<MatterDto> matters) {
                onGetMattersSuccess(matters);
            }
        });
        dispatcher.execute(matterActionStatusService.getMatterActionStatuss(), new AbstractAsyncCallback<List<MatterActionStatusDto>>() {
            @Override
            public void onSuccess(List<MatterActionStatusDto> actionStatuss) {
                onGetMatterActionStatussSuccess(actionStatuss);
            }
        });
        dispatcher.execute(attorneyService.getAttorneys(), new AbstractAsyncCallback<List<AttorneyDto>>() {
            @Override
            public void onSuccess(List<AttorneyDto> attorneys) {
                onGetAttorneysSuccess(attorneys);
            }
        });
        dispatcher.execute(attorneyRoleService.getAttorneyRoles(), new AbstractAsyncCallback<List<AttorneyRoleDto>>() {
            @Override
            public void onSuccess(List<AttorneyRoleDto> attorneyRoles) {
                onGetAttorneyRolesSuccess(attorneyRoles);
            }
        });
    }

    private void onGetMattersSuccess(List<MatterDto> matterDtos) {
        getView().setAllowedMatters(matterDtos);
       
    }
    private void onGetMatterActionStatussSuccess(List<MatterActionStatusDto> actionStatusDtos) {
        getView().setAllowedMatterActionStatuss(actionStatusDtos);
       
    }
    
    private void onGetAttorneysSuccess(List<AttorneyDto> attorneyDtos) {
        getView().setAllowedAttorneys(attorneyDtos);
    }
    
    private void onGetAttorneyRolesSuccess(List<AttorneyRoleDto> attorneyRoleDtos) {
        getView().setAllowedAttorneyRoles(attorneyRoleDtos);
        getView().edit(new MatterActionDto());
       
    }
}
