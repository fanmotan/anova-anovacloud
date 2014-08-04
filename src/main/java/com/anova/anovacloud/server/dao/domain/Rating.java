

package com.anova.anovacloud.server.dao.domain;

import java.util.ArrayList;
import java.util.List;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Load;
import com.anova.anovacloud.server.dao.objectify.Deref;
import com.anova.anovacloud.shared.dto.BaseEntity;
import com.anova.anovacloud.shared.dto.RatingDto;

@Index
@Entity
public class Rating extends BaseEntity {
    private Integer rating;

    @Load
    private Ref<Matter> matter;

    public Rating() {
    }

    public Matter getMatter() {
        return Deref.deref(matter);
    }

    public void setMatter(Matter matter) {
        this.matter = Ref.create(matter);
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public static List<RatingDto> createDto(List<Rating> ratings) {
        if (ratings == null) {
            return null;
        }

        List<RatingDto> ratingsDto = new ArrayList<>();
        for (Rating rating : ratings) {
            ratingsDto.add(createDto(rating));
        }

        return ratingsDto;
    }

    public static RatingDto createDto(Rating rating) {
        if (rating == null) {
            return null;
        }

        RatingDto ratingDto = new RatingDto();
        ratingDto.setMatter(Matter.createDto(rating.getMatter()));
        ratingDto.setId(rating.getId());
        ratingDto.setRating(rating.getRating());

        return ratingDto;
    }

    public static Rating create(RatingDto ratingDto) {
        if (ratingDto == null) {
            return null;
        }

        Rating rating = new Rating();
        rating.setMatter(Matter.create(ratingDto.getMatter()));
        rating.setId(ratingDto.getId());
        rating.setRating(ratingDto.getRating());

        return rating;
    }
}
