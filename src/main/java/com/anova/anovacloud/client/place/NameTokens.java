

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
    public static final String REPORT = "report";
    public static final String NEW_MATTER = "newMatter";
    public static final String MATTERACTION = "matterAction";
    public static final String DETAIL_MATTERACTION = "detailMatterAction";
    public static final String USER = "user";
    public static final String USERROLE = "userRole";
    public static final String DETAIL_USER = "detailUser";
    public static final String ATTORNEY = "attorney";
    public static final String DETAIL_ATTORNEY = "detailAttorney";
   
    public static String getOnLoginDefaultPage() {
        return REPORT;
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

    public static String getReport() {
        return REPORT;
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
    

    public static String getDetailUser() {
        return DETAIL_USER;
    }
    
    public static String getAttorney() {
        return ATTORNEY;
    }

    public static String getDetailAttorney() {
        return DETAIL_ATTORNEY;
    }
 
}
