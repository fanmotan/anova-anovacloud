
package com.anova.anovacloud.client.application.matters.matter.widget;

import javax.inject.Inject;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.anova.anovacloud.shared.dto.MatterPropertiesDto;

public class MatterPropertiesEditor extends Composite implements Editor<MatterPropertiesDto> {
    interface Binder extends UiBinder<Widget, MatterPropertiesEditor> {
    }

    @UiField
    TextBox matterTitle;
    @UiField
    TextBox applicationNum;
    @UiField
    TextBox patentNum;
    @UiField
    TextBox status;
    @UiField
    TextBox pubNum;
    @UiField
    TextBox assignee;
    @UiField
    TextBox assignmentRecord;
    @UiField
    TextArea remarks;
    @UiField
    TextBox priority;
    @UiField
    TextBox patentTermAdj;
    @UiField
    TextBox country; 
    @UiField
    DateBox fileDate;
    @UiField
    DateBox issueDate;
    @UiField
    DateBox expriationDate;
    @UiField
    DateBox pubDate;
    @UiField
    TextBox parentPCTNum;
    @UiField
    DateBox pctDate;
   
    
    @Inject
    MatterPropertiesEditor(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        DateTimeFormat format = DateTimeFormat.getShortDateFormat();
    	
        fileDate.setFormat(new DateBox.DefaultFormat(format));
        issueDate.setFormat(new DateBox.DefaultFormat(format));
        expriationDate.setFormat(new DateBox.DefaultFormat(format));
        pubDate.setFormat(new DateBox.DefaultFormat(format));
        pctDate.setFormat(new DateBox.DefaultFormat(format));

       
    }
}
