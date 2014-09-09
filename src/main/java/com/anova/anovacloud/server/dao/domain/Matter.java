

package com.anova.anovacloud.server.dao.domain;

import java.util.ArrayList;
import java.util.List;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Load;
import com.anova.anovacloud.server.dao.objectify.Deref;
import com.anova.anovacloud.shared.dto.BaseEntity;
import com.anova.anovacloud.shared.dto.MatterDto;

@Index
@Entity
public class Matter extends BaseEntity {
	    private String caseNum;
	    private String clientRef;
	    @Load
	    private Ref<Customer> customer;
	    @Load
	    private Ref<CaseStatus> caseStatus;
	    @Load
	    private Ref<MatterProperties> matterProperties;

	    public Matter() {
	        this.caseNum = "";
	        this.clientRef = "";
	    }
	 /*   
	    public Matter(String caseNum, String clientRef, Customer customer, CaseStatus caseStatus, MatterProperties matterProperties) {
	        this.caseNum = caseNum;
	        this.clientRef = clientRef;    
	        this.setCustomer(customer);
	       this.setCaseStatus(caseStatus);
	       this.setMatterProperties(matterProperties);
	    }
	 */
	    
    public static List<MatterDto> createDto(List<Matter> matters) {
        if (matters == null) {
            return null;
        }

        List<MatterDto> mattersDto = new ArrayList<>();
        for (Matter matter : matters) {
            mattersDto.add(createDto(matter));
        }

        return mattersDto;
    }

    public static MatterDto createDto(Matter matter) {
        if (matter == null) {
            return null;
        }

        MatterDto matterDto = new MatterDto();
        matterDto.setMatterProperties(MatterProperties.createDto(matter.getMatterProperties()));
        matterDto.setId(matter.getId());
        matterDto.setCustomer(Customer.createDto(matter.getCustomer()));
        matterDto.setCaseNum(matter.getCaseNum());
        matterDto.setClientRef(matter.getClientRef());
        matterDto.setCaseStatus(CaseStatus.createDto(matter.getCaseStatus()));

        return matterDto;
    }

    public static List<Matter> create(List<MatterDto> matterDtos) {
        if (matterDtos == null) {
            return null;
        }

        List<Matter> matters = new ArrayList<>();
        for (MatterDto matterDto : matterDtos) {
            matters.add(create(matterDto));
        }

        return matters;
    }

    public static Matter create(MatterDto matterDto) {
        if (matterDto == null) {
            return null;
        }

        Matter matter = new Matter();
        matter.setMatterProperties(MatterProperties.create(matterDto.getMatterProperties()));
        matter.setId(matterDto.getId());
        matter.setCustomer(Customer.create(matterDto.getCustomer()));
        matter.setCaseNum(matterDto.getCaseNum());
        matter.setClientRef(matterDto.getClientRef());
        matter.setCaseStatus(CaseStatus.create(matterDto.getCaseStatus()));
        return matter;
    }


    public String getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(final String caseNum) {
        this.caseNum = caseNum;
    }
    
    
    public CaseStatus getCaseStatus() {
		return Deref.deref(caseStatus);
	}

	public void setCaseStatus(CaseStatus caseStatus) {
		 if (caseStatus != null) {
	            this.caseStatus = Ref.create(caseStatus);
	        } else {
	            this.caseStatus = null;
	        }
	}

	public String getClientRef() {
        return clientRef;
    }

    public void setClientRef(final String clientRef) {
        this.clientRef = clientRef;
    }

    public Customer getCustomer() {
        return Deref.deref(customer);
    }

    public void setCustomer(Customer customer) {
        if (customer != null) {
            this.customer = Ref.create(customer);
        } else {
            this.customer = null;
        }

    }

    public MatterProperties getMatterProperties() {
        return Deref.deref(matterProperties);
    }

    public void setMatterProperties(MatterProperties matterProperties) {
        if (matterProperties != null) {
            try {
                this.matterProperties = Ref.create(matterProperties);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            this.matterProperties = null;
        }
    }
}
