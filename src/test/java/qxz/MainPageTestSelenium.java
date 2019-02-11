package qxz;

import net.thucydides.core.pages.PageObject;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.mail.propre.MainPage;
import ru.mail.propre.SignInPage;
import ru.mail.propre.SignUpPage;

import java.util.concurrent.TimeUnit;

//import static steps.MainPageSteps._main_page_;
import static tests.MainPageTest._driver;

//@DefaultUrl("https://github.com")
public class MainPageTestSelenium extends PageObject {
//    private WebDriver _driver;
//    private MainPage _main_page;

    //    @BeforeClass
//    public static void setUpTest() {
//        System.setProperty("webdriver.chrome.driver", "C:\\BK\\JavaProjects\\web_drivers\\chromedriver_win32\\chromedriver.exe");
//    }
//@Steps
    MainPage _main_page_;

    @Before
    public void setUpStep() {
        System.out.println("***MainPageTestSelenium*** Before");
//      _driver = new ChromeDriver();
        _driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        _driver.manage().window().maximize();
//        _driver.get("https://github.com");
        _main_page_ = new MainPage(_driver);
    }


    //    @Test
    public void SignIn() {
        System.out.println("***MainPageTestSelenium*** SignIn");
//        System.setProperty("webdriver.chrome.driver", "C:\\BK\\JavaProjects\\web_drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver _driver;
        _driver = new ChromeDriver();
        _driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        _driver.manage().window().maximize();
        _driver.get("https://github.com");

        _main_page_ = new MainPage(_driver);

        SignInPage _login_page = _main_page_.clickSignIn();
        System.out.println(_login_page.getHiderSignInPage());
        Assert.assertTrue(_login_page.getHiderSignInPage().equals("Sign in to GitHub"));
    }

    //    @Test
    public void sign_up_big_green_button() {
        SignUpPage _sign_up_page = _main_page_.clickSignUpForGit();//
        Assert.assertTrue(_sign_up_page.get_hider_sign_up_page().equals("Join GitHub"));
    }

    //    @Test
    public void sign_up_smile_button() {
        SignUpPage _sign_up_page = _main_page_.clickSignUp();
        Assert.assertTrue(_sign_up_page.get_hider_sign_up_page().equals("Join GitHub"));
    }

    //    @Test
    public void entered_bad_username() {
        _main_page_.typeUserName("12");
        Assert.assertTrue(_main_page_.getHintFiledUsername().equals("Username is already taken"));
    }

    //    @Test
    public void entered_correct_username() {
        _main_page_.typeUserName("KapitonSergeevichKuznecov");
        Assert.assertFalse(_main_page_.verifiHintFiledUsername());
    }

    @After
    public void tearDown() {
        System.out.println("***MainPageTestSelenium*** After");

        _driver.quit();
    }


}
