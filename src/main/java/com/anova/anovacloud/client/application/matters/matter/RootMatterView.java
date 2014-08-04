

package com.anova.anovacloud.client.application.matters.matter;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.gwtplatform.mvp.client.ViewImpl;

public class RootMatterView extends ViewImpl implements RootMatterPresenter.MyView {
    interface Binder extends UiBinder<HTMLPanel, RootMatterView> {
    }

    @UiField
    SimplePanel tabBarPanel;
    @UiField
    SimplePanel contentPanel;

    @Inject
    RootMatterView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void setInSlot(Object slot, IsWidget content) {
        if (slot == RootMatterPresenter.SLOT_TAB_BAR) {
            tabBarPanel.setWidget(content);
        } else if (slot == RootMatterPresenter.SLOT_SetMatterContent) {
            contentPanel.setWidget(content);
        }
    }
}
