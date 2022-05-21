package pages;

import config.Project;
import tests.BaseTest;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;
import static org.assertj.core.api.Assertions.assertThat;


public class MainPage {

    //Метаинформация на главной странице
    private SelenideElement
            headerTitle = $x("//h1[text()='ТИОНИКС']");

    //Новости
    private SelenideElement
            newsOfCompany = $x("//div[text()='Новости компании']"),
            news = $x("//a[@href='/news']");

    private String
            urlNews = "https://tionix.ru/news";

    //Реферальные ссылки на партнеров
    private SelenideElement
            groupCompany = $x("//div[text()='Входим в группу компаний']"),
            logoRostelecom = $x("//img[contains(@src,'Logo_Rostelecom.svg')]");

    private String
            urlRostelecom = ".rt.ru";

    //Документация
    private SelenideElement
            documentation = $x("//div[text()='Документация']"),
            manualTionix = $x("//a[text()='Руководство пользователя']");

    private String
            urlManualTionix = "https://files.tionix.ru/";

    //Виртуализация облака (слайдер)
    private SelenideElement
            support = $x("//div[text()='Русскоязычная служба технической поддержки, работающая в режиме 24/7*365']"),
            productVirt = $x("//div[text()='Виртуализация облака ']");

    private String
            urlSliderProd = "https://tionix.ru/#!/tab/276762841-2",
            urlCloudPlatform = "https://tionix.ru/services/tionix-cloud-platform/";


    //Обратная связь
    private SelenideElement
            moreDetailedVirt = $x("//div[text()='TIONIX Cloud Platform']/../a[@href='/services/tionix-cloud-platform/']"),
            feedbackPopUp = $("div.t-popup__container>div>div"),
            feedbackButton = $x("//a[text()='Напишите нам']");

    private String
            feedbackTitle = "Обратная связь ";


    //Действия на странице

    @Step("Открываем главную страницу")
    public MainPage openPage() {
//        open(Project.config.urlWebSite());
        open("https://tionix.ru/");
        headerTitle.shouldBe(visible);
        return this;
    }

    @Step("Открываем продукт Вирутализация на слайдере")
    public MainPage openSliderVirt() {
        support.scrollTo();
        productVirt.click();
        return this;
    }

    @Step("Открываем подробную информацию про продукту Вирутализация на слайдере")
    public MainPage openMoreDetailVirt() {
        moreDetailedVirt.click();
        return this;
    }

    @Step("Открываем форму обратной связи")
    public MainPage openFeedback() {
        feedbackButton.scrollTo().click();
        String feedBack = feedbackPopUp.text();
        assertThat(feedBack.equals(feedbackTitle));
        return this;
    }

    @Step("Кликаем по кнопке 'Другие новости'")
    public MainPage openNews() {
        newsOfCompany.scrollTo();
        news.click();
        return this;
    }

    @Step("Кликаем по логотипу Ростелеком в слайдере 'Партнеры'")
    public MainPage openPartnersLink() {
        groupCompany.scrollTo();
        logoRostelecom.click();
        return this;
    }

    @Step("Открываем руководство пользователя")
    public MainPage openDocumentation() {
        documentation.scrollTo();
        manualTionix.click();
        return this;
    }

    //Проверки на странице

    @Step("Проверяем URL страницы для продукта Вирутализации при использовании слайдера")
    public MainPage checkUrlVirt() {
        webdriver().shouldHave(url(urlSliderProd ));
        return this;
    }

    @Step("Проверяем URL страницы для продукта Вирутализации при клике на 'Подробнее'")
    public MainPage checkUrlVirtPage() {
        webdriver().shouldHave(url(urlCloudPlatform));
        return this;
    }

    @Step("Проверяем URL страницы для Новостей")
    public MainPage checkUrlNews() {
        webdriver().shouldHave(url(urlNews));
        return this;
    }

    @Step("Проверяем URL страницы для реферальной ссылки Ростелеком")
    public MainPage checkUrlNewPageRostelecom() {
        switchTo().window(1);
        webdriver().shouldHave(urlContaining(urlRostelecom));
        sleep(3000);
        Selenide.closeWindow();
        return this;
    }

    @Step("Проверяем URL страницы для Руководства пользователя")
    public MainPage checkUrlNewPageManual() {
        switchTo().window(1);
        webdriver().shouldHave(urlContaining(urlManualTionix));
        sleep(3000);
        Selenide.closeWindow();
        return this;
    }

}
