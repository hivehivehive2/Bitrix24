Feature:
  User story and AC:
  As a user I should be able to create a task from activity stream.
  1. Verify that user can create new task by clicking on tasks
  on activity stream.
  2. Verify that user can upload a file and image or link or add checklist
  regarding to new task.
  3. Verify that user should be able to set up a deadline for new task.

  @wip
  Scenario: Create a task from Activity Stream
    Given I login as a "marketing"
    And I navigate to "Activity Stream" module
    And I select "Task" tab
    And I enter "Cucumber" in Things to do field
    And I enter "Create a test" in description field
    When I click on Upload Files
    Then verify user can upload a file and image
    Then I should be able to set up a deadline for new task
    Then I click on create button to create a task


