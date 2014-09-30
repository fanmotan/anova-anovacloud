package com.anova.anovacloud.client.application.customer.ui;

import java.util.List;

import javax.inject.Inject;

import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.event.DisplayMessageEvent;
import com.anova.anovacloud.client.application.customer.event.CustomerAddedEvent;
import com.anova.anovacloud.client.application.customer.ui.EditCustomerPresenter.MyView;
import com.anova.anovacloud.client.application.widget.message.Message;
import com.anova.anovacloud.client.application.widget.message.MessageStyle;
import com.anova.anovacloud.client.resources.EditCustomerMessages;
import com.anova.anovacloud.client.util.AbstractAsyncCallback;
import com.anova.anovacloud.client.rest.CustomerService;
import com.anova.anovacloud.client.rest.CustomerStatusService;
import com.anova.anovacloud.client.util.ErrorHandlerAsyncCallback;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.anova.anovacloud.shared.dto.CustomerStatusDto;
import com.gwtplatform.dispatch.rest.shared.RestDispatch;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.PopupView;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.proxy.RevealRootPopupContentEvent;

public class EditCustomerPresenter extends PresenterWidget<MyView> implements EditCustomerUiHandlers {
    public interface MyView extends PopupView, HasUiHandlers<EditCustomerUiHandlers> {
        void edit(CustomerDto customerDto);
        void setAllowedCustomerStatuss(List<CustomerStatusDto> customerStatusDtos);
    }

    private final RestDispatch dispatcher;
    private final CustomerService customerService;
    private final CustomerStatusService customerStatusService;
    private final EditCustomerMessages messages;

    private CustomerDto customerDto;

    @Inject
    public EditCustomerPresenter(EventBus eventBus,
                                     MyView view,
                                     RestDispatch dispatcher,
                                     CustomerService customerService,
                                     CustomerStatusService customerStatusService,
                                     EditCustomerMessages messages) {
        super(eventBus, view);

        this.dispatcher = dispatcher;
        this.customerService = customerService;
        this.customerStatusService = customerStatusService;
        this.messages = messages;

        getView().setUiHandlers(this);
    }

    @Override
    public void createNew() {
        customerDto = new CustomerDto();

        reveal();
    }

    @Override
    public void onCancel() {
        getView().hide();
    }

    @Override
    public void edit(CustomerDto customerDto) {
        this.customerDto = customerDto;
        reveal();
    }

    @Override
    public void onSave(CustomerDto customerDto) {
        dispatcher.execute(customerService.saveOrCreate(customerDto),
                new ErrorHandlerAsyncCallback<CustomerDto>(this) {
                    @Override
                    public void onSuccess(CustomerDto savedCustomer) {
                        DisplayMessageEvent.fire(EditCustomerPresenter.this,
                                new Message(messages.customerSaved(), MessageStyle.SUCCESS));
                        CustomerAddedEvent.fire(EditCustomerPresenter.this, savedCustomer);

                        getView().hide();
                    }
                });
    }

 private void reveal() {
    	
    	dispatcher.execute(customerStatusService.getCustomerStatuss(), new AbstractAsyncCallback<List<CustomerStatusDto>>() {
          
    		@Override
            public void onSuccess(List<CustomerStatusDto> statuss) {			
                onGetCustomerStatusSuccess(statuss);
            }
        });
    }
    
    private void onGetCustomerStatusSuccess(List<CustomerStatusDto> customerStatusDtos) {
        getView().setAllowedCustomerStatuss(customerStatusDtos);
        getView().edit(customerDto);
        RevealRootPopupContentEvent.fire(this, this);
    }
    
}
