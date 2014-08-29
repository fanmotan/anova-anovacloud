

package com.anova.anovacloud.server.dao.domain;

import java.util.Date;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Load;
import com.anova.anovacloud.server.dao.objectify.Deref;
import com.anova.anovacloud.shared.dto.BaseEntity;
import com.anova.anovacloud.shared.dto.MatterPropertiesDto;

@Index
@Entity
public class MatterProperties extends BaseEntity {
	private String matterTitle;
    private String applicationNum;
    private String patentNum;
    private String status;
    private String pubNum;
    private String assignee;
    private String assignmentRecord;
    private String remarks;
    private String priority;
    private String patentTermAdj;
    private String country;
    private Date fileDate;
    private Date issueDate;
    private Date expriationDate;
    private Date pubDate;
    private String parentPCTNum;
    private Date pctDate;
    private String createBy;
    private String updateBy;
    private Date createDate;
    private Date updateDate;


    @Load
    private Ref<Matter> matter;

    public MatterProperties() {
    	this.matterTitle = "";
        this.applicationNum = "";
        this.patentNum = "";
        this.status = "";
        this.pubNum = "";
        this.assignee = "";
        this.assignmentRecord = "";
        this.remarks = "";
        this.priority = "";
        this.patentTermAdj = "";
        this.country = "";
        this.parentPCTNum = "";
        this.createBy = "";
        this.updateBy = "";
    }

    public MatterProperties(String matterTitle,String applicationNum, String patentNum, String status, String pubNum,
			String assignee, String assignmentRecord, String remarks, String priority, String patentTermAdj,
			String country, Date fileDate, Date issueDate, Date expriationDate, Date pubDate,String parentPCTNum,
			Date pctDate, String createBy, String updateBy, Date createDate, Date updateDate)
{
	this.matterTitle = matterTitle;
	this.applicationNum = applicationNum;
	this.patentNum = patentNum;
	this.status = status;
	this.pubNum = pubNum;
	this.assignee = assignee;
	this.assignmentRecord = assignmentRecord;
	this.remarks = remarks;
	this.priority = priority;
	this.patentTermAdj = patentTermAdj;
	this.country = country;
	this.parentPCTNum = parentPCTNum;
	this.createBy = parentPCTNum;
	this.updateBy = updateBy;
	this.fileDate = fileDate;
	this.issueDate = fileDate;
	this.expriationDate = expriationDate;
	this.pubDate = pubDate;
	this.pctDate = pctDate;
	this.createDate = createDate;
	this.updateDate = updateDate;
}



public String getMatterTitle() {
return matterTitle;
}

public void setMatterTitle(String matterTitle) {
this.matterTitle = matterTitle;
}

public String getApplicationNum() {
return applicationNum;
}

public void setApplicationNum(String applicationNum) {
this.applicationNum = applicationNum;
}
public String getPatentNum() {
return patentNum;
}

public void setPatentNum(String patentNum) {
this.patentNum = patentNum;
}

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

public String getPubNum() {
return pubNum;
}

public void setPubNum(String pubNum) {
this.pubNum = pubNum;
}

public String getAssignee() {
return assignee;
}

public void setAssignee(String assignee) {
this.assignee = assignee;
}
public String getAssignmentRecord() {
return assignmentRecord;
}

public void setAssignmentRecord(String assignmentRecord) {
this.assignmentRecord = assignmentRecord;
}

public String getRemarks() {
return remarks;
}

public void setRemarks(String remarks) {
this.remarks = remarks;
}

public String getPriority() {
return priority;
}

public void setPriority(String priority) {
this.priority = priority;
}

public String getPatentTermAdj() {
return patentTermAdj;
}

public void setPatentTermAdj(String patentTermAdj) {
this.patentTermAdj = patentTermAdj;
}

public String getCountry() {
return country;
}

public void setCountry(String country) {
this.country = country;
}

public Date getFileDate() {
return fileDate;
}

public void setFileDate(Date fileDate) {
this.fileDate = fileDate;
}

public Date getIssueDate() {
return issueDate;
}

public void setIssueDate(Date issueDate) {
this.issueDate = issueDate;
}
public Date getExpriationDate() {
return expriationDate;
}

public void setExpriationDate(Date expriationDate) {
this.expriationDate = expriationDate;
}

public Date getPubDate() {
return pubDate;
}

public void setPubDate(Date pubDate) {
this.pubDate = pubDate;
}
public Date getPctDate() {
return pctDate;
}

public void setPctDate(Date pctDate) {
this.pctDate = pctDate;
}

public Date getCreateDate() {
return createDate;
}

public void setCreateDate(Date createDate) {
this.createDate = createDate;
}
public Date getUpdateDate() {
return updateDate;
}

public void setUpdateDate(Date updateDate) {
this.updateDate = updateDate;
}
public String getParentPCTNum() {
return parentPCTNum;
}

public void setParentPCTNum(String parentPCTNum) {
this.parentPCTNum = parentPCTNum;
}

public String getCreateBy() {
return createBy;
}

public void setCreateBy(String createBy) {
this.createBy = createBy;
}
public String getUpdateBy() {
return updateBy;
}

public void setUpdateBy(String updateBy) {
this.updateBy = updateBy;
}

    public Matter getMatter() {
        return Deref.deref(matter);
    }

    public void setMatter(Matter matter) {
        if (matter != null) {
            this.matter = Ref.create(matter);
        } else {
            this.matter = null;
        }

    }

    

    public static MatterPropertiesDto createDto(MatterProperties matterProperties) {
        if (matterProperties == null) {
            return null;
        }

        MatterPropertiesDto matterPropertiesDto = new MatterPropertiesDto();
        matterPropertiesDto.setMatter(Matter.createDto(matterProperties.getMatter()));
        matterPropertiesDto.setId(matterProperties.getId());
        matterPropertiesDto.setMatterTitle(matterProperties.getMatterTitle());
        matterPropertiesDto.setApplicationNum(matterProperties.getApplicationNum());
        matterPropertiesDto.setPatentNum(matterProperties.getPatentNum());
        matterPropertiesDto.setStatus(matterProperties.getStatus());
        matterPropertiesDto.setPubNum(matterProperties.getPubNum());
        matterPropertiesDto.setAssignee(matterProperties.getAssignee());
        matterPropertiesDto.setAssignmentRecord(matterProperties.getAssignmentRecord());
        matterPropertiesDto.setRemarks(matterProperties.getRemarks());
        matterPropertiesDto.setPriority(matterProperties.getPriority());
        matterPropertiesDto.setPatentTermAdj(matterProperties.getPatentTermAdj());
        matterPropertiesDto.setCountry(matterProperties.getCountry());
        matterPropertiesDto.setFileDate(matterProperties.getFileDate());
        matterPropertiesDto.setIssueDate(matterProperties.getIssueDate());
        matterPropertiesDto.setExpriationDate(matterProperties.getExpriationDate());
        matterPropertiesDto.setPubDate(matterProperties.getPubDate());
        matterPropertiesDto.setParentPCTNum(matterProperties.getParentPCTNum());
        matterPropertiesDto.setPctDate(matterProperties.getPctDate());
        matterPropertiesDto.setCreateBy(matterProperties.getCreateBy());
        matterPropertiesDto.setUpdateBy(matterProperties.getUpdateBy());
        matterPropertiesDto.setCreateDate(matterProperties.getCreateDate());
        matterPropertiesDto.setUpdateDate(matterProperties.getUpdateDate());
        
        return matterPropertiesDto;
    }

    public static MatterProperties create(MatterPropertiesDto matterPropertiesDto) {
        if (matterPropertiesDto == null) {
            return null;
        }

        MatterProperties matterProperties = new MatterProperties();
        matterProperties.setMatter(Matter.create(matterPropertiesDto.getMatter()));
        matterProperties.setId(matterPropertiesDto.getId());
        matterProperties.setMatterTitle(matterPropertiesDto.getMatterTitle());
        matterProperties.setApplicationNum(matterPropertiesDto.getApplicationNum());
        matterProperties.setPatentNum(matterPropertiesDto.getPatentNum());
        matterProperties.setStatus(matterPropertiesDto.getStatus());
        matterProperties.setPubNum(matterPropertiesDto.getPubNum());
        matterProperties.setAssignee(matterPropertiesDto.getAssignee());
        matterProperties.setAssignmentRecord(matterPropertiesDto.getAssignmentRecord());
        matterProperties.setRemarks(matterPropertiesDto.getRemarks());
        matterProperties.setPriority(matterPropertiesDto.getPriority());
        matterProperties.setPatentTermAdj(matterPropertiesDto.getPatentTermAdj());
        matterProperties.setCountry(matterPropertiesDto.getCountry());
        matterProperties.setFileDate(matterPropertiesDto.getFileDate());
        matterProperties.setIssueDate(matterPropertiesDto.getIssueDate());
        matterProperties.setExpriationDate(matterPropertiesDto.getExpriationDate());
        matterProperties.setPubDate(matterPropertiesDto.getPubDate());
        matterProperties.setParentPCTNum(matterPropertiesDto.getParentPCTNum());
        matterProperties.setPctDate(matterPropertiesDto.getPctDate());
        matterProperties.setCreateBy(matterPropertiesDto.getCreateBy());
        matterProperties.setUpdateBy(matterPropertiesDto.getUpdateBy());
        matterProperties.setCreateDate(matterPropertiesDto.getCreateDate());
        matterProperties.setUpdateDate(matterPropertiesDto.getUpdateDate());

        return matterProperties;
    }
}
