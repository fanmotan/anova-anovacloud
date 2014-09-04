

package com.anova.anovacloud.client.application.attorney.ui;

import javax.inject.Inject;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.attorney.ui.EditAttorneyPresenter.MyView;
import com.anova.anovacloud.shared.dto.AttorneyDto;
import com.gwtplatform.mvp.client.PopupViewWithUiHandlers;

public class EditAttorneyView extends PopupViewWithUiHandlers<EditAttorneyUiHandlers> implements MyView,
        Editor<AttorneyDto> {
    interface Binder extends UiBinder<Widget, EditAttorneyView> {
    }

    interface Driver extends SimpleBeanEditorDriver<AttorneyDto, EditAttorneyView> {
    }

    @UiField
    TextBox displayName;
    @UiField
    TextBox firstName;
    @UiField
    TextBox lastName;
    @UiField
    TextBox email;
    @UiField
    TextArea mailAddress;
    @UiField
    TextBox phone;
    @UiField
    TextBox fax;

    private final Driver driver;

    @Inject
    EditAttorneyView(Binder uiBinder,
                         Driver driver,
                         EventBus eventBus) {
        super(eventBus);

        this.driver = driver;
        initWidget(uiBinder.createAndBindUi(this));

        driver.initialize(this);
    }

    @Override
    public void edit(AttorneyDto attorneyDto) {
        driver.edit(attorneyDto);
    }

    @UiHandler("save")
    void onSaveClicked(ClickEvent ignored) {
        getUiHandlers().onSave(driver.flush());
    }

    @UiHandler("close")
    void onCloseClicked(ClickEvent ignored) {
        getUiHandlers().onCancel();
    }
}
