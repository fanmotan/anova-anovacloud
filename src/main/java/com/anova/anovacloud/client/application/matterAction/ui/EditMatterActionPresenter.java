

package com.anova.anovacloud.client.application.matterAction.ui;

import java.util.List;

import javax.inject.Inject;

import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.event.DisplayMessageEvent;
import com.anova.anovacloud.client.application.matterAction.event.MatterActionAddedEvent;
import com.anova.anovacloud.client.application.matterAction.ui.EditMatterActionPresenter.MyView;
import com.anova.anovacloud.client.application.widget.message.Message;
import com.anova.anovacloud.client.application.widget.message.MessageStyle;
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
import com.gwtplatform.mvp.client.PopupView;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.proxy.RevealRootPopupContentEvent;

public class EditMatterActionPresenter extends PresenterWidget<MyView> implements EditMatterActionUiHandlers {
    public interface MyView extends PopupView, HasUiHandlers<EditMatterActionUiHandlers> {
        void edit(MatterActionDto matterActionDto);
        void setAllowedMatters(List<MatterDto> matterDtos);
        void setAllowedMatterActionStatuss(List<MatterActionStatusDto> actionStatusDtos);
        void setAllowedAttorneys(List<AttorneyDto> attorneyDtos);
        void setAllowedAttorneyRoles(List<AttorneyRoleDto> attorneyRoleDtos);
    }

    private final RestDispatch dispatcher;
    private final MattersService mattersService;
    private final MatterActionService matterActionService;
    private final MatterActionStatusService matterActionStatusService;
    private final AttorneyService attorneyService;
    private final AttorneyRoleService attorneyRoleService;
    private final MatterActionMessages messages;
    
    private MatterActionDto matterActionDto;

    @Inject
    EditMatterActionPresenter(EventBus eventBus,
                        MyView view,
                        RestDispatch dispatcher,
                        MattersService mattersService,
                        MatterActionService matterActionService,
                        MatterActionStatusService matterActionStatusService,
                        AttorneyService attorneyService,
                        AttorneyRoleService attorneyRoleService,
                        MatterActionMessages messages) {
        super(eventBus, view);

        this.dispatcher = dispatcher;
        this.mattersService = mattersService;
        this.matterActionService = matterActionService;
        this.matterActionStatusService = matterActionStatusService;
        this.attorneyService = attorneyService;
        this.attorneyRoleService = attorneyRoleService;
        this.messages = messages;

        getView().setUiHandlers(this);
    }

    @Override
    public void createNew() {
        reveal();
    }
    
    @Override
    public void onEdit(MatterActionDto matterActionDto) {
        this.matterActionDto = matterActionDto;

        reveal();
    }

    @Override
    public void onCancel() {
        getView().hide();
    }

    @Override
    public void onSave(MatterActionDto matterActionDto) {
        dispatcher.execute(matterActionService.saveOrCreate(matterActionDto), new ErrorHandlerAsyncCallback<MatterActionDto>(this) {
            @Override
            public void onSuccess(MatterActionDto savedMatterAction) {
                DisplayMessageEvent.fire(EditMatterActionPresenter.this, new Message(messages.matterActionSaved(),
                        MessageStyle.SUCCESS));
                MatterActionAddedEvent.fire(EditMatterActionPresenter.this, savedMatterAction);
                getView().hide();
            }
        });
    }

    private void reveal() {
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
        RevealRootPopupContentEvent.fire(this, this);
    }
}
