
package com.anova.anovacloud.server.dao;

import com.anova.anovacloud.server.dao.domain.MatterProperties;
import com.anova.anovacloud.shared.dto.MatterPropertiesDto;

public class MatterPropertiesDao extends BaseDao<MatterProperties> {
    public MatterPropertiesDao() {
        super(MatterProperties.class);
    }

    public MatterPropertiesDto put(MatterPropertiesDto matterPropertiesDto) {
        MatterProperties matterProperties = super.put(MatterProperties.create(matterPropertiesDto));
        
        return MatterProperties.createDto(matterProperties);
    }
}
