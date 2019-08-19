package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BrowserUtils;
import utility.Driver;
import utility.Utilities;

public class LoginNavigate_Page {
    public LoginNavigate_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='Login']")
    public WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submit;

    public void login(String usernameStr, String passwordStr) {
        username.sendKeys(usernameStr);
        password.sendKeys(passwordStr);
        Utilities.waitFor(2);
        Utilities.highlight(submit);
        Utilities.waitFor(1);
        submit.click();
        Utilities.waitFor(3);
    }

    public static WebElement getModule(String module) {
        String moduleXpath = "//span[@class='menu-item-link-text' and contains(text(), '" + module + "')]";
        return Driver.getDriver().findElement(By.xpath(moduleXpath));
    }
}
