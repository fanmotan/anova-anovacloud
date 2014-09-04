

package com.anova.anovacloud.server.dao.objectify;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;
import com.anova.anovacloud.server.dao.domain.Attorney;
import com.anova.anovacloud.server.dao.domain.AttorneyRole;
import com.anova.anovacloud.server.dao.domain.CaseStatus;
import com.anova.anovacloud.server.dao.domain.CustomerStatus;
import com.anova.anovacloud.server.dao.domain.Matter;
import com.anova.anovacloud.server.dao.domain.MatterActionStatus;
import com.anova.anovacloud.server.dao.domain.MatterProperties;
import com.anova.anovacloud.server.dao.domain.Customer;
import com.anova.anovacloud.server.dao.domain.MatterAction;
import com.anova.anovacloud.server.dao.domain.User;
import com.anova.anovacloud.server.dao.domain.UserRole;
import com.anova.anovacloud.server.dao.domain.UserSession;

public class OfyService {
    static {
        factory().register(Matter.class);
        factory().register(MatterProperties.class);
        factory().register(Customer.class);
        factory().register(MatterAction.class);
        factory().register(User.class);
        factory().register(UserRole.class);
        factory().register(Attorney.class);
        factory().register(UserSession.class);
        factory().register(AttorneyRole.class);
        factory().register(CaseStatus.class);
        factory().register(CustomerStatus.class);
        factory().register(MatterActionStatus.class);
    }

    public static Objectify ofy() {
        return ObjectifyService.ofy();
    }

    public static ObjectifyFactory factory() {
        return ObjectifyService.factory();
    }
}
