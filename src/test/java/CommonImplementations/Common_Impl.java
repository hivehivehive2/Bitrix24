package CommonImplementations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.ActivityStream_Page;
import pages.LoginNavigate_Page;
import utility.BrowserUtils;
import utility.ConfigurationReader;
import utility.Driver;
import utility.Utilities;

public class Common_Impl {

    ActivityStream_Page activityStreamPage = new ActivityStream_Page();
    Actions action=new Actions(Driver.getDriver());

    public void loginAsAUser(String userType) {
        String username="";
        String password="";
        if (userType.equals("marketing")) {
            username = ConfigurationReader.get("marketing_username");
            password = ConfigurationReader.get("marketing_password");
        } else if (userType.equals("hr")) {
            username = ConfigurationReader.get("hr_username");
            password = ConfigurationReader.get("hr_password");

        } else if (userType.equals("help desk")) {
            username = ConfigurationReader.get("helpdesk_username");
            password = ConfigurationReader.get("helpdesk_password");
        }

        System.out.println("username = " + username);
        System.out.println("password = " + password);
        new LoginNavigate_Page().login(username, password);
    }

    public void iNavigateTo(String module) {
        WebElement modulEl = LoginNavigate_Page.getModule(module);
        Utilities.highlight(modulEl);
        Utilities.waitFor(1);
        modulEl.click();
        Utilities.waitFor(2);
    }
    public void selectTab(String tab) {
        WebElement tabEl = activityStreamPage.getOptions(tab);
        Utilities.highlight(tabEl);
        Utilities.waitFor(1);
        tabEl.click();
        Utilities.waitFor(4);
        Utilities.screenShot();
    }

    public void enterTextInThingsToDoField(String text) {
        activityStreamPage.thingsToDo.sendKeys(text);
        Utilities.waitFor(5);
    }

    public void enterTextInDescriptionField(String text) {
        activityStreamPage.descriptionField.click();
        Utilities.waitFor(3);
        action.sendKeys(text).perform();
        Utilities.waitFor(3);
        Utilities.screenShot();
    }

    public void iClickOnUploadFiles() {
        Utilities.highlight(activityStreamPage.uploadFiles);
        Utilities.waitFor(1);
        activityStreamPage.uploadFiles.click();
        Utilities.waitFor(2);
    }

    public void veryfyUserCanAddChecklist() {
        Utilities.highlight(activityStreamPage.checklist);
        Utilities.waitFor(1);
        activityStreamPage.checklist.click();
        Utilities.waitFor(2);
    }

    public void verifyUserCanUploadAFileAndImage() {
        activityStreamPage.uploadFilesImages2.sendKeys("/Users/aigulzhaanbaeva/Downloads/images.jpg");
        Utilities.waitFor(3);
    }

    public void setUpADeadlineForNewTask() {
        action.click(activityStreamPage.deadlineField).perform();
        Utilities.waitFor(2);
        Utilities.highlight(activityStreamPage.aug19);
        Utilities.waitFor(1);
        action.doubleClick(activityStreamPage.aug19);
        Utilities.waitFor(3);
        Utilities.highlight(activityStreamPage.deadlineSelect);
        Utilities.waitFor(1);
        //action.click((activityStreamPage.deadlineSelect)).perform();
       // action.contextClick(activityStreamPage.deadlineSelect);
        activityStreamPage.deadlineSelect.click();
        Utilities.waitFor(4);
    }

    public void clickOnCreateButtonToCreateATask() {
        Utilities.highlight(activityStreamPage.sendButton);
        Utilities.waitFor(1);
        activityStreamPage.sendButton.click();
        //action.click(activityStreamPage.sendButton).perform();
        Utilities.waitFor(4);
    }
}
