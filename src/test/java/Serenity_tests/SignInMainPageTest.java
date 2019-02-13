package Serenity_tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Serenity_steps.MainPageSteps;
import Selenuim_tests.MainPageTestSelenium;

@RunWith(SerenityRunner.class)
@WithTags({
        @WithTag("color: red")
})

public class SignInMainPageTest {

    @Managed(driver = "chrome")
    public static WebDriver _driver_serenity;

    @Steps //(actor = "Ivan Ivanov")
            MainPageSteps _main_page_steps;
    MainPageTestSelenium _selenium;

    //
    @Test
//    @Ignore
    public void SignIn() {
        _driver_serenity.manage().window().maximize();
        _main_page_steps.open_main_page();
        _main_page_steps.clickSignIn(123);
    }

    @Test
//    @Ignore
    public void verifi_UI() {
        _driver_serenity.manage().window().maximize();
        _main_page_steps.open_main_page();
        _main_page_steps.big_green_button();
        _main_page_steps.open_main_page();
        _main_page_steps.big_smile_sign_up_button();
    }

    @Test
//    @Ignore
    public void entered_correct_username() {
        _driver_serenity.manage().window().maximize();
        _main_page_steps.open_main_page();
        _main_page_steps.typeUserName("KapitonSergeevichKuznecov");
        Assert.assertFalse(_main_page_steps.verifiHintFiledUsername());
    }

    @Test
    @WithTag ("color: blue")
//    @Pending
    public void entered_bad_username() {
        _driver_serenity.manage().window().maximize();
        _main_page_steps.open_main_page();
        _main_page_steps.typeUserName("12");
        Assert.assertTrue(_main_page_steps.read_hint_username().equals("Username is already taken"));
    }


}
