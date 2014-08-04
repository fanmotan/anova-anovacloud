
package com.anova.anovacloud.client.application.matters.matter.widget;

import javax.inject.Inject;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.IntegerBox;
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
    TextBox remarks;
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

        matterTitle.getElement().setAttribute("placeholder", "Title");
        applicationNum.getElement().setAttribute("placeholder", "Application No.");
        patentNum.getElement().setAttribute("placeholder", "Patent No.");
        status.getElement().setAttribute("placeholder", "Status");
        pubNum.getElement().setAttribute("placeholder", "Pub No.");
        assignee.getElement().setAttribute("placeholder", "Assignee");
        assignmentRecord.getElement().setAttribute("placeholder", "Assignment Record");
        remarks.getElement().setAttribute("placeholder", "Remarks");
        priority.getElement().setAttribute("placeholder", "Priority");
        patentTermAdj.getElement().setAttribute("placeholder", "Patent Term Adj.");
        country.getElement().setAttribute("placeholder", "Country");
        fileDate.getElement().setAttribute("placeholder", "File Date");
        issueDate.getElement().setAttribute("placeholder", "Issue Date");
        expriationDate.getElement().setAttribute("placeholder", "Expiration Date");
        pubDate.getElement().setAttribute("placeholder", "Pub Date");
        parentPCTNum.getElement().setAttribute("placeholder", "Parent/PCT No.");
        pctDate.getElement().setAttribute("placeholder", "PCT Date");
       
    }
}
