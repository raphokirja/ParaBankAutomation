package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class login_page {

    //Declare your locators here
    @FindBy(how = How.NAME, using = "username")
    public static WebElement UserNameLoginField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"loginPanel\"]/form/div[3]/input")
    public static WebElement LoginButton;

    @FindBy(how = How.NAME, using = "password")
    public static WebElement PasswordLoginField;


    //Declare your methods
    public void enterloginUsername() {
        UserNameLoginField.sendKeys("Admin");

    }
    public void enterloginPassword() {
        PasswordLoginField.sendKeys("olufemi");

    }

    public void clickloginBtn() {
        LoginButton.click();

    }

}
