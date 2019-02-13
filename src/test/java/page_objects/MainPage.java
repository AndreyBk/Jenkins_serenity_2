package page_objects;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

import static Serenity_tests.SignInMainPageTest._driver_serenity;

@DefaultUrl("https://github.com")
public class MainPage extends PageObject {

    @FindBy(xpath = "/html/body/div[1]/header/div/div[2]/div[2]/a[1]")
    WebElementFacade _button_sign_in;

    private final static String _BUTTON_SIGN_IN = "/html/body/div[1]/header/div/div[2]/div[2]/a[1]";
    private final static String _button_sign_up = "/html/body/div[1]/header/div/div[2]/div[2]/a[2]";
    private final static String _button_sign_up_for_github = "/html/body/div[4]/div[1]/div/div/div[2]/div/form/button";
    private final static String _filed_username = "//*[@id=\"user[login]\"]";
    private final static String _filed_email = "//*[@id=\"user[email]\"]";
    private final static String _filed_password = "//*[@id=\"user[password]\"]";
    private final static String _text_hider = "/html/body/div[4]/div[1]/div/div/div[1]/h1";



    public void  clickSignIn() {//перейти на страницу входа для зарегистрированного пользователя
        $(_BUTTON_SIGN_IN).click();
    }


    public void clickSignUp() {
        $(_button_sign_up).click();
    }

    public void clickSignUpForGit() {
        $(_button_sign_up_for_github).click();
    }

    public void typeUserName(String userName) {
        $(_filed_username).sendKeys(userName);
    }

    public String getHintFiledUsername() {
        WebElement _hint_filed_username = (WebElement) _driver_serenity.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/div[2]/div/form/dl[1]/dd[2]"));
        return _hint_filed_username.getText();
    }
    public Boolean verifiHintFiledUsername(){
        ArrayList<WebElement> _verifi = (ArrayList<WebElement>) _driver_serenity.findElements(By.xpath("//input[@class='form-control form-control-lg input-block is-autocheck-successful']"));
        return _verifi.size()==0;
    }

//    public List<String> getActions() {
//        return findAll(".view").stream()
//                .map(WebElementFacade::getText)
//                .collect(Collectors.toList());
//    }


/*

    public void typeEmail(String e_mail) {
        _filed_email.sendKeys(e_mail);
        return this;
    }

    public void typePassword(String pass) {
        _filed_password.sendKeys(pass);
        return this;
    }

    public String getHiderMainPage() {
        return _text_hider.getText();
    }

    public void registreUser(String username, String email, String password) {
        this.typeUserName(username);
        this.typeEmail(email);
        typePassword(password);
        clickSignUpForGit();
        return new ru.mail.propre.SignUpPage(_driver_chrome);
    }
*/





}
