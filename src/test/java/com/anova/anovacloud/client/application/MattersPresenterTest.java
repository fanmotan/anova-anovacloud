

package com.anova.anovacloud.client.application;

import java.util.ArrayList;
import java.util.List;

import org.jukito.JukitoRunner;
import org.jukito.TestSingleton;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.Range;
import com.google.inject.Inject;
import com.google.inject.TypeLiteral;
import com.anova.anovacloud.client.application.matters.MattersPresenter;
import com.anova.anovacloud.client.application.matters.matter.MatterPresenter;
import com.anova.anovacloud.client.application.matters.matter.MatterProxyFactory;
import com.anova.anovacloud.client.application.testutils.MattersServiceImpl;
import com.anova.anovacloud.client.application.testutils.PresenterTestModule;
import com.anova.anovacloud.client.application.testutils.PresenterWidgetTestBase;
import com.anova.anovacloud.client.place.NameTokens;
import com.anova.anovacloud.client.rest.MattersService;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.gwtplatform.dispatch.rest.shared.RestAction;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(JukitoRunner.class)
public class MattersPresenterTest extends PresenterWidgetTestBase {
    public static class Module extends PresenterTestModule {
        @Override
        protected void configurePresenterTest() {
            forceMock(MatterProxyFactory.class);
            bind(MattersService.class).to(MattersServiceImpl.class).in(TestSingleton.class);
        }
    }

    @Inject
    MattersPresenter mattersPresenter;
    @Inject
    MattersPresenter.MyView view;
    @Inject
    MatterProxyFactory matterProxyFactory;
    @Inject
    MatterPresenter.MyProxy proxy;

    @Test
    public void onEditMatter(PlaceManager placeManager, CustomerDto customerDto) {
        // Given
        MatterDto matterDto = mock(MatterDto.class);
        when(matterDto.getCustomer()).thenReturn(customerDto);
        when(matterProxyFactory.create(matterDto, matterDto.getCustomer().getName() + matterDto.getMatterNum()+matterDto.getMatterSerialNum())).thenReturn(proxy);
        when(proxy.getNameToken()).thenReturn("token");

        PlaceRequest placeRequest = new PlaceRequest.Builder().nameToken("token").build();

        // When
        mattersPresenter.onEdit(matterDto);

        // Then
        verify(placeManager).revealPlace(eq(placeRequest));
    }

    @Test
    public void onCreate(PlaceManager placeManager) {
        // Given
        PlaceRequest placeRequest = new PlaceRequest.Builder().nameToken(NameTokens.NEW_MATTER).build();

        // When
        mattersPresenter.onCreate();

        // Then
        verify(placeManager).revealPlace(eq(placeRequest));
    }

    @Test
    public void onDelete(MatterDto matterDto, HasData<MatterDto> hasMatterData, Range range) {
        // Given we have DeleteMatterAction
        dispatcher.given(new TypeLiteral<RestAction<Void>>() {}).willReturn(null);

        // And GetMatterAction for fetching after delete
        List<MatterDto> result = new ArrayList<>();
        dispatcher.given(new TypeLiteral<RestAction<List<MatterDto>>>() {}).willReturn(result);

        // And display is setup
        when(view.getMatterDisplay()).thenReturn(hasMatterData);

        // And range is setup
        HasData<MatterDto> display = view.getMatterDisplay();
        when(display.getVisibleRange()).thenReturn(range);

        // When
        mattersPresenter.onDelete(matterDto);

        // Then
        verify(view).setMattersCount(-1);
    }

    @Test
    public void onFetchData(ArrayList<MatterDto> matterDtos) {
        // Given
        List<MatterDto> result = new ArrayList<>();
        dispatcher.given(new TypeLiteral<RestAction<List<MatterDto>>>() {}).willReturn(result);

        // When
        mattersPresenter.fetchData(0, 1);

        // Then
        verify(view).displayMatters(0, matterDtos);
    }

    @Test
    public void onFetchDataThreeMatters(ArrayList<MatterDto> matterDtos) {
        // Given
        dispatcher.given(new TypeLiteral<RestAction<List<MatterDto>>>() {}).willReturn(matterDtos);

        // When
        mattersPresenter.fetchData(0, 3);

        // Then
        verify(view).displayMatters(0, matterDtos);
    }
}
