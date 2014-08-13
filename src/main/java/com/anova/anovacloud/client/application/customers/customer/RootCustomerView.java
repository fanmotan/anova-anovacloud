

package com.anova.anovacloud.client.application.customers.customer;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.gwtplatform.mvp.client.ViewImpl;

public class RootCustomerView extends ViewImpl implements RootCustomerPresenter.MyView {
    interface Binder extends UiBinder<HTMLPanel, RootCustomerView> {
    }

    @UiField
    SimplePanel tabBarPanel;
    @UiField
    SimplePanel contentPanel;

    @Inject
    RootCustomerView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void setInSlot(Object slot, IsWidget content) {
        if (slot == RootCustomerPresenter.SLOT_TAB_BAR) {
            tabBarPanel.setWidget(content);
        } else if (slot == RootCustomerPresenter.SLOT_SetCustomerContent) {
            contentPanel.setWidget(content);
        }
    }
}
