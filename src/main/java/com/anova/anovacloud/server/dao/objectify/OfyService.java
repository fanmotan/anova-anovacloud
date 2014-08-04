

package com.anova.anovacloud.server.dao.objectify;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;
import com.anova.anovacloud.server.dao.domain.Matter;
import com.anova.anovacloud.server.dao.domain.MatterProperties;
import com.anova.anovacloud.server.dao.domain.Customer;
import com.anova.anovacloud.server.dao.domain.Rating;
import com.anova.anovacloud.server.dao.domain.MatterAction;
import com.anova.anovacloud.server.dao.domain.User;
import com.anova.anovacloud.server.dao.domain.UserSession;

public class OfyService {
    static {
        factory().register(Matter.class);
        factory().register(MatterProperties.class);
        factory().register(Customer.class);
        factory().register(MatterAction.class);
        factory().register(Rating.class);
        factory().register(User.class);
        factory().register(UserSession.class);
    }

    public static Objectify ofy() {
        return ObjectifyService.ofy();
    }

    public static ObjectifyFactory factory() {
        return ObjectifyService.factory();
    }
}
