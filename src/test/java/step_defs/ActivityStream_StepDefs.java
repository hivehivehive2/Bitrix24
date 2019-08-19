package step_defs;

import CommonImplementations.Common_Impl;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Utilities;

public class ActivityStream_StepDefs {

    Common_Impl impl = new Common_Impl();

    @And("I select {string} tab")
    public void iSelectTab(String tab) {
        impl.selectTab(tab);
    }

    @And("I enter {string} in Things to do field")
    public void iEnterInThingsToDoField(String text) {
        impl.enterTextInThingsToDoField(text);
    }

    @And("I enter {string} in description field")
    public void iEnterInDescriptionField(String text) {
        impl.enterTextInDescriptionField(text);
    }

    @When("I click on Upload Files")
    public void iClickOnUploadFiles() {
        impl.iClickOnUploadFiles();
    }

    @Then("verify user can upload a file and image")
    public void verifyUserCanUploadAFileAndImage() {
        impl.verifyUserCanUploadAFileAndImage();
        Utilities.logInfo("Image successfully uploaded", true);
    }

    @Then("I should be able to set up a deadline for new task")
    public void iShouldBeAbleToSetUpADeadlineForNewTask() {
        impl.setUpADeadlineForNewTask();
        Utilities.logInfo("Deadline successfully set up", true);
    }

    @Then("I click on create button to create a task")
    public void iClickOnCreateSendButtonToCreateATask() {
        impl.clickOnCreateButtonToCreateATask();
        Utilities.logInfo("Task successfully created", true);
    }
}
