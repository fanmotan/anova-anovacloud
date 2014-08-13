

package com.anova.anovacloud.client.application.customers.customer;

import javax.inject.Inject;

import java.util.Arrays;
import java.util.List;

import com.google.gwt.user.client.Window;
import com.google.inject.assistedinject.Assisted;
import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.event.DisplayMessageEvent;
import com.anova.anovacloud.client.application.customers.event.CustomerAddedEvent;
import com.anova.anovacloud.client.application.customers.customer.CustomerPresenter.MyView;
import com.anova.anovacloud.client.application.customers.customer.navigation.NavigationTab;
import com.anova.anovacloud.client.application.customers.customer.navigation.NavigationTabEvent;
import com.anova.anovacloud.client.application.event.ActionBarEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent.ActionType;
import com.anova.anovacloud.client.application.event.GoBackEvent;
import com.anova.anovacloud.client.application.widget.message.Message;
import com.anova.anovacloud.client.application.widget.message.MessageStyle;
import com.anova.anovacloud.client.place.NameTokens;
import com.anova.anovacloud.client.resources.CustomerMessages;
import com.anova.anovacloud.client.rest.CustomersService;
import com.anova.anovacloud.client.util.ErrorHandlerAsyncCallback;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.gwtplatform.dispatch.rest.shared.RestDispatch;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;

public class CustomerPresenter extends Presenter<MyView, CustomerPresenter.MyProxy>
				implements CustomerUiHandlers, NavigationTab, GoBackEvent.GoBackHandler, ActionBarEvent.ActionBarHandler {
    public interface MyView extends View, HasUiHandlers<CustomerUiHandlers> {
        void edit(CustomerDto customerDto);
        void resetFields(CustomerDto customerDto);
        void getCustomer();
    }
    public interface MyProxy extends ProxyPlace<CustomerPresenter> {
    }
    private final RestDispatch dispatcher;
    private final CustomersService customersService;
    private final CustomerMessages messages;
    private final PlaceManager placeManager;
    private final CustomerProxyFactory customerProxyFactory;

    private CustomerDto customerDto;

    @Inject
    public CustomerPresenter(EventBus eventBus,
                                     MyView view,
                                     RestDispatch dispatcher,
                                     CustomersService customersService,
                                     PlaceManager placeManager,
                                     CustomerProxyFactory customerProxyFactory,
                                     CustomerMessages messages,
                                     @Assisted MyProxy proxy,
                                     @Assisted CustomerDto customerDto) {
        super(eventBus, view, proxy, RootCustomerPresenter.SLOT_SetCustomerContent);

        this.dispatcher = dispatcher;
        this.customersService = customersService;
        this.messages = messages;
        this.placeManager = placeManager;
        this.customerProxyFactory = customerProxyFactory;
        this.customerDto = customerDto != null ? customerDto : new CustomerDto();
        getView().setUiHandlers(this);
    }

   
	@Override
	public void onActionEvent(ActionBarEvent event) {
		 if (event.isTheSameToken(NameTokens.NEW_CUSTOMER)) {
	            if (event.getActionType() == ActionType.DONE) {
	                getView().getCustomer();
	            }
	        } else if (event.isTheSameToken(customerDto.getName())) {
	            if (event.getActionType() == ActionType.UPDATE) {
	                getView().getCustomer();
	            } else if (event.getActionType() == ActionType.DELETE) {
	                onDeleteCustomer();
	            }
	        }
	}

	@Override
	public void onGoBack(GoBackEvent event) {
		placeManager.revealPlace(new PlaceRequest.Builder().nameToken(NameTokens.getCustomers()).build());
	}
	
	@Override
    public void onCancel() {
        NavigationTabEvent.fireClose(this, this);
    }

    @Override
    public void onSave(final CustomerDto customerDto) {
        dispatcher.execute(customersService.saveOrCreate(customerDto), new ErrorHandlerAsyncCallback<CustomerDto>(this) {
            @Override
            public void onSuccess(CustomerDto newCustomer) {
                onCustomerSaved(customerDto, newCustomer);
            }
        });
    }

	@Override
	public String getName() {
		 if (customerDto.getId() != null) {
	            return customerDto.getName();
	        } else {
	            return "New Customer";
	        }
	}

	@Override
	public String getToken() {
		return getProxy().getNameToken();
	}

	@Override
	public boolean isClosable() {
		return true;
	}
	
	 @Override
	    protected void onBind() {
	        addRegisteredHandler(GoBackEvent.getType(), this);
	        addRegisteredHandler(ActionBarEvent.getType(), this);
	    }

	    @Override
	    protected void onReveal() {
	        Boolean createNew = placeManager.getCurrentPlaceRequest().matchesNameToken(NameTokens.NEW_CUSTOMER);
	        List<ActionType> actions;
	        if (createNew) {
	            actions = Arrays.asList(ActionType.DONE);
	            ChangeActionBarEvent.fire(this, actions, false);
	        } else {
	            actions = Arrays.asList(ActionType.DELETE, ActionType.UPDATE);
	            ChangeActionBarEvent.fire(this, actions, false);
	        }

	        NavigationTabEvent.fireReveal(this, this);
	    }

	  

	    private void onCustomerSaved(CustomerDto oldCustomer, CustomerDto newCustomer) {
	        DisplayMessageEvent.fire(CustomerPresenter.this, new Message(messages.customerSaved(), MessageStyle.SUCCESS));
	        CustomerAddedEvent.fire(CustomerPresenter.this, newCustomer, oldCustomer.getId() == null);

	        if (oldCustomer.getId() == null) {
	            customerDto = new CustomerDto();
	            getView().resetFields(customerDto);

	            MyProxy proxy = customerProxyFactory.create(newCustomer, newCustomer.getName());

	            placeManager.revealPlace(new PlaceRequest.Builder().nameToken(proxy.getNameToken()).build());
	        }
	    }

	    private void onDeleteCustomer() {
	        Boolean confirm = Window.confirm("Are you sure you want to delete " + customerDto.getName()+ "?");
	        if (confirm) {
	            dispatcher.execute(customersService.customer(customerDto.getId()).delete(), new ErrorHandlerAsyncCallback<Void>(this) {
	                @Override
	                public void onSuccess(Void nothing) {
	                    NavigationTabEvent.fireClose(CustomerPresenter.this, CustomerPresenter.this);
	                }
	            });
	        }
	    }

	
}
