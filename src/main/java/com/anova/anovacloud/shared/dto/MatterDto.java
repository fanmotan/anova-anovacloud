

package com.anova.anovacloud.shared.dto;

public class MatterDto extends BaseEntity {
    private CustomerDto customer;
    private String caseNum;
    private String clientRef;
    private CaseStatusDto caseStatus;
    private MatterPropertiesDto matterProperties;

    public MatterDto() {
    	
        this.caseNum = "";
        this.clientRef = "";
        this.matterProperties = new MatterPropertiesDto();

    }

    public MatterDto(String caseNum,String clientRef,
                  CustomerDto customer,
                  CaseStatusDto caseStatus,
                  MatterPropertiesDto matterProperties) {
        this.caseNum = caseNum;
        this.clientRef = clientRef;
        this.customer = customer;
        this.caseStatus = caseStatus;
        this.matterProperties = matterProperties;
    }

    public CaseStatusDto getCaseStatus() {
		return caseStatus;
	}

	public void setCaseStatus(CaseStatusDto caseStatus) {
		this.caseStatus = caseStatus;
	}

	public String getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(final String caseNum) {
        this.caseNum = caseNum;
    }
    public String getClientRef() {
        return clientRef;
    }

    public void setClientRef(final String clientRef) {
        this.clientRef = clientRef;
    }

    public CustomerDto getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDto customer) {
        this.customer = customer;
    }

    public MatterPropertiesDto getMatterProperties() {
        return matterProperties;
    }

    public void setMatterProperties(MatterPropertiesDto matterProperties) {
        this.matterProperties = matterProperties;
    }
    
}
