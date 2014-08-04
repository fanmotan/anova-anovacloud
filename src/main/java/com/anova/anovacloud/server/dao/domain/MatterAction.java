

package com.anova.anovacloud.server.dao.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Load;
import com.anova.anovacloud.server.dao.objectify.Deref;
import com.anova.anovacloud.shared.dto.BaseEntity;
import com.anova.anovacloud.shared.dto.MatterActionDto;

@Index
@Entity
public class MatterAction extends BaseEntity {
	private Date dueDate;
    private String actionDue;
    private Date ptoMailDate;
    private Date responseDate;
    private Date takenDate;
    private String assignee1;
    private String assignee1Role;
    private String assignee2;
    private String assignee2Role;
    private String assignee3;
    private String assignee3Role;
    private String actionRemarks;
    private String createBy;
    private Date createDate;
    private String updateBy;
    private Date updateDate;

    @Load
    private Ref<Matter> matter;

    public MatterAction() {
    }

    public Matter getMatter() {
        return Deref.deref(matter);
    }

    public void setMatter(Matter matter) {
        this.matter = Ref.create(matter);
    }

    
    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    public String getActionDue() {
        return actionDue;
    }

    public void setActionDue(String actionDue) {
        this.actionDue = actionDue;
    }
    public Date getPtoMailDate() {
        return ptoMailDate;
    }

    public void setPtoMailDate(Date ptoMailDate) {
        this.ptoMailDate = ptoMailDate;
    }
    
    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }
    
    public Date getTakenDate() {
        return takenDate;
    }

    public void setTakenDate(Date takenDate) {
        this.takenDate = takenDate;
    }
    
    public String getAssignee1() {
        return assignee1;
    }

    public void setAssignee1(String assignee1) {
        this.assignee1 = assignee1;
    }
    public String getAssignee1Role() {
        return assignee1Role;
    }

    public void setAssignee1Role(String assignee1Role) {
        this.assignee1Role = assignee1Role;
    }
    public String getAssignee2() {
        return assignee2;
    }

    public void setAssignee2(String assignee2) {
        this.assignee2 = assignee2;
    }
    public String getAssignee2Role() {
        return assignee2Role;
    }

    public void setAssignee2Role(String assignee2Role) {
        this.assignee2Role = assignee2Role;
    }
    public String getAssignee3() {
        return assignee3;
    }

    public void setAssignee3(String assignee3) {
        this.assignee3 = assignee3;
    }
    public String getAssignee3Role() {
        return assignee3Role;
    }

    public void setAssignee3Role(String assignee3Role) {
        this.assignee3Role = assignee3Role;
    }
    
    public String getActionRemarks() {
        return actionRemarks;
    }

    public void setActionRemarks(String actionRemarks) {
        this.actionRemarks = actionRemarks;
    }
    
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
    
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    

    public static List<MatterActionDto> createDto(List<MatterAction> actions) {
        if (actions == null) {
            return null;
        }

        List<MatterActionDto> actionsDto = new ArrayList<>();
        for (MatterAction action : actions) {
            actionsDto.add(createDto(action));
        }

        return actionsDto;
    }

    public static MatterActionDto createDto(MatterAction action) {
        if (action == null) {
            return null;
        }

        MatterActionDto actionDto = new MatterActionDto();
        actionDto.setMatter(Matter.createDto(action.getMatter()));
        actionDto.setId(action.getId());
        actionDto.setActionDue(action.getActionDue());
        actionDto.setDueDate(action.getDueDate());
        actionDto.setPtoMailDate(action.getPtoMailDate());
        actionDto.setResponseDate(action.getResponseDate());
        actionDto.setTakenDate(action.getTakenDate());
        actionDto.setAssignee1(action.getAssignee1());
        actionDto.setAssignee1Role(action.getAssignee1Role());
        actionDto.setAssignee2(action.getAssignee2());
        actionDto.setAssignee2Role(action.getAssignee2Role());
        actionDto.setAssignee3(action.getAssignee3());
        actionDto.setAssignee3Role(action.getAssignee3Role());
        actionDto.setActionRemarks(action.getActionRemarks());
        actionDto.setCreateBy(action.getCreateBy());
        actionDto.setCreateDate(action.getCreateDate());
        actionDto.setUpdateBy(action.getUpdateBy());
        actionDto.setUpdateDate(action.getUpdateDate());

        return actionDto;
    }

    public static MatterAction create(MatterActionDto actionDto) {
        if (actionDto == null) {
            return null;
        }

        MatterAction action = new MatterAction();
        action.setMatter(Matter.create(actionDto.getMatter()));
        action.setId(actionDto.getId());
        action.setActionDue(actionDto.getActionDue());
        action.setDueDate(actionDto.getDueDate());
        action.setPtoMailDate(actionDto.getPtoMailDate());
        action.setResponseDate(actionDto.getResponseDate());
        action.setTakenDate(actionDto.getTakenDate());
        action.setAssignee1(actionDto.getAssignee1());
        action.setAssignee1Role(actionDto.getAssignee1Role());
        action.setAssignee2(actionDto.getAssignee2());
        action.setAssignee2Role(actionDto.getAssignee2Role());
        action.setAssignee3(actionDto.getAssignee3());
        action.setAssignee3Role(actionDto.getAssignee3Role());
        action.setActionRemarks(actionDto.getActionRemarks());
        action.setCreateBy(actionDto.getCreateBy());
        action.setCreateDate(actionDto.getCreateDate());
        action.setUpdateBy(actionDto.getUpdateBy());
        action.setUpdateDate(actionDto.getUpdateDate());

        return action;
    }
}
