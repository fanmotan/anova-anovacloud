
package com.anova.anovacloud.server.dao.objectify;

import com.googlecode.objectify.ObjectifyFactory;

import static com.anova.anovacloud.server.dao.objectify.OfyService.ofy;

public class OfyFactory extends ObjectifyFactory {
    public OfyFactory() {
    }

    @Override
    public Ofy begin() {
        return new Ofy(ofy());
    }
}
