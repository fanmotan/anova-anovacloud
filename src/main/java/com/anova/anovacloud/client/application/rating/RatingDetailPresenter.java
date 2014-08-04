

package com.anova.anovacloud.client.application.rating;

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
import com.anova.anovacloud.client.application.rating.RatingDetailPresenter.MyProxy;
import com.anova.anovacloud.client.application.rating.RatingDetailPresenter.MyView;
import com.anova.anovacloud.client.application.widget.message.Message;
import com.anova.anovacloud.client.application.widget.message.MessageStyle;
import com.anova.anovacloud.client.place.NameTokens;
import com.anova.anovacloud.client.resources.EditRatingMessages;
import com.anova.anovacloud.client.rest.MattersService;
import com.anova.anovacloud.client.rest.RatingService;
import com.anova.anovacloud.client.util.AbstractAsyncCallback;
import com.anova.anovacloud.client.util.ErrorHandlerAsyncCallback;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.anova.anovacloud.shared.dto.RatingDto;
import com.gwtplatform.dispatch.rest.shared.RestDispatch;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest.Builder;

public class RatingDetailPresenter extends Presenter<MyView, MyProxy>
        implements RatingDetailUiHandlers, ActionBarEvent.ActionBarHandler, GoBackEvent.GoBackHandler {

    interface MyView extends View, HasUiHandlers<RatingDetailUiHandlers> {
        void edit(RatingDto ratingDto);

        void setAllowedMatters(List<MatterDto> matterDtos);

        void getRating();
    }

    @ProxyCodeSplit
    @NameToken(NameTokens.DETAIL_RATING)
    interface MyProxy extends ProxyPlace<RatingDetailPresenter> {
    }

    private final RestDispatch dispatcher;
    private final MattersService mattersService;
    private final RatingService ratingService;
    private final EditRatingMessages messages;
    private final PlaceManager placeManager;

    @Inject
    RatingDetailPresenter(EventBus eventBus,
                          MyView view,
                          MyProxy proxy,
                          RestDispatch dispatcher,
                          MattersService mattersService,
                          RatingService ratingService,
                          EditRatingMessages messages,
                          PlaceManager placeManager) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN_CONTENT);

        this.dispatcher = dispatcher;
        this.mattersService = mattersService;
        this.ratingService = ratingService;
        this.messages = messages;
        this.placeManager = placeManager;

        getView().setUiHandlers(this);
    }

    @Override
    public void onGoBack(GoBackEvent event) {
        placeManager.revealPlace(new Builder().nameToken(NameTokens.getRating()).build());
    }

    @Override
    public void onActionEvent(ActionBarEvent event) {
        if (event.getActionType() == ActionType.DONE && event.isTheSameToken(NameTokens.getDetailRating())) {
            getView().getRating();
        }
    }

    @Override
    public void onSave(RatingDto ratingDto) {
        dispatcher.execute(ratingService.saveOrCreate(ratingDto), new ErrorHandlerAsyncCallback<RatingDto>(this) {
            @Override
            public void onSuccess(RatingDto savedRating) {
                DisplayMessageEvent.fire(RatingDetailPresenter.this, new Message(messages.ratingSaved(),
                        MessageStyle.SUCCESS));
                placeManager.revealPlace(new Builder().nameToken(NameTokens.getRating()).build());
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
    }

    private void onGetMattersSuccess(List<MatterDto> matterDtos) {
        getView().setAllowedMatters(matterDtos);
        getView().edit(new RatingDto());
    }
}
