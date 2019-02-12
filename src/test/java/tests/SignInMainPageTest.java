package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.MainPageSteps;

@RunWith(SerenityRunner.class)
public class SignInMainPageTest {

    @Managed(driver = "chrome")
    public static WebDriver _driver_serenity;

    @Steps //(actor = "Ivan Ivanov")
    MainPageSteps _main_page_steps;

    //
    @Test
    public void SignIn() {
        _driver_serenity.manage().window().maximize();
        _main_page_steps.open_main_page();
        _main_page_steps.clickSignIn(123);
    }

    @Test
    public void verifi_UI() {
        _driver_serenity.manage().window().maximize();
        _main_page_steps.open_main_page();
        _main_page_steps.big_green_button();
        _main_page_steps.open_main_page();
        _main_page_steps.big_smile_sign_up_button();
    }

    @Test
    public void entered_correct_username(){
        _driver_serenity.manage().window().maximize();
        _main_page_steps.open_main_page();
        _main_page_steps.typeUserName("KapitonSergeevichKuznecov");
        Assert.assertFalse(_main_page_steps.verifiHintFiledUsername());
    }

    @Test
    public void entered_bad_username(){
        _driver_serenity.manage().window().maximize();
        _main_page_steps.open_main_page();
        _main_page_steps.typeUserName("12");
        Assert.assertTrue(_main_page_steps.read_hint_username().equals("Username is already taken"));
    }


}
