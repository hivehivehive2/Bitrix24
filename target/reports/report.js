$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Activity_Stream.feature");
formatter.feature({
  "name": "",
  "description": "  User story and AC:\n  As a user I should be able to create a task from activity stream.\n  1. Verify that user can create new task by clicking on tasks\n  on activity stream.\n  2. Verify that user can upload a file and image or link or add checklist\n  regarding to new task.\n  3. Verify that user should be able to set up a deadline for new task.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create a task from Activity Stream",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.write("Mon Aug 19 16:58:59 EDT 2019 Pass: Successfully navigated to https://login.nextbasecrm.com/");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I login as a \"marketing\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginNavigate_StepDefs.iLoginAsA(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to \"Activity Stream\" module",
  "keyword": "And "
});
formatter.match({
  "location": "LoginNavigate_StepDefs.iNavigateTo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \"Task\" tab",
  "keyword": "And "
});
formatter.match({
  "location": "ActivityStream_StepDefs.iSelectTab(String)"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"Cucumber\" in Things to do field",
  "keyword": "And "
});
formatter.match({
  "location": "ActivityStream_StepDefs.iEnterInThingsToDoField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"Create a test\" in description field",
  "keyword": "And "
});
formatter.match({
  "location": "ActivityStream_StepDefs.iEnterInDescriptionField(String)"
});
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Upload Files",
  "keyword": "When "
});
formatter.match({
  "location": "ActivityStream_StepDefs.iClickOnUploadFiles()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user can upload a file and image",
  "keyword": "Then "
});
formatter.match({
  "location": "ActivityStream_StepDefs.verifyUserCanUploadAFileAndImage()"
});
formatter.embedding("image/png", "embedded2.png");
formatter.write("Mon Aug 19 16:59:37 EDT 2019 Pass: Image successfully uploaded");
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to set up a deadline for new task",
  "keyword": "Then "
});
formatter.match({
  "location": "ActivityStream_StepDefs.iShouldBeAbleToSetUpADeadlineForNewTask()"
});
formatter.embedding("image/png", "embedded4.png");
formatter.write("Mon Aug 19 16:59:49 EDT 2019 Pass: Deadline successfully set up");
formatter.embedding("image/png", "embedded5.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on create button to create a task",
  "keyword": "Then "
});
formatter.match({
  "location": "ActivityStream_StepDefs.iClickOnCreateSendButtonToCreateATask()"
});
formatter.embedding("image/png", "embedded6.png");
formatter.write("Mon Aug 19 16:59:54 EDT 2019 Pass: Task successfully created");
formatter.embedding("image/png", "embedded7.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});