

package com.anova.anovacloud.shared.dto;
import java.util.Date;

public class MatterActionDto extends BaseEntity {
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
    private String atty;
    private String actionRemarks;
    private String createBy;
    private Date createDate;
    private String updateBy;
    private Date updateDate; 
    private MatterDto matter;

    public MatterActionDto() {
    }

    public MatterActionDto(MatterDto matter, Date dueDate, String actionDue, Date ptoMailDate, Date responseDate,
    						Date takenDate, String assignee1, String assignee1Role, String assignee2, 
    						String assignee2Role, String assignee3, String assignee3Role, String actionRemarks,
    						String createBy, Date createDate, String updateBy, Date updateDate) {
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
            return matter.getMatterNum()+"."+matter.getMatterSerialNum();
        }
        return super.toString();
    }
}
