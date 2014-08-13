

package com.anova.anovacloud.client.place;

public class NameTokens {
    public static final String UNAUTHORIZED = "unauthorized";
    public static final String LOGIN = "login";
    public static final String CUSTOMERS = "customers";
    public static final String NEW_CUSTOMER = "newCustomer";
    public static final String MATTERS = "matters";
    public static final String REPORT = "report";
    public static final String NEW_MATTER = "newMatter";
    public static final String MATTERACTION = "matterAction";
    public static final String DETAIL_MATTERACTION = "detailMatterAction";
    public static final String USER = "user";
    public static final String DETAIL_USER = "detailUser";
   
    public static String getOnLoginDefaultPage() {
        return REPORT;
    }

    public static String getCustomers() {
        return CUSTOMERS;
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

    public static String getDetailUser() {
        return DETAIL_USER;
    }
   
}
