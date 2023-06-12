package Step_Definition;

import Base.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class commonstep1 extends TestBase {


    @Before
    public void setup() throws IOException {
        initialize();
    }

    @Given("^I am  on the application home page$")
    public void iAmOnTheApplicationHomePage() {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
    }

    @And("^I login$")
    public void iLogin() throws InterruptedException {
        Page.login_page page = PageFactory.initElements(driver, Page.login_page.class);
        page.enterloginUsername();
        page.enterloginPassword();
        page.clickloginBtn();
        Thread.sleep(3000);

    }

}
