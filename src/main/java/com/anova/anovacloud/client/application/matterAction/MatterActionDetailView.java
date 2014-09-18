

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
import com.anova.anovacloud.client.application.attorney.ui.AttorneyRenderer;
import com.anova.anovacloud.client.application.attorneyRole.ui.AttorneyRoleRenderer;
import com.anova.anovacloud.client.application.matterActionStatus.ui.MatterActionStatusRenderer;
import com.anova.anovacloud.client.application.matters.matter.MatterRenderer;
import com.anova.anovacloud.shared.dto.AttorneyDto;
import com.anova.anovacloud.shared.dto.AttorneyRoleDto;
import com.anova.anovacloud.shared.dto.MatterActionStatusDto;
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
    TextBox actionRemarks;
    @UiField(provided = true)
    ValueListBox<MatterDto> matter;
    @UiField(provided = true)
    ValueListBox<AttorneyDto> assignee1;
    @UiField(provided = true)
    ValueListBox<AttorneyDto> assignee2;
    @UiField(provided = true)
    ValueListBox<AttorneyDto> assignee3;
    @UiField(provided = true)
    ValueListBox<AttorneyRoleDto> assignee1Role;
    @UiField(provided = true)
    ValueListBox<AttorneyRoleDto> assignee2Role;
    @UiField(provided = true)
    ValueListBox<AttorneyRoleDto> assignee3Role;
    @UiField(provided = true)
    ValueListBox<MatterActionStatusDto> actionStatus;
    
    private final Driver driver;

    @Inject
    public MatterActionDetailView(Binder uiBinder,
                            Driver driver) {
        this.driver = driver;

        matter = new ValueListBox<>(new MatterRenderer());
        assignee1 = new ValueListBox<>(new AttorneyRenderer());
        assignee2 = new ValueListBox<>(new AttorneyRenderer());
        assignee3 = new ValueListBox<>(new AttorneyRenderer());
        assignee1Role = new ValueListBox<>(new AttorneyRoleRenderer());
        assignee2Role = new ValueListBox<>(new AttorneyRoleRenderer());
        assignee3Role = new ValueListBox<>(new AttorneyRoleRenderer());
        actionStatus = new ValueListBox<>(new MatterActionStatusRenderer());
        
        initWidget(uiBinder.createAndBindUi(this));

        driver.initialize(this);

        dueDate.getElement().setAttribute("placeholder", "dueDate");
        actionDue.getElement().setAttribute("placeholder", "actionDue");
        ptoMailDate.getElement().setAttribute("placeholder", "ptoMailDate");
        responseDate.getElement().setAttribute("placeholder", "responseDate");
        takenDate.getElement().setAttribute("placeholder", "takenDate");
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
    public void setAllowedMatterActionStatuss(List<MatterActionStatusDto> actionStatusDtos) {
        actionStatus.setValue(actionStatusDtos.isEmpty() ? null : actionStatusDtos.get(0));
        actionStatus.setAcceptableValues(actionStatusDtos);
    }
    
    @Override
    public void setAllowedAttorneys(List<AttorneyDto> attorneyDtos) {
        assignee1.setValue(attorneyDtos.isEmpty() ? null : attorneyDtos.get(0));
        assignee1.setAcceptableValues(attorneyDtos);
        assignee2.setValue(attorneyDtos.isEmpty() ? null : attorneyDtos.get(0));
        assignee2.setAcceptableValues(attorneyDtos);
        assignee3.setValue(attorneyDtos.isEmpty() ? null : attorneyDtos.get(0));
        assignee3.setAcceptableValues(attorneyDtos);
    }
    
    @Override
    public void setAllowedAttorneyRoles(List<AttorneyRoleDto> attorneyRoleDtos) {
        assignee1Role.setValue(attorneyRoleDtos.isEmpty() ? null : attorneyRoleDtos.get(0));
        assignee1Role.setAcceptableValues(attorneyRoleDtos);
        assignee2Role.setValue(attorneyRoleDtos.isEmpty() ? null : attorneyRoleDtos.get(0));
        assignee2Role.setAcceptableValues(attorneyRoleDtos);
        assignee3Role.setValue(attorneyRoleDtos.isEmpty() ? null : attorneyRoleDtos.get(0));
        assignee3Role.setAcceptableValues(attorneyRoleDtos);
    }

    @Override
    public void getMatterAction() {
        getUiHandlers().onSave(driver.flush());
    }
}
