

package com.anova.anovacloud.client.application.attorney;

import java.util.List;

import javax.inject.Inject;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.anova.anovacloud.shared.dto.AttorneyDto;
import com.anova.anovacloud.shared.dto.AttorneyStatusDto;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import com.anova.anovacloud.client.application.attorneyStatus.ui.AttorneyStatusRenderer;

public class AttorneyDetailView extends ViewWithUiHandlers<AttorneyDetailUiHandlers>
        implements AttorneyDetailPresenter.MyView, Editor<AttorneyDto> {
    interface Binder extends UiBinder<Widget, AttorneyDetailView> {
    }

    interface Driver extends SimpleBeanEditorDriver<AttorneyDto, AttorneyDetailView> {
    }

    @UiField
    TextBox displayName;
    @UiField
    TextBox firstName;
    @UiField
    TextBox lastName;
    @UiField
    TextArea mailAddress;
    @UiField
    TextBox email;
    @UiField
    TextBox phone;
    @UiField
    TextBox fax;
    @UiField(provided = true)
    ValueListBox<AttorneyStatusDto> attorneyStatus;


    private final Driver driver;

    @Inject
    AttorneyDetailView(Binder uiBinder,
                           Driver driver) {
        this.driver = driver;

        initWidget(uiBinder.createAndBindUi(this));
        attorneyStatus = new ValueListBox<>(new AttorneyStatusRenderer());
        driver.initialize(this);

        displayName.getElement().setAttribute("placeholder", "Display Name");
        firstName.getElement().setAttribute("placeholder", "First Name");
        lastName.getElement().setAttribute("placeholder", "Last Name");
        email.getElement().setAttribute("placeholder", "Attorney Email");
        mailAddress.getElement().setAttribute("placeholder", "Mailing Address");
        
        phone.getElement().setAttribute("placeholder", "Attorney Phone");
        fax.getElement().setAttribute("placeholder", "Attorney Fax");
    }

    @Override
    public void edit(AttorneyDto attorneyDto) {
    	if (attorneyDto.getAttorneyStatus() == null) {
            attorneyDto.setAttorneyStatus(attorneyStatus.getValue());
        }
        displayName.setFocus(true);
        driver.edit(attorneyDto);
    }
    
    @Override
    public void setAllowedAttorneyStatuss(List<AttorneyStatusDto> attorneyStatusDtos) {
        attorneyStatus.setValue(attorneyStatusDtos.isEmpty() ? null : attorneyStatusDtos.get(0));
        attorneyStatus.setAcceptableValues(attorneyStatusDtos);
    }
    @Override
    public void getAttorney() {
        getUiHandlers().onSave(driver.flush());
    }
}

