

package com.anova.anovacloud.client.place;

public class NameTokens {
    public static final String UNAUTHORIZED = "unauthorized";
    public static final String LOGIN = "login";
    public static final String CUSTOMER = "customer";
    public static final String CUSTOMERSTATUS = "customerStatus";
    public static final String ATTORNEYSTATUS = "attorneyStatus";
    public static final String CASESTATUS = "caseStatus";
    public static final String DETAIL_CUSTOMER = "detailCustomer";
    public static final String MATTERS = "matters";
    public static final String DUETODAY = "dueToday";
    public static final String DUETHREEDAY = "dueThreeDay";
    public static final String DUEONEWEEK = "dueOneWeek";
    public static final String DUEONEMONTH = "dueOneMonth";
    public static final String NEW_MATTER = "newMatter";
    public static final String MATTERACTION = "matterAction";
    public static final String MATTERACTIONSTATUS = "matterActionStatus";
    public static final String DETAIL_MATTERACTION = "detailMatterAction";
    public static final String USER = "user";
    public static final String USERROLE = "userRole";
    public static final String DETAIL_USER = "detailUser";
    public static final String ATTORNEY = "attorney";
    public static final String DETAIL_ATTORNEY = "detailAttorney";
    public static final String ATTORNEYROLE = "attorneyRole";
   
    public static String getOnLoginDefaultPage() {
        return DUETODAY;
    }

    public static String getCustomer() {
        return CUSTOMER;
    }
    
    public static String getDetailCustomer() {
        return DETAIL_CUSTOMER;
    }
    
    public static String getMatterAction() {
        return MATTERACTION;
    }

    public static String getDetailMatterAction() {
        return DETAIL_MATTERACTION;
    }

    public static String getMatters() {
        return MATTERS;
    }

    public static String getDueToday() {
        return DUETODAY;
    }
    public static String getDueThreeDay() {
        return DUETHREEDAY;
    }
    public static String getDueOneWeek() {
        return DUEONEWEEK;
    }
    public static String getDueOneMonth() {
        return DUEONEMONTH;
    }
    
    
    public static String getUser() {
        return USER;
    }
    
    public static String getUserRole() {
        return USERROLE;
    }
    
    public static String getCustomerStatus() {
        return CUSTOMERSTATUS;
    }
    
    public static String getCaseStatus() {
        return CASESTATUS;
    }
    
    public static String getAttorneyStatus() {
        return ATTORNEYSTATUS;
    }
    public static String getMatterActionStatus() {
        return MATTERACTIONSTATUS;
    }


    public static String getDetailUser() {
        return DETAIL_USER;
    }
    
    public static String getAttorney() {
        return ATTORNEY;
    }

    public static String getDetailAttorney() {
        return DETAIL_ATTORNEY;
    }
    
    public static String getAttorneyRole() {
        return ATTORNEYROLE;
    }

 
}
