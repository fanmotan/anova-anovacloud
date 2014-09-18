

package com.anova.anovacloud.shared.dto;
import java.util.Date;

import com.anova.anovacloud.client.columninitializer.Column;
import com.anova.anovacloud.server.dao.domain.Attorney;
import com.anova.anovacloud.server.dao.domain.AttorneyRole;
import com.google.gwt.cell.client.DateCell;
import com.google.gwt.cell.client.TextCell;

public class MatterActionDto extends BaseEntity {
    private Date dueDate;
    private String actionDue;
    private Date ptoMailDate;
    private Date responseDate;
    private Date takenDate;
    private AttorneyDto assignee1;
    private AttorneyRoleDto assignee1Role;
    private AttorneyDto assignee2;
    private AttorneyRoleDto assignee2Role;
    private AttorneyDto assignee3;
    private AttorneyRoleDto assignee3Role;
    private String atty;
    private String actionRemarks;
    private String createBy;
    private Date createDate;
    private String updateBy;
    private Date updateDate; 
    private MatterDto matter;
    private MatterActionStatusDto actionStatus;

    public MatterActionDto() {
    }

    public MatterActionDto(MatterDto matter, Date dueDate, String actionDue, Date ptoMailDate, Date responseDate,
    						Date takenDate, AttorneyDto assignee1, AttorneyRoleDto assignee1Role, AttorneyDto assignee2, 
    						AttorneyRoleDto assignee2Role, AttorneyDto assignee3, AttorneyRoleDto assignee3Role, String actionRemarks,
    						String createBy, Date createDate, String updateBy, Date updateDate, MatterActionStatusDto actionStatus) {
        this.matter = matter;
        this.dueDate = dueDate;
        this.actionDue = actionDue;
        this.ptoMailDate = ptoMailDate;
        this.responseDate = responseDate;
        this.takenDate = takenDate;
        this.assignee1 = assignee1;
        this.assignee1Role = assignee1Role;
        this.assignee2 = assignee2;
        this.assignee2Role = assignee2Role;
        this.assignee3 = assignee3;
        this.assignee3Role = assignee3Role;
        this.atty = this.assignee1+"/"+this.assignee1Role+";"+this.assignee2+"/"+this.assignee2Role+";"+this.assignee3+"/"+this.assignee3Role;
        this.actionRemarks = actionRemarks;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
        this.actionStatus = actionStatus;
        
    }

    public MatterDto getMatter() {
        return matter;
    }

    public void setMatter(MatterDto matter) {
        this.matter = matter;
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
    
   
    
    public AttorneyDto getAssignee1() {
		return assignee1;
	}

	public void setAssignee1(AttorneyDto assignee1) {
		this.assignee1 = assignee1;
	}

	public AttorneyRoleDto getAssignee1Role() {
		return assignee1Role;
	}

	public void setAssignee1Role(AttorneyRoleDto assignee1Role) {
		this.assignee1Role = assignee1Role;
	}

	public AttorneyDto getAssignee2() {
		return assignee2;
	}

	public void setAssignee2(AttorneyDto assignee2) {
		this.assignee2 = assignee2;
	}

	public AttorneyRoleDto getAssignee2Role() {
		return assignee2Role;
	}

	public void setAssignee2Role(AttorneyRoleDto assignee2Role) {
		this.assignee2Role = assignee2Role;
	}

	public AttorneyDto getAssignee3() {
		return assignee3;
	}

	public void setAssignee3(AttorneyDto assignee3) {
		this.assignee3 = assignee3;
	}

	public AttorneyRoleDto getAssignee3Role() {
		return assignee3Role;
	}

	public void setAssignee3Role(AttorneyRoleDto assignee3Role) {
		this.assignee3Role = assignee3Role;
	}

	public MatterActionStatusDto getActionStatus() {
		return actionStatus;
	}

	public void setActionStatus(MatterActionStatusDto actionStatus) {
		this.actionStatus = actionStatus;
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
    
    public void setAtty(String atty) {
        this.atty = atty;
     }
    
    public String getAtty() {
       this.atty = this.assignee1+"/"+this.assignee1Role+";"+this.assignee2+"/"+this.assignee2Role+";"+this.assignee3+"/"+this.assignee3Role;
       return this.atty;
    }
    
    @Override
    public String toString() {
        if (matter != null) {
            return matter.getCaseNum()+"-"+actionDue;
        }
        return super.toString();
    }
  
  
}
