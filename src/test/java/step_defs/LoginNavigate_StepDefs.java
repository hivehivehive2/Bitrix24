package step_defs;

import CommonImplementations.Common_Impl;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class LoginNavigate_StepDefs {

    Common_Impl impl = new Common_Impl();

    @Given("I login as a {string}")
    public void iLoginAsA(String userType) {
        impl.loginAsAUser(userType);
    }

    @And("I navigate to {string} module")
    public void iNavigateTo(String module) {
        impl.iNavigateTo(module);
    }
}
