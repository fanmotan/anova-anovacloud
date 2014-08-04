
package com.anova.anovacloud.shared.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerRatingDto implements Dto {
    private String customer;
    private Double rating;

    public CustomerRatingDto() {
    }

    public CustomerRatingDto(@JsonProperty("customer") String customer,
                                 @JsonProperty("rating") Double rating) {
        this.customer = customer;
        this.rating = rating;
    }

    public String getCustomer() {
        return customer;
    }

    public Double getRating() {
        return rating;
    }
}
