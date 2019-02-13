package Selenuim_tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.mail.propre.MainPage;
import ru.mail.propre.SignInPage;
import ru.mail.propre.SignUpPage;

import java.util.concurrent.TimeUnit;

@RunWith(SerenityRunner.class)
@WithTags({
        @WithTag("color: red")
})
public class MainPageTestSelenium {
    private WebDriver _driver_selenium;
    private MainPage _main_page;
//    ru.mail.propre.SignInPage _login_page;


    @BeforeClass
    public static void setUpTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\BK\\JavaProjects\\web_drivers\\chromedriver_win32\\chromedriver.exe");
    }

    @Before
    public void setUpStep() {
        //selenium
        System.out.println("***MainPageTestSelenium*** Before");
        _driver_selenium = new ChromeDriver();
        _driver_selenium.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//        _driver.manage().window().setPosition(new Point(800,0));
        _driver_selenium.manage().window().maximize();
        _driver_selenium.get("https://github.com");
        _main_page = new MainPage(_driver_selenium);


        //selenium
//        ChromeOptions _options=new ChromeOptions();
//        WebDriver _driver;
//        _options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
//        _options.addArguments("--headless");
//        _options.addArguments("--disable-gpu");
//        _options.addArguments("window-size=1024,768");
//        _options.addArguments("--no-sandbox");
//        _driver = new ChromeDriver(_options);
//        _driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//        _driver.manage().window().maximize();
//        _driver.get("https://github.com");
//
//        _main_page_ = new ru.mail.propre.MainPage(_driver);

        //serenity
//        _driver_serenity.get("https://github.com");
//        _driver_serenity.manage().window().maximize();

    }


    @Test
    @WithTag ("color: yellow")
    public void SignIn() {
        SignInPage _login_page = _main_page.clickSignIn();
        System.out.println(_login_page.getHiderSignInPage());
        Assert.assertTrue(_login_page.getHiderSignInPage().equals("Sign in to GitHub"));
    }

    @Test
    public void sign_up_big_green_button() {
        SignUpPage _sign_up_page = _main_page.clickSignUpForGit();//
        Assert.assertTrue(_sign_up_page.get_hider_sign_up_page().equals("Join GitHub"));
    }

    @Test
    public void sign_up_smile_button() {
        SignUpPage _sign_up_page = _main_page.clickSignUp();
        Assert.assertTrue(_sign_up_page.get_hider_sign_up_page().equals("Join GitHub"));
    }

    @Test
    public void entered_bad_username() {
        _main_page.typeUserName("12");
        Assert.assertTrue(_main_page.getHintFiledUsername().equals("Username is already taken"));
    }

    @Test
    public void entered_correct_username(){
        _main_page.typeUserName("KapitonSergeevichKuznecov");
        Assert.assertFalse(_main_page.verifiHintFiledUsername());
    }


    @After
    public void tearDown() {
        _driver_selenium.quit();
    }





}
