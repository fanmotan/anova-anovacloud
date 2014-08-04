

package com.anova.anovacloud.server.dao.domain;

import java.util.ArrayList;
import java.util.List;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Load;
import com.anova.anovacloud.server.dao.objectify.Deref;
import com.anova.anovacloud.shared.dto.BaseEntity;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.anova.anovacloud.shared.dto.MatterActionDto;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.anova.anovacloud.shared.dto.MatterPropertiesDto;

@Index
@Entity
public class Matter extends BaseEntity {
	    private String matterNum;
	    private String matterSerialNum;
	    @Load
	    private Ref<Customer> customer;
	    @Load
	    private Ref<MatterProperties> matterProperties;

	    
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
        matterDto.setMatterNum(matter.getMatterNum());
        matterDto.setMatterSerialNum(matter.getMatterSerialNum());

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
        matter.setMatterNum(matterDto.getMatterNum());
        matter.setMatterSerialNum(matterDto.getMatterSerialNum());
        return matter;
    }


   
    public Matter() {
        this.matterNum = "";
        this.matterSerialNum = "";
    }

    public String getMatterNum() {
        return matterNum;
    }

    public void setMatterNum(final String matterNum) {
        this.matterNum = matterNum;
    }
    public String getMatterSerialNum() {
        return matterSerialNum;
    }

    public void setMatterSerialNum(final String matterSerialNum) {
        this.matterSerialNum = matterSerialNum;
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
