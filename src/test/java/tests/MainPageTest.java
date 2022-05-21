package tests;

import customAnatations.JiraIssue;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;


public class MainPageTest {

    @Test
//    @JiraIssue("QC3-99")
    @DisplayName("Слайдер 'Продукты и решения'")
    @Story("Работа слайдера")
    @Tag("web")
    @Owner("buravlev")
    public void sliderProdAndSolution() {

        new MainPage()
                .openPage()
                .openSliderVirt()
                .checkUrlVirt()
                .openMoreDetailVirt()
                .checkUrlVirtPage();
    }

    @Test
//    @JiraIssue("QC3-100")
    @DisplayName("Frame Обратная связь")
    @Story("Контакты")
    @Tag("web")
    @Owner("buravlev")
    public void feedbackFrame() {

        new MainPage()
                .openPage()
                .openFeedback();
    }

    @Test
//    @JiraIssue("QC3-101")
    @DisplayName("Кнопка 'Другие новости'")
    @Story("Новости")
    @Tag("web")
    @Owner("buravlev")
    public void diffNews() {

        new MainPage()
                .openPage()
                .openNews()
                .checkUrlNews();
    }


    @Test
//    @JiraIssue("QC3-102")
    @DisplayName("Реферальные ссылки на партнеров")
    @Story("Партнеры")
    @Tag("web")
    @Owner("buravlev")
    public void partnersRef() {

            new MainPage()
                    .openPage()
                    .openPartnersLink()
                    .checkUrlNewPageRostelecom();
        }

    @Test
//    @JiraIssue("QC3-103")
    @DisplayName("Скачивания Руководства пользователя")
    @Story("Документация")
    @Tag("web")
    @Owner("buravlev")
    public void downloadUserManual() {

        new MainPage()
                .openPage()
                .openDocumentation()
                .checkUrlNewPageManual();
    }


}
