package com.anova.anovacloud.client.application.matterAction;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.ApplicationPresenter;
import com.anova.anovacloud.client.application.event.ActionBarEvent;
import com.anova.anovacloud.client.application.event.ActionBarVisibilityEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent.ActionType;
import com.anova.anovacloud.client.application.matterAction.event.MatterActionAddedEvent;
import com.anova.anovacloud.client.application.matterAction.event.MatterActionAddedEvent.MatterActionAddedHandler;
import com.anova.anovacloud.client.application.matterAction.ui.EditMatterActionPresenter;
import com.anova.anovacloud.client.place.NameTokens;
import com.anova.anovacloud.client.rest.MatterActionService;
import com.anova.anovacloud.client.util.AbstractAsyncCallback;
import com.anova.anovacloud.shared.dto.MatterActionDto;
import com.gwtplatform.dispatch.rest.shared.RestDispatch;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.ProxyEvent;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest.Builder;

public class MatterActionPresenter extends Presenter<MatterActionPresenter.MyView, MatterActionPresenter.MyProxy>
        implements MatterActionUiHandlers, MatterActionAddedHandler, ActionBarEvent.ActionBarHandler {

    interface MyView extends View, HasUiHandlers<MatterActionUiHandlers> {
        void displayMatterActions(List<MatterActionDto> results);

   //     void removeMatterAction(MatterActionDto matterActionDto);

        void addMatterAction(MatterActionDto matterActionDto);
        void replaceMatterAction(MatterActionDto oldMatterAction, MatterActionDto newMatterAction);
    }

    @ProxyCodeSplit
    @NameToken(NameTokens.MATTERACTION)
    interface MyProxy extends ProxyPlace<MatterActionPresenter> {
    }

    private final RestDispatch dispatcher;
    private final EditMatterActionPresenter editMatterActionPresenter;
    private final MatterActionService matterActionService;
    private final PlaceManager placeManager;
    private MatterActionDto editingMatterAction;

    @Inject
    MatterActionPresenter(EventBus eventBus,
                    MyView view,
                    MyProxy proxy,
                    RestDispatch dispatcher,
                    MatterActionService matterActionService,
                    EditMatterActionPresenter editMatterActionPresenter,
                    PlaceManager placeManager) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN_CONTENT);

        this.dispatcher = dispatcher;
        this.matterActionService = matterActionService;
        this.placeManager = placeManager;
        this.editMatterActionPresenter = editMatterActionPresenter;

        getView().setUiHandlers(this);
    }

    @Override
    public void onActionEvent(ActionBarEvent event) {
        if (event.getActionType() == ActionType.ADD && event.isTheSameToken(NameTokens.getMatterAction())) {
            placeManager.revealPlace(new Builder().nameToken(NameTokens.getDetailMatterAction()).build());
        }
    }

    @Override
    public void onCreate() {
    	editingMatterAction = null;
        editMatterActionPresenter.createNew();
    }
    
    @Override
    public void onDetail(MatterActionDto matterActionDto) {
        PlaceRequest placeRequest = new Builder().nameToken(NameTokens.getDetailMatterAction())
                                                 .with("id", String.valueOf(matterActionDto.getId()))
                                                 .build();

        placeManager.revealPlace(placeRequest);
    }
    
    @Override
    public void onEdit(MatterActionDto matterActionDto) {
        editingMatterAction = matterActionDto;
        editMatterActionPresenter.edit(matterActionDto);
    }
    

    @ProxyEvent
    @Override
    public void onMatterActionAdded(MatterActionAddedEvent event) {
    	if (editingMatterAction != null) {
            getView().replaceMatterAction(editingMatterAction, event.getMatterAction());
        } else {
        	 getView().addMatterAction(event.getMatterAction());
        }

        editingMatterAction = event.getMatterAction();
        
    }

    @Override
    protected void onReveal() {
        ActionBarVisibilityEvent.fire(this, true);
        ChangeActionBarEvent.fire(this, Arrays.asList(ActionType.ADD), true);

        dispatcher.execute(matterActionService.getMatterActions(), new AbstractAsyncCallback<List<MatterActionDto>>() {
            @Override
            public void onSuccess(List<MatterActionDto> matterActions) {
                getView().displayMatterActions(matterActions);
            }
        });
    }

    @Override
    protected void onBind() {
        addRegisteredHandler(ActionBarEvent.getType(), this);
    }
}
