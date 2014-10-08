
package com.anova.anovacloud.server.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.anova.anovacloud.server.dao.domain.MatterAction;
import com.anova.anovacloud.shared.dto.ActionDueDto;
import com.anova.anovacloud.shared.dto.MatterActionDto;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.google.gwt.i18n.client.DateTimeFormat;

public class MatterActionDao extends BaseDao<MatterAction> {
    public MatterActionDao() {
        super(MatterAction.class);
    }
}
