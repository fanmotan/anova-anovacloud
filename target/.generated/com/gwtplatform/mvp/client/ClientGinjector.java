package com.gwtplatform.mvp.client;

import com.google.gwt.inject.client.Ginjector;
import com.anova.anovacloud.client.gin.MyGinjector;
import com.google.gwt.core.shared.GWT;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.DefaultBootstrapper;
import javax.inject.Provider;
import com.google.gwt.inject.client.AsyncProvider;

public interface ClientGinjector extends Ginjector, MyGinjector {
  static ClientGinjector SINGLETON = ((GinjectorProvider) GWT.create(GinjectorProvider.class)).get();
  
  EventBus getEventBus();
  
  PlaceManager getPlaceManager();
  
  DefaultBootstrapper getDefaultBootstrapper();
  
  @com.gwtplatform.mvp.client.annotations.DefaultGatekeeper
  com.anova.anovacloud.client.security.LoggedInGatekeeper getcomanovaanovacloudclientsecurityLoggedInGatekeeper();
  
  Provider<com.anova.anovacloud.client.application.ApplicationPresenter> getcomanovaanovacloudclientapplicationApplicationPresenter();
  
  Provider<com.anova.anovacloud.client.application.UnauthorizedPresenter> getcomanovaanovacloudclientapplicationUnauthorizedPresenter();
  
  Provider<com.anova.anovacloud.client.application.login.LoginPresenter> getcomanovaanovacloudclientapplicationloginLoginPresenter();
  
  Provider<com.anova.anovacloud.client.application.matters.matter.RootMatterPresenter> getcomanovaanovacloudclientapplicationmattersmatterRootMatterPresenter();
  
  AsyncProvider<com.anova.anovacloud.client.application.customer.CustomerDetailPresenter> getcomanovaanovacloudclientapplicationcustomerCustomerDetailPresenter();
  
  AsyncProvider<com.anova.anovacloud.client.application.customer.CustomerPresenter> getcomanovaanovacloudclientapplicationcustomerCustomerPresenter();
  
  AsyncProvider<com.anova.anovacloud.client.application.matterAction.MatterActionDetailPresenter> getcomanovaanovacloudclientapplicationmatterActionMatterActionDetailPresenter();
  
  AsyncProvider<com.anova.anovacloud.client.application.matterAction.MatterActionPresenter> getcomanovaanovacloudclientapplicationmatterActionMatterActionPresenter();
  
  AsyncProvider<com.anova.anovacloud.client.application.matters.MattersPresenter> getcomanovaanovacloudclientapplicationmattersMattersPresenter();
  
  AsyncProvider<com.anova.anovacloud.client.application.rating.RatingDetailPresenter> getcomanovaanovacloudclientapplicationratingRatingDetailPresenter();
  
  AsyncProvider<com.anova.anovacloud.client.application.rating.RatingPresenter> getcomanovaanovacloudclientapplicationratingRatingPresenter();
  
  AsyncProvider<com.anova.anovacloud.client.application.report.ReportPresenter> getcomanovaanovacloudclientapplicationreportReportPresenter();
  
  AsyncProvider<com.anova.anovacloud.client.application.user.UserDetailPresenter> getcomanovaanovacloudclientapplicationuserUserDetailPresenter();
  
  AsyncProvider<com.anova.anovacloud.client.application.user.UserPresenter> getcomanovaanovacloudclientapplicationuserUserPresenter();
}
