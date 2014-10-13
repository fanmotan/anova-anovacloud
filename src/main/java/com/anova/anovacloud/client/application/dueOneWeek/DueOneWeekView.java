package com.anova.anovacloud.client.application.dueOneWeek;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import com.google.gwt.cell.client.DateCell;
import com.google.gwt.cell.client.TextCell;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.NoSelectionModel;
import com.anova.anovacloud.shared.dto.MatterActionDto;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.gwtplatform.mvp.client.ViewImpl;

public class DueOneWeekView extends ViewImpl implements DueOneWeekPresenter.MyView {
    interface Binder extends UiBinder<Widget, DueOneWeekView> {
    }

    @UiField(provided = true)
    CellTable<MatterActionDto> reportGrid;

    private final ListDataProvider<MatterActionDto> actionDuesProvider;

    @Inject
    DueOneWeekView(Binder uiBinder) {
        actionDuesProvider = new ListDataProvider<>();

        initMatterGrid();
        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void displayReport(List<MatterActionDto> actionDues) {
    	actionDuesProvider.getList().clear();
    	
    	List <MatterActionDto> results = new ArrayList<>();
    	for (MatterActionDto actionDto : actionDues){
			Date dueDate = actionDto.getDueDate();
			String status = actionDto.getStatus();
			if (dueDate != null && status != null)
			{
				if (!status.equalsIgnoreCase("closed") )
				{
					Date today = new Date();
					long diff =  dueDate.getTime() - today.getTime();

                    int diffDay = (int)diff/(100*60*60*24);
					
				    if (diffDay < 8 )
					{
						results.add (new MatterActionDto(actionDto.getMatter(), actionDto.getDueDate(), actionDto.getActionDue(), actionDto.getPtoMailDate(), actionDto.getResponseDate(),
								actionDto.getTakenDate(), actionDto.getAssignee1(), actionDto.getAssignee1Role(), actionDto.getAssignee2(), 
								actionDto.getAssignee2Role(), actionDto.getAssignee3(), actionDto.getAssignee3Role(), actionDto.getActionRemarks(),
								actionDto.getActionStatus()));
					}
					
				}
			}
			
    	}
    	Collections.sort(results, new Comparator<MatterActionDto>() {
		    public int compare(MatterActionDto c1, MatterActionDto c2) {
		        return c1.getMatter().getCaseNum().compareTo(c2.getMatter().getCaseNum());
		    }
		});
    	
    	actionDuesProvider.getList().addAll(results);
    }

   
    
    private void initMatterGrid() {
        reportGrid = new CellTable<>();
        reportGrid.setSelectionModel(new NoSelectionModel<MatterActionDto>());

        actionDuesProvider.addDataDisplay(reportGrid);

        initDataColumns();
    }

    private void initDataColumns() {
    	DateTimeFormat format = DateTimeFormat.getShortDateFormat();
    	
        Column<MatterActionDto, String> caseNumberColumn =
                new Column<MatterActionDto, String>(new TextCell()) {
                    @Override
                    public String getValue(MatterActionDto actionDue) {
                        return actionDue.getMatter().getCaseNum();
                    }
                };

                        
        Column<MatterActionDto, String> titleColumn =
               new Column<MatterActionDto, String>(new TextCell()) {
                    @Override
                    public String getValue(MatterActionDto actionDue) {
                         return actionDue.getMatter().getMatterProperties().getCaseTitle();
                    }
        };
        
        Column<MatterActionDto, String> statusColumn =
                new Column<MatterActionDto, String>(new TextCell()) {
                     @Override
                     public String getValue(MatterActionDto actionDue) {
                          return actionDue.getStatus();
                     }
         };
         Column<MatterActionDto, Date> dueDateColumn = 
        		 new Column<MatterActionDto, Date>(new DateCell(format)) {
             @Override
             public Date getValue(MatterActionDto actionDue) {
                 return actionDue.getDueDate();
             }
         };
         
     
          Column<MatterActionDto, String> actionDueColumn =
                  new Column<MatterActionDto, String>(new TextCell()) {
                       @Override
                       public String getValue(MatterActionDto actionDue) {
                            return actionDue.getActionDue();
                       }
           };
           
           Column<MatterActionDto, String> attyColumn =
                   new Column<MatterActionDto, String>(new TextCell()) {
                        @Override
                        public String getValue(MatterActionDto actionDue) {
                             return actionDue.getAtty();
                        }
            };  
            Column<MatterActionDto, String> actionRemarksColumn =
                    new Column<MatterActionDto, String>(new TextCell()) {
                         @Override
                         public String getValue(MatterActionDto actionDue) {
                              return actionDue.getActionRemarks();
                         }
             };  
           
        reportGrid.addColumn(caseNumberColumn, "Case Number");
        reportGrid.addColumn(titleColumn, "Title");
        reportGrid.addColumn(statusColumn, "Status");
        reportGrid.addColumn(dueDateColumn, "Due Date");
        reportGrid.addColumn(actionDueColumn, "Action Due");
        reportGrid.addColumn(attyColumn, "Atty");
        reportGrid.addColumn(actionRemarksColumn, "Action Remarks");
        
    }
}
