

package com.anova.anovacloud.shared.dto;

import java.util.ArrayList;
import java.util.List;

public class MatterDto extends BaseEntity {
    private CustomerDto customer;
    private String matterNum;
    private String matterSerialNum;
    private List<MatterActionDto> actions;
    private MatterPropertiesDto matterProperties;

    public MatterDto() {
        this.matterNum = "";
        this.matterSerialNum = "";
        this.matterProperties = new MatterPropertiesDto();
        this.actions = new ArrayList<>();
    }

    public MatterDto(String matterNum,String matterSerialNum,
                  CustomerDto customer,
                  MatterPropertiesDto matterProperties) {
        this.matterNum = matterNum;
        this.matterSerialNum = matterSerialNum;
        this.customer = customer;
        this.matterProperties = matterProperties;
        this.actions = new ArrayList<>();
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

    public CustomerDto getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDto customer) {
        this.customer = customer;
    }

    public List<MatterActionDto> getActions() {
        return actions;
    }

    public void setActions(List<MatterActionDto> actions) {
        this.actions = actions;
    }

    public MatterPropertiesDto getMatterProperties() {
        return matterProperties;
    }

    public void setMatterProperties(MatterPropertiesDto matterProperties) {
        this.matterProperties = matterProperties;
    }
}
