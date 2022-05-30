package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class FilesStoragePage {

    private String
            urlManualTionix = "https://files.tionix.ru/";

    @Step("Проверяем URL страницы для Руководства пользователя")
    public FilesStoragePage checkUrlNewPageManual() {
        switchTo().window(1);
        webdriver().shouldHave(urlContaining(urlManualTionix));
        sleep(3000);
        return this;
    }

}
