
package com.anova.anovacloud.client.application.customers.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import com.anova.anovacloud.client.application.customers.event.CustomerAddedEvent.CustomerAddedHandler;
import com.anova.anovacloud.shared.dto.CustomerDto;

public class CustomerAddedEvent extends GwtEvent<CustomerAddedHandler> {
    public interface CustomerAddedHandler extends EventHandler {
        void onCustomerAdded(CustomerAddedEvent event);
    }

    public static Type<CustomerAddedHandler> getType() {
        return TYPE;
    }

    public static void fire(HasHandlers source, CustomerDto customerDto) {
    	 fire(source, customerDto, false);
    }

    public static void fire(HasHandlers source, CustomerDto customerDto, Boolean isNew) {
        source.fireEvent(new CustomerAddedEvent(customerDto, isNew));
    }

    private static final Type<CustomerAddedHandler> TYPE = new Type<>();

    private CustomerDto customerDto;
    private final Boolean isNew;

    public CustomerAddedEvent(CustomerDto customerDto) {
        this (customerDto, false);
    }

    public CustomerAddedEvent(CustomerDto customerDto, Boolean isNew) {

        this.customerDto = customerDto;
        this.isNew = isNew;
    }

    @Override
    public Type<CustomerAddedHandler> getAssociatedType() {
        return TYPE;
    }

    public CustomerDto getCustomer() {
        return customerDto;
    }
    
    public Boolean isNew() {
        return isNew;
    }

    @Override
    protected void dispatch(CustomerAddedHandler handler) {
        handler.onCustomerAdded(this);
    }
}
