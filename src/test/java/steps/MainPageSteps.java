package steps;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;


public class MainPageSteps {
//    MainPageSteps _main_page_steps;

    @Step("открыть")
    public void open_main_page() {
        Assert.assertFalse(false);
    }

    @Step("нажатие на кнопку входа (sign in)")
    public void clickSignIn() {//перейти на страницу входа для зарегистрированного пользователя
        Assert.assertTrue(true);
    }

    @Step
    public void verifi() {
        Assert.assertTrue(false);

    }


}
