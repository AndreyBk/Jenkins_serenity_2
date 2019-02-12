package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.MainPageSteps;

@RunWith(SerenityRunner.class)
public class MainPageTest {

    @Steps (actor = "Ivan Ivanov")
    private MainPageSteps _main_page_steps;

    @Managed(driver = "chrome")
    public static WebDriver _driver_serenity;


//
    @Test
    public void SignIn() {
//        _main_page_steps.open_main_page();

        System.out.println("***MainPageTest***");
        _main_page_steps.clickSignIn(123);
//        _main_page_steps.verifi();
    }

//    @Test
//    public void Signout() {
//        _main_page_steps.open_main_page();
//
//        _main_page_steps.clickSignIn();
//
//        _main_page_steps.verifi();
//    }

}
