

package com.anova.anovacloud.client.application.matterAction.ui;

import java.util.List;

import javax.inject.Inject;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.matters.matter.MatterRenderer;
import com.anova.anovacloud.client.application.matterAction.ui.EditMatterActionPresenter.MyView;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.anova.anovacloud.shared.dto.MatterActionDto;
import com.gwtplatform.mvp.client.PopupViewWithUiHandlers;

public class EditMatterActionView extends PopupViewWithUiHandlers<EditMatterActionUiHandlers> implements MyView, Editor<MatterActionDto> {
    interface Binder extends UiBinder<Widget, EditMatterActionView> {
    }

    interface Driver extends SimpleBeanEditorDriver<MatterActionDto, EditMatterActionView> {
    }

    @UiField
    DateBox dueDate;
    @UiField
    TextBox actionDue;
    @UiField
    DateBox ptoMailDate;
    @UiField
    DateBox responseDate;
    @UiField
    DateBox takenDate;
    @UiField
    TextBox assignee1;
    @UiField
    TextBox assignee1Role;
    @UiField
    TextBox assignee2;
    @UiField
    TextBox assignee2Role;
    @UiField
    TextBox assignee3;
    @UiField
    TextBox assignee3Role;
    @UiField
    TextBox actionRemarks;
    
    @UiField(provided = true)
    ValueListBox<MatterDto> matter;

    private final Driver driver;

    @Inject
    EditMatterActionView(Binder uiBinder,
                   Driver driver,
                   EventBus eventBus) {
        super(eventBus);

        matter = new ValueListBox<>(new MatterRenderer());
        this.driver = driver;

        initWidget(uiBinder.createAndBindUi(this));

        driver.initialize(this);
    }

    @Override
    public void edit(MatterActionDto matterActionDto) {
        if (matterActionDto.getMatter() == null) {
            matterActionDto.setMatter(matter.getValue());
        }

        driver.edit(matterActionDto);
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
