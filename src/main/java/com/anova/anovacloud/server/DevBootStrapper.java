

package com.anova.anovacloud.server;

import java.util.Date;

import javax.inject.Inject;

import com.anova.anovacloud.server.authentication.PasswordSecurity;
import com.anova.anovacloud.server.dao.AttorneyRoleDao;
import com.anova.anovacloud.server.dao.AttorneyStatusDao;
import com.anova.anovacloud.server.dao.CaseStatusDao;
import com.anova.anovacloud.server.dao.CustomerStatusDao;
import com.anova.anovacloud.server.dao.MatterActionDao;
import com.anova.anovacloud.server.dao.MatterActionStatusDao;
import com.anova.anovacloud.server.dao.MatterDao;
import com.anova.anovacloud.server.dao.MatterPropertiesDao;
import com.anova.anovacloud.server.dao.CustomerDao;
import com.anova.anovacloud.server.dao.UserDao;
import com.anova.anovacloud.server.dao.UserRoleDao;
import com.anova.anovacloud.server.dao.domain.AttorneyRole;
import com.anova.anovacloud.server.dao.domain.AttorneyStatus;
import com.anova.anovacloud.server.dao.domain.CaseStatus;
import com.anova.anovacloud.server.dao.domain.CustomerStatus;
import com.anova.anovacloud.server.dao.domain.Matter;
import com.anova.anovacloud.server.dao.domain.Customer;
import com.anova.anovacloud.server.dao.domain.MatterActionStatus;
import com.anova.anovacloud.server.dao.domain.User;
import com.anova.anovacloud.server.dao.domain.UserRole;
import com.anova.anovacloud.shared.dto.AttorneyRoleDto;
import com.anova.anovacloud.shared.dto.AttorneyStatusDto;
import com.anova.anovacloud.shared.dto.CaseStatusDto;
import com.anova.anovacloud.shared.dto.CustomerStatusDto;
import com.anova.anovacloud.shared.dto.MatterActionStatusDto;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.anova.anovacloud.shared.dto.MatterPropertiesDto;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.anova.anovacloud.shared.dto.UserDto;
import com.anova.anovacloud.shared.dto.UserRoleDto;

public class DevBootStrapper {
    private final UserDao userDao;
    private final UserRoleDao userRoleDao;
    private final PasswordSecurity passwordSecurity;
    private final CustomerDao customerDao;
    private final CustomerStatusDao customerStatusDao;
    private final AttorneyStatusDao attorneyStatusDao;
    private final MatterDao matterDao;
    private final MatterActionDao matterActionDao;
    private final MatterPropertiesDao matterPropertiesDao;
    private final AttorneyRoleDao attorneyRoleDao;
    private final CaseStatusDao caseStatusDao;
    private final MatterActionStatusDao matterActionStatusDao;


    @Inject
    DevBootStrapper(UserDao userDao,
    				UserRoleDao userRoleDao,
                    PasswordSecurity passwordSecurity,
                    CustomerDao customerDao,
                    CustomerStatusDao customerStatusDao,
                    AttorneyStatusDao attorneyStatusDao,
                    MatterDao matterDao,
                    MatterActionDao matterActionDao,
                    MatterPropertiesDao matterPropertiesDao,
                    AttorneyRoleDao attorneyRoleDao,
                    CaseStatusDao caseStatusDao,
                    MatterActionStatusDao matterActionStatusDao) {
        this.userDao = userDao;
        this.userRoleDao = userRoleDao;
        this.passwordSecurity = passwordSecurity;
        this.customerDao = customerDao;
        this.customerStatusDao = customerStatusDao;
        this.attorneyStatusDao = attorneyStatusDao;
        this.matterDao = matterDao;
        this.matterActionDao = matterActionDao;
        this.matterPropertiesDao = matterPropertiesDao;
        this.attorneyRoleDao = attorneyRoleDao;
        this.caseStatusDao = caseStatusDao;
        this.matterActionStatusDao = matterActionStatusDao;

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
        userDao.deleteAll();
        userRoleDao.deleteAll();
        customerStatusDao.deleteAll();
    }
    
   
    
    private void createBasicUser() {
    	
    	 UserRoleDto admin = new UserRoleDto("system administrator");
         UserRoleDto normaluser = new UserRoleDto("general user");
         UserRoleDto readonlyuser = new UserRoleDto("read only");

         admin = UserRole.createDto(userRoleDao.put(UserRole.create(admin)));
         normaluser = UserRole.createDto(userRoleDao.put(UserRole.create(normaluser)));
         readonlyuser = UserRole.createDto(userRoleDao.put(UserRole.create(readonlyuser)));
        
    	
        UserDto userDto = new UserDto("admin",  "Fan", "Mo", "admin", passwordSecurity.hashPassword("pwd123"), "fmo@fanconsultingllc.com", admin);
        userDto  = User.createDto(userDao.put(User.create(userDto)));
    }
    
  


    private void createMockData() {
    	AttorneyRoleDto cltatty = new AttorneyRoleDto("client atty");
    	AttorneyRoleDto mtratty = new AttorneyRoleDto("matter review atty");
    	AttorneyRoleDto wrkatty = new AttorneyRoleDto("working atty");
    	AttorneyRoleDto sptatty = new AttorneyRoleDto("supporting atty");

    	cltatty = AttorneyRole.createDto(attorneyRoleDao.put(AttorneyRole.create(cltatty)));
    	mtratty = AttorneyRole.createDto(attorneyRoleDao.put(AttorneyRole.create(mtratty)));
    	wrkatty = AttorneyRole.createDto(attorneyRoleDao.put(AttorneyRole.create(wrkatty)));
    	sptatty = AttorneyRole.createDto(attorneyRoleDao.put(AttorneyRole.create(sptatty)));
        
       
    	CaseStatusDto cstatus1 = new CaseStatusDto("new");
    	CaseStatusDto cstatus2 = new CaseStatusDto("pending");
    	CaseStatusDto cstatus3 = new CaseStatusDto("issued");
    	CaseStatusDto cstatus4 = new CaseStatusDto("closed");
    	CaseStatusDto cstatus5 = new CaseStatusDto("abandoned");

    	cstatus1 = CaseStatus.createDto(caseStatusDao.put(CaseStatus.create(cstatus1)));
    	cstatus2 = CaseStatus.createDto(caseStatusDao.put(CaseStatus.create(cstatus2)));
    	cstatus3 = CaseStatus.createDto(caseStatusDao.put(CaseStatus.create(cstatus3)));
    	cstatus4 = CaseStatus.createDto(caseStatusDao.put(CaseStatus.create(cstatus4)));
    	cstatus5 = CaseStatus.createDto(caseStatusDao.put(CaseStatus.create(cstatus5)));
    	
    	CustomerStatusDto csstatus1 = new CustomerStatusDto("active");
    	CustomerStatusDto csstatus2 = new CustomerStatusDto("inactive");
    	
    	csstatus1 = CustomerStatus.createDto(customerStatusDao.put(CustomerStatus.create(csstatus1)));
    	csstatus2 = CustomerStatus.createDto(customerStatusDao.put(CustomerStatus.create(csstatus2)));
    	
    	AttorneyStatusDto astatus1 = new AttorneyStatusDto("active");
    	AttorneyStatusDto astatus2 = new AttorneyStatusDto("inactive");
    	
    	astatus1 = AttorneyStatus.createDto(attorneyStatusDao.put(AttorneyStatus.create(astatus1)));
    	astatus2 = AttorneyStatus.createDto(attorneyStatusDao.put(AttorneyStatus.create(astatus2)));
    	
    	
    	
    	MatterActionStatusDto mstatus1 = new MatterActionStatusDto("open");
    	MatterActionStatusDto mstatus2 = new MatterActionStatusDto("in process");
    	MatterActionStatusDto mstatus3 = new MatterActionStatusDto("completed");
    	
    	mstatus1 = MatterActionStatus.createDto(matterActionStatusDao.put(MatterActionStatus.create(mstatus1)));
    	mstatus2 = MatterActionStatus.createDto(matterActionStatusDao.put(MatterActionStatus.create(mstatus2)));
    	mstatus3 = MatterActionStatus.createDto(matterActionStatusDao.put(MatterActionStatus.create(mstatus3)));
    	
        long customerCount = customerDao.countAll();

        if (customerCount == 0) {
        	
            CustomerDto honda = new CustomerDto("Honda", "11", "aaaa", "@honda", "", "", csstatus1);
            CustomerDto mitsubishi = new CustomerDto("Mitsubishi", "22", "aaaa", "@mmm", "", "", csstatus2);

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
