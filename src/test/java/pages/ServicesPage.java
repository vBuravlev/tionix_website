package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class ServicesPage {
    private String urlCloudPlatform = "https://tionix.ru/services/tionix-cloud-platform/";

    @Step("Проверяем URL страницы для продукта Вирутализации при клике на 'Подробнее'")
    public ServicesPage checkUrlVirtPage() {
        webdriver().shouldHave(url(urlCloudPlatform));
        return this;
    }

}
