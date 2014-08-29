

package com.anova.anovacloud.client.application.matterAction;

import java.util.List;

import javax.inject.Inject;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.anova.anovacloud.client.application.matters.matter.MatterRenderer;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.anova.anovacloud.shared.dto.MatterActionDto;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class MatterActionDetailView extends ViewWithUiHandlers<MatterActionDetailUiHandlers>
        implements MatterActionDetailPresenter.MyView, Editor<MatterActionDto> {
    interface Binder extends UiBinder<Widget, MatterActionDetailView> {
    }

    interface Driver extends SimpleBeanEditorDriver<MatterActionDto, MatterActionDetailView> {
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
    public MatterActionDetailView(Binder uiBinder,
                            Driver driver) {
        this.driver = driver;

        matter = new ValueListBox<>(new MatterRenderer());

        initWidget(uiBinder.createAndBindUi(this));

        driver.initialize(this);

        dueDate.getElement().setAttribute("placeholder", "dueDate");
        actionDue.getElement().setAttribute("placeholder", "actionDue");
        ptoMailDate.getElement().setAttribute("placeholder", "ptoMailDate");
        responseDate.getElement().setAttribute("placeholder", "responseDate");
        takenDate.getElement().setAttribute("placeholder", "takenDate");
        assignee1.getElement().setAttribute("placeholder", "assignee1");
        assignee1Role.getElement().setAttribute("placeholder", "assignee1Role");
        
        assignee2.getElement().setAttribute("placeholder", "assignee2");
        assignee2Role.getElement().setAttribute("placeholder", "assignee2Role");
        assignee3.getElement().setAttribute("placeholder", "assignee3");
        assignee3Role.getElement().setAttribute("placeholder", "assignee3Role");
        actionRemarks.getElement().setAttribute("placeholder", "actionRemarks");
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

    @Override
    public void getMatterAction() {
        getUiHandlers().onSave(driver.flush());
    }
}
