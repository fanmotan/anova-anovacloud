

package com.anova.anovacloud.client.application.customer;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.ApplicationPresenter;
import com.anova.anovacloud.client.application.event.ActionBarEvent;
import com.anova.anovacloud.client.application.event.ActionBarVisibilityEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent.ActionType;
import com.anova.anovacloud.client.application.customer.CustomerPresenter.MyProxy;
import com.anova.anovacloud.client.application.customer.CustomerPresenter.MyView;
import com.anova.anovacloud.client.application.customer.event.CustomerAddedEvent;
import com.anova.anovacloud.client.application.customer.ui.EditCustomerPresenter;
import com.anova.anovacloud.client.place.NameTokens;
import com.anova.anovacloud.client.rest.CustomerService;
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
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest.Builder;

public class CustomerPresenter extends Presenter<MyView, MyProxy>
        implements CustomerUiHandlers, ActionBarEvent.ActionBarHandler {

    interface MyView extends View, HasUiHandlers<CustomerUiHandlers> {
        void addCustomer(CustomerDto customerDto);

        void displayCustomers(List<CustomerDto> customerDtos);

        void removeCustomer(CustomerDto customerDto);

        void replaceCustomer(CustomerDto oldCustomer, CustomerDto newCustomer);
    }

    @ProxyCodeSplit
    @NameToken(NameTokens.CUSTOMER)
    interface MyProxy extends ProxyPlace<CustomerPresenter> {
    }

    private final RestDispatch dispatcher;
    private final PlaceManager placeManager;
    private final CustomerService customerService;
    private final EditCustomerPresenter editCustomerPresenter;

    private CustomerDto editingCustomer;

    @Inject
    CustomerPresenter(EventBus eventBus,
                          MyView view,
                          MyProxy proxy,
                          RestDispatch dispatcher,
                          CustomerService customerService,
                          PlaceManager placeManager,
                          EditCustomerPresenter editCustomerPresenter) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN_CONTENT);

        this.dispatcher = dispatcher;
        this.placeManager = placeManager;
        this.customerService = customerService;
        this.editCustomerPresenter = editCustomerPresenter;

        getView().setUiHandlers(this);
    }

    @Override
    public void onActionEvent(ActionBarEvent event) {
        if (event.getActionType() == ActionType.ADD && event.isTheSameToken(NameTokens.getCustomer())) {
            placeManager.revealPlace(new Builder().nameToken(NameTokens.getDetailCustomer()).build());
        }
    }

    @Override
    public void onDetail(CustomerDto customerDto) {
        PlaceRequest placeRequest = new Builder().nameToken(NameTokens.getDetailCustomer())
                                                 .with("id", String.valueOf(customerDto.getId()))
                                                 .build();

        placeManager.revealPlace(placeRequest);
    }

    @Override
    public void onEdit(CustomerDto customerDto) {
        editingCustomer = customerDto;
        editCustomerPresenter.edit(customerDto);
    }

    @Override
    public void onCreate() {
        editingCustomer = null;
        editCustomerPresenter.createNew();
    }

    @Override
    public void onDelete(final CustomerDto customerDto) {
        dispatcher.execute(customerService.delete(customerDto.getId()),
                new ErrorHandlerAsyncCallback<Void>(this) {
                    @Override
                    public void onSuccess(Void nothing) {
                        getView().removeCustomer(customerDto);
                    }
                });
    }

    @Override
    protected void onReveal() {
        ActionBarVisibilityEvent.fire(this, true);
        ChangeActionBarEvent.fire(this, Arrays.asList(ActionType.ADD), true);

        dispatcher.execute(customerService.getCustomers(), new AbstractAsyncCallback<List<CustomerDto>>() {
            @Override
            public void onSuccess(List<CustomerDto> customers) {
                getView().displayCustomers(customers);
            }
        });
    }

    @Override
    protected void onBind() {
        addRegisteredHandler(ActionBarEvent.getType(), this);
    }

    @ProxyEvent
    void onCustomerAdded(CustomerAddedEvent event) {
        if (editingCustomer != null) {
            getView().replaceCustomer(editingCustomer, event.getCustomer());
        } else {
            getView().addCustomer(event.getCustomer());
        }

        editingCustomer = event.getCustomer();
    }
}
