

package com.anova.anovacloud.client.application.rating.ui;

import java.util.List;

import javax.inject.Inject;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.matters.matter.MatterRenderer;
import com.anova.anovacloud.client.application.rating.ui.EditRatingPresenter.MyView;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.anova.anovacloud.shared.dto.RatingDto;
import com.gwtplatform.mvp.client.PopupViewWithUiHandlers;

public class EditRatingView extends PopupViewWithUiHandlers<EditRatingUiHandlers> implements MyView, Editor<RatingDto> {
    interface Binder extends UiBinder<Widget, EditRatingView> {
    }

    interface Driver extends SimpleBeanEditorDriver<RatingDto, EditRatingView> {
    }

    @UiField
    IntegerBox rating;
    @UiField(provided = true)
    ValueListBox<MatterDto> matter;

    private final Driver driver;

    @Inject
    EditRatingView(Binder uiBinder,
                   Driver driver,
                   EventBus eventBus) {
        super(eventBus);

        matter = new ValueListBox<>(new MatterRenderer());
        this.driver = driver;

        initWidget(uiBinder.createAndBindUi(this));

        driver.initialize(this);
    }

    @Override
    public void edit(RatingDto ratingDto) {
        if (ratingDto.getMatter() == null) {
            ratingDto.setMatter(matter.getValue());
        }

        driver.edit(ratingDto);
    }

    @Override
    public void setAllowedMatters(List<MatterDto> matterDtos) {
        matter.setValue(matterDtos.isEmpty() ? null : matterDtos.get(0));
        matter.setAcceptableValues(matterDtos);
    }

    @UiHandler("save")
    void onSaveClicked(ClickEvent ignored) {
        getUiHandlers().onSave(driver.flush());
    }

    @UiHandler("close")
    void onCancelClicked(ClickEvent ignored) {
        getUiHandlers().onCancel();
    }
}
