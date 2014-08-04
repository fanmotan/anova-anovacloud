
package com.anova.anovacloud.client.application.customer.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import com.anova.anovacloud.client.application.customer.event.CustomerAddedEvent.CustomerAddedHandler;
import com.anova.anovacloud.shared.dto.CustomerDto;

public class CustomerAddedEvent extends GwtEvent<CustomerAddedHandler> {
    public interface CustomerAddedHandler extends EventHandler {
        void onCustomerAdded(CustomerAddedEvent event);
    }

    public static Type<CustomerAddedHandler> getType() {
        return TYPE;
    }

    public static void fire(HasHandlers source, CustomerDto customerDto) {
        source.fireEvent(new CustomerAddedEvent(customerDto));
    }

    private static final Type<CustomerAddedHandler> TYPE = new Type<>();

    private CustomerDto customerDto;

    public CustomerAddedEvent(CustomerDto customerDto) {
        this.customerDto = customerDto;
    }

    @Override
    public Type<CustomerAddedHandler> getAssociatedType() {
        return TYPE;
    }

    public CustomerDto getCustomer() {
        return customerDto;
    }

    @Override
    protected void dispatch(CustomerAddedHandler handler) {
        handler.onCustomerAdded(this);
    }
}
