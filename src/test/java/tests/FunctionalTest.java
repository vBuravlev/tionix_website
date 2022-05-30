package tests;


import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.FilesStoragePage;
import pages.MainPage;
import pages.RostelecomPage;
import pages.ServicesPage;

public class FunctionalTest extends BaseTest {

    @Test
    @DisplayName("Слайдер 'Продукты и решения'")
    @Story("Работа слайдера")
    @Tag("web")
    @Owner("buravlev")
    public void sliderProdAndSolution() {
        new MainPage()
                .openPage()
                .openSliderVirt()
                .checkUrlVirt()
                .openMoreDetailVirt();

        new ServicesPage()
                .checkUrlVirtPage();
    }

    @Test
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
    @DisplayName("Реферальные ссылки на партнеров")
    @Story("Партнеры")
    @Tag("web")
    @Owner("buravlev")
    public void partnersRef() {

        new MainPage()
                .openPage()
                .openPartnersLink();

        new RostelecomPage()
                .checkUrlNewPageRostelecom();
    }

    @Test
    @DisplayName("Скачивания Руководства пользователя")
    @Story("Документация")
    @Tag("web")
    @Owner("buravlev")
    public void downloadUserManual() {

        new MainPage()
                .openPage()
                .openDocumentation();

        new FilesStoragePage()
                .checkUrlNewPageManual();
    }

}
