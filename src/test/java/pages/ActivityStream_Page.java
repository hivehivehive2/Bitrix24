package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

import java.security.PublicKey;

public class ActivityStream_Page {

    public ActivityStream_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Activity Stream']")
    public WebElement activityStream;

    public WebElement getOptions(String option){
        String optXpath = "//span[text()='" + option + "']/..";
        return Driver.getDriver().findElement(By.xpath(optXpath));
    }

    @FindBy (xpath = "//input[@placeholder='Things to do']")
    public WebElement thingsToDo;

    @FindBy (xpath = "//div[@id='bx-html-editor-lifefeed_task_form']")
    public WebElement descriptionField;

    @FindBy (xpath = "//span[@id='bx-b-uploadfile-task-form-lifefeed_task_form']")
    public WebElement uploadFiles;

    @FindBy (xpath = "(//span[@title='Link'])[2]")
    public WebElement link;

    @FindBy (xpath = "//span[@class='tasks-task-mpf-link']")
    public WebElement checklist;

    @FindBy (xpath = "//span[@class='wd-fa-add-file-light-title-text']")
    public WebElement uploadFilesImages;

    @FindBy (xpath = "(//input[@type='file'])[5]")
    public WebElement uploadFilesImages2;

   // @FindBy(xpath = "(//input[@class='task-options-inp'])[1]")
    @FindBy (xpath = "(//span[@class='task-options-inp-container task-options-date t-empty'])[1]")
    public WebElement deadlineField;

    @FindBy(xpath = "//a[@class='bx-calendar-cell bx-calendar-active']")
    public WebElement aug19;

    @FindBy (xpath = "//a[@class='bx-calendar-button bx-calendar-button-select']")
    public WebElement deadlineSelect;

    @FindBy (xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;


}
