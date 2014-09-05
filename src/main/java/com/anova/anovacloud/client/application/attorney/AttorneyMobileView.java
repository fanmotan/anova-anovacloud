

package com.anova.anovacloud.client.application.attorney;

import java.util.List;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.anova.anovacloud.client.application.attorney.AttorneyPresenter.MyView;
import com.anova.anovacloud.client.application.attorney.renderer.AttorneyCell;
import com.anova.anovacloud.client.resources.MobileDataListStyle;
import com.anova.anovacloud.shared.dto.AttorneyDto;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class AttorneyMobileView extends ViewWithUiHandlers<AttorneyUiHandlers> implements MyView {
    interface Binder extends UiBinder<Widget, AttorneyMobileView> {
    }

    @UiField(provided = true)
    CellList<AttorneyDto> attorneyList;

    private final ListDataProvider<AttorneyDto> attorneyDataProvider;
    private final SingleSelectionModel<AttorneyDto> selectionModel;

    @Inject
    AttorneyMobileView(Binder uiBinder,
                           AttorneyCell attorneyCell,
                           MobileDataListStyle mobileDataListStyle) {
        attorneyList = new CellList<>(attorneyCell, mobileDataListStyle);

        initWidget(uiBinder.createAndBindUi(this));

        attorneyDataProvider = new ListDataProvider<>();
        attorneyDataProvider.addDataDisplay(attorneyList);
        selectionModel = new SingleSelectionModel<>();
        attorneyList.setSelectionModel(selectionModel);

        selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
            @Override
            public void onSelectionChange(SelectionChangeEvent event) {
                getUiHandlers().onDetail(selectionModel.getSelectedObject());
            }
        });
    }

    @Override
    public void displayAttorneys(List<AttorneyDto> attorneyDtos) {
        attorneyDataProvider.getList().clear();
        attorneyDataProvider.getList().addAll(attorneyDtos);
    }

    @Override
    public void addAttorney(AttorneyDto attorneyDto) {
        attorneyDataProvider.getList().add(attorneyDto);
    }
/*
    @Override
    public void removeAttorney(AttorneyDto attorneyDto) {
        attorneyDataProvider.getList().remove(attorneyDto);
    }
    */

    @Override
    public void replaceAttorney(AttorneyDto oldAttorney, AttorneyDto newAttorney) {
        List<AttorneyDto> attorneyDtos = attorneyDataProvider.getList();
        int index = attorneyDtos.indexOf(oldAttorney);

        attorneyDtos.add(index, newAttorney);
        attorneyDtos.remove(index + 1);
    }
}
