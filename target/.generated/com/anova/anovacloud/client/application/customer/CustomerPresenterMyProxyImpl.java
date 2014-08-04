package com.anova.anovacloud.client.application.customer;

import com.google.gwt.core.client.GWT;
import javax.inject.Inject;
import javax.inject.Provider;
import com.gwtplatform.mvp.client.proxy.NotifyingAsyncCallback;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.common.client.StandardProvider;
import com.gwtplatform.common.client.CodeSplitProvider;
import com.gwtplatform.common.client.CodeSplitBundleProvider;
import com.gwtplatform.mvp.client.proxy.ProxyImpl;
import com.gwtplatform.mvp.client.proxy.ProxyPlaceImpl;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.client.DelayedBind;
import com.gwtplatform.mvp.client.proxy.TabContentProxyPlaceImpl;
import com.gwtplatform.mvp.client.DelayedBindRegistry;
import com.google.gwt.inject.client.Ginjector;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.gwtplatform.mvp.client.TabData;
import com.gwtplatform.mvp.client.TabDataBasic;

public class CustomerPresenterMyProxyImpl extends com.gwtplatform.mvp.client.proxy.ProxyPlaceImpl<CustomerPresenter> implements com.anova.anovacloud.client.application.customer.CustomerPresenter.MyProxy, com.gwtplatform.mvp.client.DelayedBind, com.anova.anovacloud.client.application.customer.event.CustomerAddedEvent.CustomerAddedHandler {
  
  private com.gwtplatform.mvp.client.ClientGinjector ginjector;
  
  public static class WrappedProxy
  extends com.gwtplatform.mvp.client.proxy.ProxyImpl<CustomerPresenter> implements com.gwtplatform.mvp.client.DelayedBind {
    
    private com.gwtplatform.mvp.client.ClientGinjector ginjector;
    
    public WrappedProxy() {
    }
    
    @Override
    public void delayedBind(Ginjector baseGinjector) {
      ginjector = (com.gwtplatform.mvp.client.ClientGinjector)baseGinjector;
      bind(ginjector.getPlaceManager(),
          ginjector.getEventBus());
      presenter = new CodeSplitProvider<CustomerPresenter>( ginjector.getcomanovaanovacloudclientapplicationcustomerCustomerPresenter() );
    }
  }
  
  public CustomerPresenterMyProxyImpl() {
    DelayedBindRegistry.register(this);
  }
  
  @Override
  public void delayedBind(Ginjector baseGinjector) {
    ginjector = (com.gwtplatform.mvp.client.ClientGinjector)baseGinjector;
    bind(ginjector.getPlaceManager(),
        ginjector.getEventBus());
    WrappedProxy wrappedProxy = GWT.create(WrappedProxy.class);
    wrappedProxy.delayedBind( ginjector ); 
    setProxy(wrappedProxy); 
    String[] nameToken = {"customer"}; 
    String[] gatekeeperParams = null;
    setPlace(new com.gwtplatform.mvp.client.proxy.PlaceWithGatekeeper( nameToken, ginjector.getcomanovaanovacloudclientsecurityLoggedInGatekeeper() ));
    getEventBus().addHandler( com.anova.anovacloud.client.application.customer.event.CustomerAddedEvent.getType(), this );
  }
  
  @Override
  public final void onCustomerAdded( final com.anova.anovacloud.client.application.customer.event.CustomerAddedEvent event ) {
    getPresenter( new NotifyingAsyncCallback<CustomerPresenter>(getEventBus()) {
      @Override
      public void success(final CustomerPresenter presenter) {
        Scheduler.get().scheduleDeferred( new Command() {
          @Override
          public void execute() {
            presenter.onCustomerAdded( event );
          }
        } );
      }
    } );
  }
}
