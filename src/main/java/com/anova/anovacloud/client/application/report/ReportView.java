

package com.anova.anovacloud.client.application.report;

import java.util.List;

import javax.inject.Inject;

import com.google.gwt.cell.client.TextCell;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.NoSelectionModel;
import com.anova.anovacloud.shared.dto.ActionDueDto;
import com.gwtplatform.mvp.client.ViewImpl;

public class ReportView extends ViewImpl implements ReportPresenter.MyView {
    interface Binder extends UiBinder<Widget, ReportView> {
    }

    @UiField(provided = true)
    CellTable<ActionDueDto> reportGrid;

    private final ListDataProvider<ActionDueDto> actionDuesProvider;

    @Inject
    ReportView(Binder uiBinder) {
        actionDuesProvider = new ListDataProvider<>();

        initMatterGrid();
        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void displayReport(List<ActionDueDto> actionDues) {
    	actionDuesProvider.getList().clear();
    	actionDuesProvider.getList().addAll(actionDues);
    }

    private void initMatterGrid() {
        reportGrid = new CellTable<>();
        reportGrid.setSelectionModel(new NoSelectionModel<ActionDueDto>());

        actionDuesProvider.addDataDisplay(reportGrid);

        initDataColumns();
    }

    private void initDataColumns() {
        Column<ActionDueDto, String> caseNumberColumn =
                new Column<ActionDueDto, String>(new TextCell()) {
                    @Override
                    public String getValue(ActionDueDto actionDue) {
                        return actionDue.getCaseNumber();
                    }
                };

        Column<ActionDueDto, String> clientRefNumColumn =
               new Column<ActionDueDto, String>(new TextCell()) {
                    @Override
                    public String getValue(ActionDueDto actionDue) {
                        return actionDue.getClientRefNum();
                    }
               };
                        
        Column<ActionDueDto, String> titleColumn =
               new Column<ActionDueDto, String>(new TextCell()) {
                    @Override
                    public String getValue(ActionDueDto actionDue) {
                         return actionDue.getTitle();
                    }
        };
        
        Column<ActionDueDto, String> statusColumn =
                new Column<ActionDueDto, String>(new TextCell()) {
                     @Override
                     public String getValue(ActionDueDto actionDue) {
                          return actionDue.getStatus();
                     }
         };
         Column<ActionDueDto, String> dueDateColumn =
                 new Column<ActionDueDto, String>(new TextCell()) {
                      @Override
                      public String getValue(ActionDueDto actionDue) {
                           return actionDue.getDueDate();
                      }
          };
          Column<ActionDueDto, String> actionDueColumn =
                  new Column<ActionDueDto, String>(new TextCell()) {
                       @Override
                       public String getValue(ActionDueDto actionDue) {
                            return actionDue.getActionDue();
                       }
           };
           
           Column<ActionDueDto, String> attyColumn =
                   new Column<ActionDueDto, String>(new TextCell()) {
                        @Override
                        public String getValue(ActionDueDto actionDue) {
                             return actionDue.getAtty();
                        }
            };  
            Column<ActionDueDto, String> actionRemarksColumn =
                    new Column<ActionDueDto, String>(new TextCell()) {
                         @Override
                         public String getValue(ActionDueDto actionDue) {
                              return actionDue.getActionRemarks();
                         }
             };  
           
        reportGrid.addColumn(caseNumberColumn, "Case Number");
        reportGrid.addColumn(clientRefNumColumn, "Client Ref Number");
        reportGrid.addColumn(titleColumn, "Title");
        reportGrid.addColumn(statusColumn, "Status");
        reportGrid.addColumn(dueDateColumn, "Due Date");
        reportGrid.addColumn(actionDueColumn, "Action Due");
        reportGrid.addColumn(attyColumn, "Atty");
        reportGrid.addColumn(actionRemarksColumn, "Action Remarks");
        
    }
}
