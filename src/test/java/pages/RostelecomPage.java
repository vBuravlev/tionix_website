package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class RostelecomPage {
    private String
            urlRostelecom = ".rt.ru";

    @Step("Проверяем URL страницы для реферальной ссылки Ростелеком")
    public RostelecomPage checkUrlNewPageRostelecom() {
        switchTo().window(1);
        webdriver().shouldHave(urlContaining(urlRostelecom));
        sleep(3000);
        return this;
    }

}
