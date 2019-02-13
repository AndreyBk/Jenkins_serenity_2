package Serenity_steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import page_objects.MainPage;
import page_objects.SignInPage;
import page_objects.SignUpPage;


public class MainPageSteps {

    MainPage _main_page;
    SignInPage _sign_in_page;
    SignUpPage _sign_up_page;


    @Step("открыть")
    public void open_main_page() {
        _main_page.open();
    }

    @Step("#actor  press key SignIn {0}")
    public void clickSignIn(int _a) {//перейти на страницу входа для зарегистрированного пользователя
        _main_page.clickSignIn();
        _sign_in_page.getHiderSignInPage();
        Assert.assertTrue(_sign_in_page.getHiderSignInPage().equals("Sign in to GitHub"));
    }

    @Step
    public void big_green_button() {
        _main_page.clickSignUpForGit();//
        Assert.assertTrue(_sign_up_page.get_hider_sign_up_page().equals("Join GitHub"));
    }

    @Step
    public void big_smile_sign_up_button() {
        _main_page.clickSignUp();//
        Assert.assertTrue(_sign_up_page.get_hider_sign_up_page().equals("Join GitHub"));
    }


    @Step
    public void typeUserName(String userName) {
        _main_page.typeUserName(userName);
    }

    @Step
    public String read_hint_username() {
        return _main_page.getHintFiledUsername();
    }

    @Step
    public boolean verifiHintFiledUsername() {
        return _main_page.verifiHintFiledUsername();
    }

    @Step
    public void selenium_examp(){

    }

}
