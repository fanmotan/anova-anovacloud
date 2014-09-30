package com.anova.anovacloud.client.application.matterAction;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import com.google.gwt.cell.client.ActionCell;
import com.google.gwt.cell.client.Cell;
import com.google.gwt.cell.client.DateCell;
import com.google.gwt.cell.client.TextCell;
import com.google.gwt.cell.client.ActionCell.Delegate;
import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.IdentityColumn;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.NoSelectionModel;
import com.anova.anovacloud.shared.dto.MatterActionDto;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class MatterActionView extends ViewWithUiHandlers<MatterActionUiHandlers> implements MatterActionPresenter.MyView {
    interface Binder extends UiBinder<Widget, MatterActionView> {
    }

    @UiField(provided = true)
    CellTable<MatterActionDto> matterActionGrid;

    private final ListDataProvider<MatterActionDto> matterActionDataProvider;

    @Inject
    MatterActionView(Binder uiBinder) {
        initMatterActionGrid();

        initWidget(uiBinder.createAndBindUi(this));

        matterActionDataProvider = new ListDataProvider<>();
        matterActionDataProvider.addDataDisplay(matterActionGrid);
    }

    @Override
    public void displayMatterActions(List<MatterActionDto> matterActionDtos) {
    	Collections.sort(matterActionDtos, new Comparator<MatterActionDto>() {
		    public int compare(MatterActionDto c1, MatterActionDto c2) {
		        return c1.getMatter().getCaseNum().compareTo(c2.getMatter().getCaseNum());
		    }
		});
        matterActionDataProvider.getList().clear();
        matterActionDataProvider.getList().addAll(matterActionDtos);
    }

    @Override
    public void addMatterAction(MatterActionDto matterActionDto) {
        matterActionDataProvider.getList().add(matterActionDto);
    }
/*
    @Override
    public void removeMatterAction(MatterActionDto matterActionDto) {
        matterActionDataProvider.getList().remove(matterActionDto);
    }
*/
    
    @Override
    public void replaceMatterAction(MatterActionDto oldMatterAction, MatterActionDto newMatterAction) {
        List<MatterActionDto> matterActionDtos = matterActionDataProvider.getList();
        int index = matterActionDtos.indexOf(oldMatterAction);

        matterActionDtos.add(index, newMatterAction);
        matterActionDtos.remove(index + 1);
    }
    @UiHandler("create")
    void onCreateClicked(ClickEvent event) {
        getUiHandlers().onCreate();
    }

    private void initMatterActionGrid() {
        matterActionGrid = new CellTable<>();
        matterActionGrid.setSelectionModel(new NoSelectionModel<MatterActionDto>());

        initDataColumns();
        initActionColumns();
    }
    private void initDataColumns() {
    	Column<MatterActionDto, String> caseNumColumn = new Column<MatterActionDto, String>(new TextCell()) {
            @Override
            public String getValue(MatterActionDto matterActionDto) {
                return matterActionDto.getMatter().getCaseNum();
            }
        };
        
        Column<MatterActionDto, Date> dueDateColumn = new Column<MatterActionDto, Date>(new DateCell()) {
            @Override
            public Date getValue(MatterActionDto matterActionDto) {
                return matterActionDto.getDueDate();
            }
        };
        
        Column<MatterActionDto, String> actionDueColumn = new Column<MatterActionDto, String>(new TextCell()) {
            @Override
            public String getValue(MatterActionDto matterActionDto) {
                return matterActionDto.getActionDue();
            }
        };

        Column<MatterActionDto, Date> ptoMailDateColumn = new Column<MatterActionDto, Date>(new DateCell()) {
            @Override
            public Date getValue(MatterActionDto matterActionDto) {
                return matterActionDto.getPtoMailDate();
            }
        };   
    	  
        Column<MatterActionDto, Date> responseDateColumn = new Column<MatterActionDto, Date>(new DateCell()) {
            @Override
            public Date getValue(MatterActionDto matterActionDto) {
                return matterActionDto.getResponseDate();
            }
        };    
        Column<MatterActionDto, Date> takenDateColumn = new Column<MatterActionDto, Date>(new DateCell()) {
            @Override
            public Date getValue(MatterActionDto matterActionDto) {
                return matterActionDto.getTakenDate();
            }
        };  
    	  
        Column<MatterActionDto, String> attyColumn = new Column<MatterActionDto, String>(new TextCell()) {
            @Override
            public String getValue(MatterActionDto matterActionDto) {          	
                return matterActionDto.getAtty();
            }
        }; 
    	   
        Column<MatterActionDto, String> actionRemarksColumn = new Column<MatterActionDto, String>(new TextCell()) {
            @Override
            public String getValue(MatterActionDto matterActionDto) {
                return matterActionDto.getActionRemarks();
            }
        }; 
    	    
        Column<MatterActionDto, String> actionStatusColumn = new Column<MatterActionDto, String>(new TextCell()) {
            @Override
            public String getValue(MatterActionDto matterActionDto) {
                return matterActionDto.getStatus();
            }
        }; 
    	    
        matterActionGrid.addColumn(caseNumColumn, "Case Number");
        matterActionGrid.addColumn(dueDateColumn, "Due Date");
        matterActionGrid.addColumn(actionDueColumn, "Action Due");
        matterActionGrid.addColumn(ptoMailDateColumn, "PTO Mail Date");
        matterActionGrid.addColumn(responseDateColumn, "Response Date");
        matterActionGrid.addColumn(takenDateColumn, "Date Taken");
        matterActionGrid.addColumn(attyColumn, "Atty");
        matterActionGrid.addColumn(actionRemarksColumn, "Action Remarks");
        matterActionGrid.addColumn(actionStatusColumn, "Action Status");
    }
    
    private void initActionColumns() {
    	 Cell<MatterActionDto> editCell = new ActionCell<>("Edit", new Delegate<MatterActionDto>() {
             @Override
             public void execute(MatterActionDto matterActionDto) {
                 getUiHandlers().onEdit(matterActionDto);
             }
         });
   

        IdentityColumn<MatterActionDto> editColumn = new IdentityColumn<>(editCell);
        matterActionGrid.addColumn(editColumn, "Edit");
        matterActionGrid.setColumnWidth(editColumn, 75, Style.Unit.PX);
        
    }
}
