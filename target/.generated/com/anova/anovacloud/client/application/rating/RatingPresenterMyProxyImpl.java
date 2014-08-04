package com.anova.anovacloud.client.application.rating;

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

public class RatingPresenterMyProxyImpl extends com.gwtplatform.mvp.client.proxy.ProxyPlaceImpl<RatingPresenter> implements com.anova.anovacloud.client.application.rating.RatingPresenter.MyProxy, com.gwtplatform.mvp.client.DelayedBind, com.anova.anovacloud.client.application.rating.event.RatingAddedEvent.RatingAddedHandler {
  
  private com.gwtplatform.mvp.client.ClientGinjector ginjector;
  
  public static class WrappedProxy
  extends com.gwtplatform.mvp.client.proxy.ProxyImpl<RatingPresenter> implements com.gwtplatform.mvp.client.DelayedBind {
    
    private com.gwtplatform.mvp.client.ClientGinjector ginjector;
    
    public WrappedProxy() {
    }
    
    @Override
    public void delayedBind(Ginjector baseGinjector) {
      ginjector = (com.gwtplatform.mvp.client.ClientGinjector)baseGinjector;
      bind(ginjector.getPlaceManager(),
          ginjector.getEventBus());
      presenter = new CodeSplitProvider<RatingPresenter>( ginjector.getcomanovaanovacloudclientapplicationratingRatingPresenter() );
    }
  }
  
  public RatingPresenterMyProxyImpl() {
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
    String[] nameToken = {"rating"}; 
    String[] gatekeeperParams = null;
    setPlace(new com.gwtplatform.mvp.client.proxy.PlaceWithGatekeeper( nameToken, ginjector.getcomanovaanovacloudclientsecurityLoggedInGatekeeper() ));
    getEventBus().addHandler( com.anova.anovacloud.client.application.rating.event.RatingAddedEvent.getType(), this );
  }
  
  @Override
  public final void onRatingAdded( final com.anova.anovacloud.client.application.rating.event.RatingAddedEvent event ) {
    getPresenter( new NotifyingAsyncCallback<RatingPresenter>(getEventBus()) {
      @Override
      public void success(final RatingPresenter presenter) {
        Scheduler.get().scheduleDeferred( new Command() {
          @Override
          public void execute() {
            presenter.onRatingAdded( event );
          }
        } );
      }
    } );
  }
}
