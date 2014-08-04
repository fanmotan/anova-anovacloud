

package com.anova.anovacloud.client.application.rating.ui;

import java.util.List;

import javax.inject.Inject;

import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.event.DisplayMessageEvent;
import com.anova.anovacloud.client.application.rating.event.RatingAddedEvent;
import com.anova.anovacloud.client.application.rating.ui.EditRatingPresenter.MyView;
import com.anova.anovacloud.client.application.widget.message.Message;
import com.anova.anovacloud.client.application.widget.message.MessageStyle;
import com.anova.anovacloud.client.resources.EditRatingMessages;
import com.anova.anovacloud.client.rest.MattersService;
import com.anova.anovacloud.client.rest.RatingService;
import com.anova.anovacloud.client.util.AbstractAsyncCallback;
import com.anova.anovacloud.client.util.ErrorHandlerAsyncCallback;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.anova.anovacloud.shared.dto.RatingDto;
import com.gwtplatform.dispatch.rest.shared.RestDispatch;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.PopupView;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.proxy.RevealRootPopupContentEvent;

public class EditRatingPresenter extends PresenterWidget<MyView> implements EditRatingUiHandlers {
    public interface MyView extends PopupView, HasUiHandlers<EditRatingUiHandlers> {
        void edit(RatingDto ratingDto);

        void setAllowedMatters(List<MatterDto> matterDtos);
    }

    private final RestDispatch dispatcher;
    private final MattersService mattersService;
    private final RatingService ratingService;
    private final EditRatingMessages messages;

    @Inject
    EditRatingPresenter(EventBus eventBus,
                        MyView view,
                        RestDispatch dispatcher,
                        MattersService mattersService,
                        RatingService ratingService,
                        EditRatingMessages messages) {
        super(eventBus, view);

        this.dispatcher = dispatcher;
        this.mattersService = mattersService;
        this.ratingService = ratingService;
        this.messages = messages;

        getView().setUiHandlers(this);
    }

    @Override
    public void createNew() {
        reveal();
    }

    @Override
    public void onCancel() {
        getView().hide();
    }

    @Override
    public void onSave(RatingDto ratingDto) {
        dispatcher.execute(ratingService.saveOrCreate(ratingDto), new ErrorHandlerAsyncCallback<RatingDto>(this) {
            @Override
            public void onSuccess(RatingDto savedRating) {
                DisplayMessageEvent.fire(EditRatingPresenter.this, new Message(messages.ratingSaved(),
                        MessageStyle.SUCCESS));
                RatingAddedEvent.fire(EditRatingPresenter.this, savedRating);
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
    }

    private void onGetMattersSuccess(List<MatterDto> matterDtos) {
        getView().setAllowedMatters(matterDtos);
        getView().edit(new RatingDto());
        RevealRootPopupContentEvent.fire(this, this);
    }
}
