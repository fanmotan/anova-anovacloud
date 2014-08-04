

package com.anova.anovacloud.shared.dto;

public class RatingDto extends BaseEntity {
    private Integer rating;
    private MatterDto matter;

    public RatingDto() {
    }

    public RatingDto(MatterDto matter,
                     Integer rating) {
        this.matter = matter;
        this.rating = rating;
    }

    public MatterDto getMatter() {
        return matter;
    }

    public void setMatter(MatterDto matter) {
        this.matter = matter;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        if (matter != null && matter.getCustomer() != null) {
            CustomerDto customerDto = matter.getCustomer();
            return customerDto.getName() + "/" + matter.getMatterNum()+"/"+matter.getMatterSerialNum();
        }

        return super.toString();
    }
}
