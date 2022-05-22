package tests;

import customAnatations.JiraIssue;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

@JiraIssue("tionix_web")
public class MainPageTest extends BaseTest {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Слайдер 'Продукты и решения'")
    @Story("Работа слайдера")
    @Tag("web")
    @Owner("buravlev")
    public void sliderProdAndSolution() {

        mainPage
                .openPage()
                .openSliderVirt()
                .checkUrlVirt()
                .openMoreDetailVirt()
                .checkUrlVirtPage();
    }

    @Test
    @DisplayName("Frame Обратная связь")
    @Story("Контакты")
    @Tag("web")
    @Owner("buravlev")
    public void feedbackFrame() {

        mainPage
                .openPage()
                .openFeedback();
    }

    @Test
    @DisplayName("Кнопка 'Другие новости'")
    @Story("Новости")
    @Tag("web")
    @Owner("buravlev")
    public void diffNews() {

        mainPage
                .openPage()
                .openNews()
                .checkUrlNews();
    }


    @Test
    @DisplayName("Реферальные ссылки на партнеров")
    @Story("Партнеры")
    @Tag("web")
    @Owner("buravlev")
    public void partnersRef() {

        mainPage
                .openPage()
                .openPartnersLink()
                .checkUrlNewPageRostelecom();
    }

    @Test
    @DisplayName("Скачивания Руководства пользователя")
    @Story("Документация")
    @Tag("web")
    @Owner("buravlev")
    public void downloadUserManual() {

        mainPage
                .openPage()
                .openDocumentation()
                .checkUrlNewPageManual();
    }


}
