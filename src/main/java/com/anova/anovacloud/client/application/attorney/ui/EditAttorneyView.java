

package com.anova.anovacloud.client.application.attorney.ui;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.inject.Inject;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.attorney.ui.EditAttorneyPresenter.MyView;
import com.anova.anovacloud.client.application.attorneyStatus.ui.AttorneyStatusRenderer;
import com.anova.anovacloud.shared.dto.AttorneyDto;
import com.anova.anovacloud.shared.dto.AttorneyStatusDto;
import com.anova.anovacloud.shared.dto.MatterActionStatusDto;
import com.gwtplatform.mvp.client.PopupViewWithUiHandlers;

public class EditAttorneyView extends PopupViewWithUiHandlers<EditAttorneyUiHandlers> implements MyView,
        Editor<AttorneyDto> {
    interface Binder extends UiBinder<Widget, EditAttorneyView> {
    }

    interface Driver extends SimpleBeanEditorDriver<AttorneyDto, EditAttorneyView> {
    }

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
    @UiField(provided = true)
    ValueListBox<AttorneyStatusDto> attorneyStatus;

    private final Driver driver;

    @Inject
    EditAttorneyView(Binder uiBinder,
                         Driver driver,
                         EventBus eventBus) {
        super(eventBus);
        attorneyStatus = new ValueListBox<>(new AttorneyStatusRenderer());
        this.driver = driver;
        initWidget(uiBinder.createAndBindUi(this));

        driver.initialize(this);
    }

    @Override
    public void edit(AttorneyDto attorneyDto) {
    	if (attorneyDto.getAttorneyStatus() == null) {
            attorneyDto.setAttorneyStatus(attorneyStatus.getValue());
        }
        driver.edit(attorneyDto);
    }
    @Override
    public void setAllowedAttorneyStatuss(List<AttorneyStatusDto> attorneyStatusDtos) {
    	Collections.sort(attorneyStatusDtos, new Comparator<AttorneyStatusDto>() {
		    public int compare(AttorneyStatusDto c1, AttorneyStatusDto c2) {
		        return c1.getStatusValue().compareTo(c2.getStatusValue());
		    }
		});
        attorneyStatus.setValue(attorneyStatusDtos.isEmpty() ? null : attorneyStatusDtos.get(0));
        attorneyStatus.setAcceptableValues(attorneyStatusDtos);
        
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
