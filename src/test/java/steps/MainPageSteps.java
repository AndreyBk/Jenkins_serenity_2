package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import qxz.MainPageTestSelenium;


public class MainPageSteps {
//    @Steps
    MainPageTestSelenium _main_page;
//    public static MainPage _main_page_;

    String actor;



    @Step("#actor  press key SignIn {0}")
    public void clickSignIn(int _a) {//перейти на страницу входа для зарегистрированного пользователя
        System.out.println("***MainPageSteps***   clickSignIn");
        _main_page.SignIn();

//        Assert.assertTrue(true);
    }






    @Step("открыть")
    public void open_main_page() {
        Assert.assertFalse(false);
    }



    @Step
    public void verifi() {
        Assert.assertTrue(true);

    }

//    public void SignIn() {
//        SignInPage _login_page = _main_page.SignIn();
//        System.out.println(_login_page.getHiderSignInPage());
//        Assert.assertTrue(_login_page.getHiderSignInPage().equals("Sign in to GitHub"));
//    }
}
