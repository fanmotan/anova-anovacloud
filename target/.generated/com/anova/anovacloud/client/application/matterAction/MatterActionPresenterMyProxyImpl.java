package com.anova.anovacloud.client.application.matterAction;

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

public class MatterActionPresenterMyProxyImpl extends com.gwtplatform.mvp.client.proxy.ProxyPlaceImpl<MatterActionPresenter> implements com.anova.anovacloud.client.application.matterAction.MatterActionPresenter.MyProxy, com.gwtplatform.mvp.client.DelayedBind, com.anova.anovacloud.client.application.matterAction.event.MatterActionAddedEvent.MatterActionAddedHandler {
  
  private com.gwtplatform.mvp.client.ClientGinjector ginjector;
  
  public static class WrappedProxy
  extends com.gwtplatform.mvp.client.proxy.ProxyImpl<MatterActionPresenter> implements com.gwtplatform.mvp.client.DelayedBind {
    
    private com.gwtplatform.mvp.client.ClientGinjector ginjector;
    
    public WrappedProxy() {
    }
    
    @Override
    public void delayedBind(Ginjector baseGinjector) {
      ginjector = (com.gwtplatform.mvp.client.ClientGinjector)baseGinjector;
      bind(ginjector.getPlaceManager(),
          ginjector.getEventBus());
      presenter = new CodeSplitProvider<MatterActionPresenter>( ginjector.getcomanovaanovacloudclientapplicationmatterActionMatterActionPresenter() );
    }
  }
  
  public MatterActionPresenterMyProxyImpl() {
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
    String[] nameToken = {"matterAction"}; 
    String[] gatekeeperParams = null;
    setPlace(new com.gwtplatform.mvp.client.proxy.PlaceWithGatekeeper( nameToken, ginjector.getcomanovaanovacloudclientsecurityLoggedInGatekeeper() ));
    getEventBus().addHandler( com.anova.anovacloud.client.application.matterAction.event.MatterActionAddedEvent.getType(), this );
  }
  
  @Override
  public final void onMatterActionAdded( final com.anova.anovacloud.client.application.matterAction.event.MatterActionAddedEvent event ) {
    getPresenter( new NotifyingAsyncCallback<MatterActionPresenter>(getEventBus()) {
      @Override
      public void success(final MatterActionPresenter presenter) {
        Scheduler.get().scheduleDeferred( new Command() {
          @Override
          public void execute() {
            presenter.onMatterActionAdded( event );
          }
        } );
      }
    } );
  }
}
