

package com.anova.anovacloud.server;

import java.util.Date;

import javax.inject.Inject;

import com.anova.anovacloud.server.authentication.PasswordSecurity;
import com.anova.anovacloud.server.dao.MatterActionDao;
import com.anova.anovacloud.server.dao.MatterDao;
import com.anova.anovacloud.server.dao.MatterPropertiesDao;
import com.anova.anovacloud.server.dao.CustomerDao;
import com.anova.anovacloud.server.dao.UserDao;
import com.anova.anovacloud.server.dao.domain.Matter;
import com.anova.anovacloud.server.dao.domain.Customer;
import com.anova.anovacloud.server.dao.domain.User;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.anova.anovacloud.shared.dto.MatterPropertiesDto;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.anova.anovacloud.shared.dto.UserDto;

public class DevBootStrapper {
    private final UserDao userDao;
    private final PasswordSecurity passwordSecurity;
    private final CustomerDao customerDao;
    private final MatterDao matterDao;
    private final MatterActionDao matterActionDao;
    private final MatterPropertiesDao matterPropertiesDao;

    @Inject
    DevBootStrapper(UserDao userDao,
                    PasswordSecurity passwordSecurity,
                    CustomerDao customerDao,
                    MatterDao matterDao,
                    MatterActionDao matterActionDao,
                    MatterPropertiesDao matterPropertiesDao) {
        this.userDao = userDao;
        this.passwordSecurity = passwordSecurity;
        this.customerDao = customerDao;
        this.matterDao = matterDao;
        this.matterActionDao = matterActionDao;
        this.matterPropertiesDao = matterPropertiesDao;

        init();
    }

    public void init() {
        deleteAllEntities();

        long userCount = userDao.countAll();

        if (userCount == 0) {
            createBasicUser();
        }

        createMockData();
    }

    private void deleteAllEntities() {
        customerDao.deleteAll();
        matterDao.deleteAll();
        matterActionDao.deleteAll();
        matterPropertiesDao.deleteAll();
    }

    private void createBasicUser() {
        UserDto userDto = new UserDto("admin",  "FirstName", "LastName", "admin", passwordSecurity.hashPassword("pwd123"),"","","","","");
        userDao.put(User.create(userDto));
        userDto  = User.createDto(userDao.put(User.create(userDto)));
    }


    private void createMockData() {
        long customerCount = customerDao.countAll();

        if (customerCount == 0) {
        	
            CustomerDto honda = new CustomerDto("Honda", "11", "aaaa", "@honda", "", "", "active");
            CustomerDto mitsubishi = new CustomerDto("Mitsubishi", "22", "aaaa", "@mmm", "", "", "active");

            honda = Customer.createDto(customerDao.put(Customer.create(honda)));
            mitsubishi = Customer.createDto(customerDao.put(Customer.create(mitsubishi)));

            MatterPropertiesDto matterPropertiesCivic = new MatterPropertiesDto("Cat", "testing1", "", "active", "us-001", "","","","high", "", "Us", new Date(), new Date(), new Date(), new Date(), "", new Date(), "tester", new Date(), "", new Date());
            matterPropertiesCivic = matterPropertiesDao.put(matterPropertiesCivic);

            MatterPropertiesDto matterPropertiesAccord = new MatterPropertiesDto("Fish", "testing2", "", "active", "us-001", "","","","high", "", "Us", new Date(), new Date(), new Date(), new Date(), "", new Date(), "tester", new Date(), "", new Date());
            matterPropertiesAccord = matterPropertiesDao.put(matterPropertiesAccord);

            MatterPropertiesDto matterPropertiesLancer = new MatterPropertiesDto("Dog", "testing3", "", "active", "us-001", "","","","high", "", "Us", new Date(), new Date(), new Date(), new Date(), "", new Date(), "tester", new Date(), "", new Date());
            matterPropertiesLancer = matterPropertiesDao.put(matterPropertiesLancer);

            MatterPropertiesDto matterPropertiesMitsubishi = new MatterPropertiesDto("Cow", "testing4", "", "active", "us-001", "","","","high", "", "Us", new Date(), new Date(), new Date(), new Date(), "", new Date(), "tester", new Date(), "", new Date());
            matterPropertiesMitsubishi = matterPropertiesDao.put(matterPropertiesMitsubishi);

            MatterDto civic = new MatterDto("Civic", "0001",  honda, matterPropertiesCivic);
            MatterDto accord = new MatterDto("Accord", "0001", honda, matterPropertiesAccord);
            MatterDto lancer = new MatterDto("Lancer", "0001", mitsubishi, matterPropertiesLancer);
            MatterDto galant = new MatterDto("Galant", "0001",  mitsubishi, matterPropertiesMitsubishi);

            civic = Matter.createDto(matterDao.put(Matter.create(civic)));
            accord = Matter.createDto(matterDao.put(Matter.create(accord)));
            lancer = Matter.createDto(matterDao.put(Matter.create(lancer)));
            galant = Matter.createDto(matterDao.put(Matter.create(galant)));

        }
    }
}
