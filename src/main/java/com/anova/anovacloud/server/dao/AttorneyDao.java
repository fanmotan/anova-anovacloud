

package com.anova.anovacloud.server.dao;

import com.anova.anovacloud.server.dao.domain.Attorney;

public class AttorneyDao extends BaseDao<Attorney> {
    public AttorneyDao() {
        super(Attorney.class);
    }

    public Attorney findByAttorneyname(String attorneyname) {
        return ofy().query(Attorney.class).filter("attorneyname", attorneyname).first().now();
    }
}
