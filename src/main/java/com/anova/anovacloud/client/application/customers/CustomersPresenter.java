
package com.anova.anovacloud.client.application.customers;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.Range;
import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.ApplicationPresenter;
import com.anova.anovacloud.client.application.customers.CustomersPresenter.MyProxy;
import com.anova.anovacloud.client.application.customers.CustomersPresenter.MyView;
import com.anova.anovacloud.client.application.customers.customer.CustomerPresenter;
import com.anova.anovacloud.client.application.customers.customer.CustomerProxyFactory;
import com.anova.anovacloud.client.application.customers.event.CustomerAddedEvent;
import com.anova.anovacloud.client.application.event.ActionBarEvent;
import com.anova.anovacloud.client.application.event.ActionBarVisibilityEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent.ActionType;
import com.anova.anovacloud.client.place.NameTokens;
import com.anova.anovacloud.client.rest.CustomersService;
import com.anova.anovacloud.client.util.AbstractAsyncCallback;
import com.anova.anovacloud.client.util.ErrorHandlerAsyncCallback;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.gwtplatform.dispatch.rest.shared.RestDispatch;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.ProxyEvent;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest.Builder;

public class CustomersPresenter extends Presenter<MyView, MyProxy>
        implements CustomersUiHandlers, CustomerAddedEvent.CustomerAddedHandler, ActionBarEvent.ActionBarHandler {

    public interface MyView extends View, HasUiHandlers<CustomersUiHandlers> {
        void initDataProvider();

        void setCustomersCount(Integer result);

        void displayCustomers(int offset, List<CustomerDto> customers);

        HasData<CustomerDto> getCustomerDisplay();
    }

    @ProxyCodeSplit
    @NameToken(NameTokens.CUSTOMERS)
    public interface MyProxy extends ProxyPlace<CustomersPresenter> {
    }

    private final RestDispatch dispatcher;
    private final CustomersService customersService;
    private final PlaceManager placeManager;
    private final CustomerProxyFactory customerProxyFactory;

    @Inject
    CustomersPresenter(EventBus eventBus,
                  MyView view,
                  MyProxy proxy,
                  RestDispatch dispatcher,
                  CustomersService customersService,
                  PlaceManager placeManager,
                  CustomerProxyFactory customerProxyFactory) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN_CONTENT);

        this.dispatcher = dispatcher;
        this.customersService = customersService;
        this.placeManager = placeManager;
        this.customerProxyFactory = customerProxyFactory;

        getView().setUiHandlers(this);
    }

    @Override
    public void onActionEvent(ActionBarEvent event) {
        if (event.getActionType() == ActionType.ADD && event.isTheSameToken(NameTokens.getCustomers())) {
            placeManager.revealPlace(new Builder().nameToken(NameTokens.NEW_CUSTOMER).build());
        }
    }

    @Override
    public void onEdit(CustomerDto customerDto) {
        CustomerPresenter.MyProxy proxy = customerProxyFactory.create(customerDto,
                customerDto.getName());

        placeManager.revealPlace(new Builder().nameToken(proxy.getNameToken()).build());
    }

    @Override
    public void onCreate() {
        placeManager.revealPlace(new Builder().nameToken(NameTokens.NEW_CUSTOMER).build());
    }

    @Override
    public void fetchData(final int offset, int limit) {
        dispatcher.execute(customersService.getCustomers(offset, limit), new AbstractAsyncCallback<List<CustomerDto>>() {
            @Override
            public void onSuccess(List<CustomerDto> customers) {
                getView().displayCustomers(offset, customers);
            }
        });
    }

    @Override
    public void onDelete(CustomerDto customerDto) {
        dispatcher.execute(customersService.customer(customerDto.getId()).delete(), new ErrorHandlerAsyncCallback<Void>(this) {
            @Override
            public void onSuccess(Void nothing) {
                fetchDataForDisplay();

                getView().setCustomersCount(getView().getCustomerDisplay().getRowCount() - 1);
            }
        });
    }

    @ProxyEvent
    @Override
    public void onCustomerAdded(CustomerAddedEvent event) {
        fetchDataForDisplay();

        if (event.isNew()) {
            getView().setCustomersCount(getView().getCustomerDisplay().getRowCount() + 1);
        }
    }

    @Override
    protected void onBind() {
        addRegisteredHandler(ActionBarEvent.getType(), this);
        customerProxyFactory.create(new CustomerDto(), NameTokens.NEW_CUSTOMER);
    }

    @Override
    protected void onReveal() {
        ActionBarVisibilityEvent.fire(this, true);
        ChangeActionBarEvent.fire(this, Arrays.asList(ActionType.ADD), true);
        getView().initDataProvider();

        dispatcher.execute(customersService.getCustomersCount(), new AbstractAsyncCallback<Integer>() {
            @Override
            public void onSuccess(Integer result) {
                getView().setCustomersCount(result);
            }
        });
    }

    private void fetchDataForDisplay() {
        Range range = getView().getCustomerDisplay().getVisibleRange();
        fetchData(range.getStart(), range.getLength());
    }
}
