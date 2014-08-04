
package com.anova.anovacloud.server.dao;

import java.util.ArrayList;
import java.util.List;

import com.anova.anovacloud.server.dao.domain.Matter;
import com.anova.anovacloud.shared.dto.CustomerRatingDto;

public class MatterDao extends BaseDao<Matter> {
    public MatterDao() {
        super(Matter.class);
    }

    public List<CustomerRatingDto> getAverageMatterRatingByCustomer() {
        // TODO: Not implemented yet
        return new ArrayList<>();
    }
}
