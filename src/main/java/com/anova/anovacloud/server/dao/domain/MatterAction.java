

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
    private String actionRemarks;

    @Load
    private Ref<Matter> matter;
    @Load
    private Ref<Attorney> assignee1;
    @Load
    private Ref<Attorney> assignee2;
    @Load
    private Ref<Attorney> assignee3;
    @Load
    private Ref<AttorneyRole> assignee1Role;
    @Load
    private Ref<AttorneyRole> assignee2Role;
    @Load
    private Ref<AttorneyRole> assignee3Role;
    @Load
    private Ref<MatterActionStatus> actionStatus;
    
    public MatterAction() {
    }

    public Matter getMatter() {
        return Deref.deref(matter);
    }

    public void setMatter(Matter matter) {
    	if(matter != null){
    		this.matter = Ref.create(matter);
    	}else {
    		this.matter = null;
    	}
    	
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
    
    
    public Attorney getAssignee1() {
		return Deref.deref(assignee1);
	}

	public void setAssignee1(Attorney assignee1) {
		if (assignee1 != null) {
            this.assignee1 = Ref.create(assignee1);
        } else {
            this.assignee1 = null;
        }
	}

	public Attorney getAssignee2() {
		return Deref.deref(assignee2);
	}

	public void setAssignee2(Attorney assignee2) {
		if (assignee2 != null) {
            this.assignee2 = Ref.create(assignee2);
        } else {
            this.assignee2 = null;
        }
	}

	public Attorney getAssignee3() {
		return Deref.deref(assignee3);
	}

	public void setAssignee3(Attorney assignee3) {
		if (assignee3 != null) {
            this.assignee3 = Ref.create(assignee3);
        } else {
            this.assignee3 = null;
        }
	}

	public AttorneyRole getAssignee1Role() {
		return Deref.deref(assignee1Role);
	}

	public void setAssignee1Role(AttorneyRole assignee1Role) {
		if (assignee1Role != null) {
            this.assignee1Role = Ref.create(assignee1Role);
        } else {
            this.assignee1Role = null;
        }
	}

	public AttorneyRole getAssignee2Role() {
		return Deref.deref(assignee2Role);
	}

	public void setAssignee2Role(AttorneyRole assignee2Role) {
		if (assignee2Role != null) {
            this.assignee2Role = Ref.create(assignee2Role);
        } else {
            this.assignee2Role = null;
        }
	}

	public AttorneyRole getAssignee3Role() {
		return Deref.deref(assignee3Role);
	}

	public void setAssignee3Role(AttorneyRole assignee3Role) {
		if (assignee3Role != null) {
            this.assignee3Role = Ref.create(assignee3Role);
        } else {
            this.assignee3Role = null;
        }
	}

	public MatterActionStatus getActionStatus() {
		return Deref.deref(actionStatus);
	}

	public void setActionStatus(MatterActionStatus actionStatus) {
		if (actionStatus != null) {
            this.actionStatus = Ref.create(actionStatus);
        } else {
            this.actionStatus = null;
        }
	}

	public String getActionRemarks() {
        return actionRemarks;
    }

    public void setActionRemarks(String actionRemarks) {
        this.actionRemarks = actionRemarks;
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
        actionDto.setAssignee1(Attorney.createDto(action.getAssignee1()));
        actionDto.setAssignee1Role(AttorneyRole.createDto(action.getAssignee1Role()));
        actionDto.setAssignee2(Attorney.createDto(action.getAssignee2()));
        actionDto.setAssignee2Role(AttorneyRole.createDto(action.getAssignee2Role()));
        actionDto.setAssignee3(Attorney.createDto(action.getAssignee3()));
        actionDto.setAssignee3Role(AttorneyRole.createDto(action.getAssignee3Role()));
        actionDto.setActionRemarks(action.getActionRemarks());
        actionDto.setActionStatus(MatterActionStatus.createDto(action.getActionStatus()));
        
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
        action.setAssignee1(Attorney.create(actionDto.getAssignee1()));
        action.setAssignee1Role(AttorneyRole.create(actionDto.getAssignee1Role()));
        action.setAssignee2(Attorney.create(actionDto.getAssignee2()));
        action.setAssignee2Role(AttorneyRole.create(actionDto.getAssignee2Role()));
        action.setAssignee3(Attorney.create(actionDto.getAssignee3()));
        action.setAssignee3Role(AttorneyRole.create(actionDto.getAssignee3Role()));
        action.setActionRemarks(actionDto.getActionRemarks());
        action.setActionStatus(MatterActionStatus.create(actionDto.getActionStatus()));
        return action;
    }
}
