package page_objects;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends PageObject {
    WebDriver _driver;

    private final static String _TEXT_HIDER = "//*[@id='login']/form/div[1]/h1";

    @FindBy(xpath ="//*[@id='login']/form/div[1]/h1")
    WebElementFacade _text_hider;

    public SignInPage(WebDriver _driver_) {
        this._driver = _driver_;
    }

    public String getHiderSignInPage (){
        return $(_TEXT_HIDER).getText();
    }

//    WebElement _text_hider,_filed_username_or_email,_filed_password,_button_sign_in,_error,_link_create_acc;


//        _text_hider = _driver_chrome.findElement(By.xpath("//*[@id='login']/form/div[1]/h1"));
//        _filed_username_or_email = _driver_chrome.findElement(By.xpath("//*[@id=\"login_field\"]"));
//        _filed_password = _driver_chrome.findElement(By.xpath("//*[@id=\"password\"]"));
//        _button_sign_in = _driver_chrome.findElement(By.xpath("//*[@id=\"login\"]/form/div[3]/input[3]"));
////        _error = _driver_chrome.findElement(By.xpath("//div[@id='js-flash-container']//*[@class='container']"));
//        _link_create_acc = _driver_chrome.findElement(By.xpath("//*[@id=\"login\"]/p/a"));

//    public ru.mail.propre.SignInPage typeUsername (String username){
//        _filed_username_or_email.sendKeys(username);
//        return this;
//    }
//
//    public ru.mail.propre.SignInPage typePassword (String password){
//        _filed_password.sendKeys(password);
//        return this;
//    }
//
//    public ru.mail.propre.SignInPage loginWithInvalidCreds(String username, String password){//для невалидных данных
//        typeUsername(username);
//        typePassword(password);
//        _button_sign_in.click();
//        return new ru.mail.propre.SignInPage(_driver_chrome);
//    }
//    public String getErrorText (){
//        return _error.getText();
//    }
//
//    public ru.mail.propre.SignUpPage createAccount (){
//        _link_create_acc.click();
//        return new ru.mail.propre.SignUpPage(_driver_chrome);
//    }











}
