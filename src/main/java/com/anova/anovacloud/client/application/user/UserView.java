

package com.anova.anovacloud.client.application.user;

import java.util.List;

import javax.inject.Inject;

import com.google.gwt.cell.client.ActionCell;
import com.google.gwt.cell.client.ActionCell.Delegate;
import com.google.gwt.cell.client.Cell;
import com.google.gwt.cell.client.TextCell;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.IdentityColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.NoSelectionModel;
import com.anova.anovacloud.client.application.user.UserPresenter.MyView;
import com.anova.anovacloud.shared.dto.UserDto;
import com.anova.anovacloud.shared.dto.UserRoleDto;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class UserView extends ViewWithUiHandlers<UserUiHandlers> implements MyView {
    interface Binder extends UiBinder<Widget, UserView> {
    }

    @UiField(provided = true)
    CellTable<UserDto> userGrid;

    private final ListDataProvider<UserDto> userDataProvider;

    @Inject
    UserView(Binder uiBinder) {
        initUserGrid();

        initWidget(uiBinder.createAndBindUi(this));

        userDataProvider = new ListDataProvider<>();
        userDataProvider.addDataDisplay(userGrid);
    }

    @Override
    public void displayUsers(List<UserDto> userDtos) {
        userDataProvider.getList().clear();
        userDataProvider.getList().addAll(userDtos);
    }

    @Override
    public void addUser(UserDto userDto) {
        userDataProvider.getList().add(userDto);
    }

    @Override
    public void removeUser(UserDto userDto) {
        userDataProvider.getList().remove(userDto);
    }

    @Override
    public void replaceUser(UserDto oldUser, UserDto newUser) {
        List<UserDto> userDtos = userDataProvider.getList();
        int index = userDtos.indexOf(oldUser);

        userDtos.add(index, newUser);
        userDtos.remove(index + 1);
    }

    @UiHandler("create")
    void onCreateClicked(ClickEvent ignored) {
        getUiHandlers().onCreate();
    }

    private void initUserGrid() {
        userGrid = new CellTable<>();
        userGrid.setSelectionModel(new NoSelectionModel<UserDto>());

        initDataColumns();
        initActionColumns();
    }

    private void initDataColumns() {
    	/*
        Column<UserDto, Number> idColumn = new Column<UserDto, Number>(new NumberCell()) {
            @Override
            public Long getValue(UserDto userDto) {
                return userDto.getId();
            }
        };
        */

        Column<UserDto, String> displayNameColumn = new Column<UserDto, String>(new TextCell()) {
            @Override
            public String getValue(UserDto userDto) {
                return userDto.getDisplayName();
            }
        };
        
        Column<UserDto, String> firstNameColumn = new Column<UserDto, String>(new TextCell()) {
            @Override
            public String getValue(UserDto userDto) {
                return userDto.getFirstName();
            }
        };
        Column<UserDto, String> lastNameColumn = new Column<UserDto, String>(new TextCell()) {
            @Override
            public String getValue(UserDto userDto) {
                return userDto.getLastName();
            }
        };
        Column<UserDto, String> usernameColumn = new Column<UserDto, String>(new TextCell()) {
            @Override
            public String getValue(UserDto userDto) {
                return userDto.getUsername();
            }
        };
        /*
        Column<UserDto, String> hashPasswordColumn = new Column<UserDto, String>(new TextCell()) {
            @Override
            public String getValue(UserDto userDto) {
                return userDto.getHashPassword();
            }
        };
        */
        Column<UserDto, String> roleColumn = new Column<UserDto, String>(new TextCell()) {
            @Override
            public String getValue(UserDto userDto) {
            	 UserRoleDto userRole = userDto.getUserRole();
                 return userRole == null ? "" : userRole.getRoleName();
            }
        };
       
        Column<UserDto, String> emailColumn = new Column<UserDto, String>(new TextCell()) {
            @Override
            public String getValue(UserDto userDto) {
                return userDto.getEmail();
            }
        };
       
        //userGrid.addColumn(idColumn, "ID");
        userGrid.addColumn(displayNameColumn, "Display Name");
        userGrid.addColumn(firstNameColumn, "First Name");
        userGrid.addColumn(lastNameColumn, "Last Name");
        userGrid.addColumn(usernameColumn, "Username");
       // userGrid.addColumn(hashPasswordColumn, "Password");
        userGrid.addColumn(roleColumn, "Role");
        userGrid.addColumn(emailColumn, "Email");
        
        
       // userGrid.setColumnWidth(idColumn, 50, Unit.PX);
    }

    private void initActionColumns() {
        Cell<UserDto> editCell = new ActionCell<>("Edit", new Delegate<UserDto>() {
            @Override
            public void execute(UserDto userDto) {
                getUiHandlers().onEdit(userDto);
            }
        });

        Cell<UserDto> deleteCell = new ActionCell<>("Delete", new Delegate<UserDto>() {
            @Override
            public void execute(UserDto userDto) {
                Boolean confirm = Window.confirm("Are you sure you want to delete " + userDto.getDisplayName() + "?");

                if (confirm) {
                    getUiHandlers().onDelete(userDto);
                }
            }
        });

        IdentityColumn<UserDto> editColumn = new IdentityColumn<>(editCell);
        IdentityColumn<UserDto> deleteColumn = new IdentityColumn<>(deleteCell);

        userGrid.addColumn(editColumn, "Edit");
        userGrid.addColumn(deleteColumn, "Delete");

        userGrid.setColumnWidth(editColumn, 75, Unit.PX);
        userGrid.setColumnWidth(deleteColumn, 75, Unit.PX);
    }
}
