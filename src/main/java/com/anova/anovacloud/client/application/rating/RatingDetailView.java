

package com.anova.anovacloud.client.application.rating;

import java.util.List;

import javax.inject.Inject;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.client.ui.Widget;
import com.anova.anovacloud.client.application.matters.matter.MatterRenderer;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.anova.anovacloud.shared.dto.RatingDto;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class RatingDetailView extends ViewWithUiHandlers<RatingDetailUiHandlers>
        implements RatingDetailPresenter.MyView, Editor<RatingDto> {
    interface Binder extends UiBinder<Widget, RatingDetailView> {
    }

    interface Driver extends SimpleBeanEditorDriver<RatingDto, RatingDetailView> {
    }

    @UiField
    IntegerBox rating;
    @UiField(provided = true)
    ValueListBox<MatterDto> matter;

    private final Driver driver;

    @Inject
    public RatingDetailView(Binder uiBinder,
                            Driver driver) {
        this.driver = driver;

        matter = new ValueListBox<>(new MatterRenderer());

        initWidget(uiBinder.createAndBindUi(this));

        driver.initialize(this);

        rating.getElement().setAttribute("placeholder", "Your rating");
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

    @Override
    public void getRating() {
        getUiHandlers().onSave(driver.flush());
    }
}
