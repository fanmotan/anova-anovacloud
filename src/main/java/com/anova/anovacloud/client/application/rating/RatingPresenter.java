
package com.anova.anovacloud.client.application.rating;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.ApplicationPresenter;
import com.anova.anovacloud.client.application.event.ActionBarEvent;
import com.anova.anovacloud.client.application.event.ActionBarVisibilityEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent.ActionType;
import com.anova.anovacloud.client.application.rating.event.RatingAddedEvent;
import com.anova.anovacloud.client.application.rating.event.RatingAddedEvent.RatingAddedHandler;
import com.anova.anovacloud.client.application.rating.ui.EditRatingPresenter;
import com.anova.anovacloud.client.place.NameTokens;
import com.anova.anovacloud.client.rest.RatingService;
import com.anova.anovacloud.client.util.AbstractAsyncCallback;
import com.anova.anovacloud.shared.dto.RatingDto;
import com.gwtplatform.dispatch.rest.shared.RestDispatch;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.ProxyEvent;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest.Builder;

public class RatingPresenter extends Presenter<RatingPresenter.MyView, RatingPresenter.MyProxy>
        implements RatingUiHandlers, RatingAddedHandler, ActionBarEvent.ActionBarHandler {

    interface MyView extends View, HasUiHandlers<RatingUiHandlers> {
        void displayRatings(List<RatingDto> results);

        void removeRating(RatingDto ratingDto);

        void addRating(RatingDto ratingDto);
    }

    @ProxyCodeSplit
    @NameToken(NameTokens.RATING)
    interface MyProxy extends ProxyPlace<RatingPresenter> {
    }

    private final RestDispatch dispatcher;
    private final EditRatingPresenter editRatingPresenter;
    private final RatingService ratingService;
    private final PlaceManager placeManager;

    @Inject
    RatingPresenter(EventBus eventBus,
                    MyView view,
                    MyProxy proxy,
                    RestDispatch dispatcher,
                    RatingService ratingService,
                    EditRatingPresenter editRatingPresenter,
                    PlaceManager placeManager) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN_CONTENT);

        this.dispatcher = dispatcher;
        this.ratingService = ratingService;
        this.placeManager = placeManager;
        this.editRatingPresenter = editRatingPresenter;

        getView().setUiHandlers(this);
    }

    @Override
    public void onActionEvent(ActionBarEvent event) {
        if (event.getActionType() == ActionType.ADD && event.isTheSameToken(NameTokens.getRating())) {
            placeManager.revealPlace(new Builder().nameToken(NameTokens.getDetailRating()).build());
        }
    }

    @Override
    public void onCreate() {
        editRatingPresenter.createNew();
    }

    @Override
    public void onDelete(final RatingDto ratingDto) {
        dispatcher.execute(ratingService.delete(ratingDto.getId()), new AbstractAsyncCallback<Void>() {
            @Override
            public void onSuccess(Void nothing) {
                getView().removeRating(ratingDto);
            }
        });
    }

    @ProxyEvent
    @Override
    public void onRatingAdded(RatingAddedEvent event) {
        getView().addRating(event.getRating());
    }

    @Override
    protected void onReveal() {
        ActionBarVisibilityEvent.fire(this, true);
        ChangeActionBarEvent.fire(this, Arrays.asList(ActionType.ADD), true);

        dispatcher.execute(ratingService.getRatings(), new AbstractAsyncCallback<List<RatingDto>>() {
            @Override
            public void onSuccess(List<RatingDto> ratings) {
                getView().displayRatings(ratings);
            }
        });
    }

    @Override
    protected void onBind() {
        addRegisteredHandler(ActionBarEvent.getType(), this);
    }
}
