

package com.anova.anovacloud.client.application.matterAction;

import java.util.Collections;
import java.util.Comparator;
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
        initWidget(uiBinder.createAndBindUi(this));
        matter = new ValueListBox<>(new MatterRenderer());
        assignee1 = new ValueListBox<>(new AttorneyRenderer());
        assignee2 = new ValueListBox<>(new AttorneyRenderer());
        assignee3 = new ValueListBox<>(new AttorneyRenderer());
        assignee1Role = new ValueListBox<>(new AttorneyRoleRenderer());
        assignee2Role = new ValueListBox<>(new AttorneyRoleRenderer());
        assignee3Role = new ValueListBox<>(new AttorneyRoleRenderer());
        actionStatus = new ValueListBox<>(new MatterActionStatusRenderer());
       
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
        if (matterActionDto.getActionStatus() == null) {
            matterActionDto.setActionStatus(actionStatus.getValue());
        }
        
        if (matterActionDto.getAssignee1() == null) {
            matterActionDto.setAssignee1(assignee1.getValue());
        }
        if (matterActionDto.getAssignee2() == null) {
            matterActionDto.setAssignee2(assignee2.getValue());
        }
        if (matterActionDto.getAssignee3() == null) {
            matterActionDto.setAssignee3(assignee3.getValue());
        }
        if (matterActionDto.getAssignee1Role() == null) {
            matterActionDto.setAssignee1Role(assignee1Role.getValue());
        }
        if (matterActionDto.getAssignee2Role() == null) {
            matterActionDto.setAssignee2Role(assignee2Role.getValue());
        }
        if (matterActionDto.getAssignee3Role() == null) {
            matterActionDto.setAssignee3Role(assignee3Role.getValue());
        }
        
       // matter.setFocus(true);
        
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
    public void setAllowedAttorney1s(List<AttorneyDto> attorneyDtos) {
    	Collections.sort(attorneyDtos, new Comparator<AttorneyDto>() {
		    public int compare(AttorneyDto c1, AttorneyDto c2) {
		        return c1.getDisplayName().compareTo(c2.getDisplayName());
		    }
		});
        assignee1.setValue(attorneyDtos.isEmpty() ? null : attorneyDtos.get(0));
        assignee1.setAcceptableValues(attorneyDtos);
      
    }
    @Override
    public void setAllowedAttorney2s(List<AttorneyDto> attorneyDtos) {
    	Collections.sort(attorneyDtos, new Comparator<AttorneyDto>() {
		    public int compare(AttorneyDto c1, AttorneyDto c2) {
		        return c1.getDisplayName().compareTo(c2.getDisplayName());
		    }
		});
       
        assignee2.setValue(attorneyDtos.isEmpty() ? null : attorneyDtos.get(0));
        assignee2.setAcceptableValues(attorneyDtos);
        
    }
    @Override
    public void setAllowedAttorney3s(List<AttorneyDto> attorneyDtos) {
    	Collections.sort(attorneyDtos, new Comparator<AttorneyDto>() {
		    public int compare(AttorneyDto c1, AttorneyDto c2) {
		        return c1.getDisplayName().compareTo(c2.getDisplayName());
		    }
		});
       
        assignee3.setValue(attorneyDtos.isEmpty() ? null : attorneyDtos.get(0));
        assignee3.setAcceptableValues(attorneyDtos);
    }
   
    
    @Override
    public void setAllowedAttorney1Roles(List<AttorneyRoleDto> attorneyRoleDtos) {
    	Collections.sort(attorneyRoleDtos, new Comparator<AttorneyRoleDto>() {
		    public int compare(AttorneyRoleDto c1, AttorneyRoleDto c2) {
		        return c1.getRoleValue().compareTo(c2.getRoleValue());
		    }
		});
        assignee1Role.setValue(attorneyRoleDtos.isEmpty() ? null : attorneyRoleDtos.get(0));
        assignee1Role.setAcceptableValues(attorneyRoleDtos);
        assignee2Role.setValue(attorneyRoleDtos.isEmpty() ? null : attorneyRoleDtos.get(0));
        assignee2Role.setAcceptableValues(attorneyRoleDtos);
        assignee3Role.setValue(attorneyRoleDtos.isEmpty() ? null : attorneyRoleDtos.get(0));
        assignee3Role.setAcceptableValues(attorneyRoleDtos);
    }
    @Override
    public void setAllowedAttorney2Roles(List<AttorneyRoleDto> attorneyRoleDtos) {
    	Collections.sort(attorneyRoleDtos, new Comparator<AttorneyRoleDto>() {
		    public int compare(AttorneyRoleDto c1, AttorneyRoleDto c2) {
		        return c1.getRoleValue().compareTo(c2.getRoleValue());
		    }
		});
       
        assignee2Role.setValue(attorneyRoleDtos.isEmpty() ? null : attorneyRoleDtos.get(0));
        assignee2Role.setAcceptableValues(attorneyRoleDtos);
        
    }
    @Override
    public void setAllowedAttorney3Roles(List<AttorneyRoleDto> attorneyRoleDtos) {
    	Collections.sort(attorneyRoleDtos, new Comparator<AttorneyRoleDto>() {
		    public int compare(AttorneyRoleDto c1, AttorneyRoleDto c2) {
		        return c1.getRoleValue().compareTo(c2.getRoleValue());
		    }
		});
       
        assignee3Role.setValue(attorneyRoleDtos.isEmpty() ? null : attorneyRoleDtos.get(0));
        assignee3Role.setAcceptableValues(attorneyRoleDtos);
    }
    
    @Override
    public void getMatterAction() {
        getUiHandlers().onSave(driver.flush());
    }
}
