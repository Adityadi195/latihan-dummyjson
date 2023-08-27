package starter.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.DummyJson.UsersAPI;
import starter.Utils.Constants;

import java.io.File;

public class UsersStepDef {

    @Steps
    UsersAPI usersAPI;

    @Given("Set request to post new users with valid data {string}")
    public void setRequestToPostNewUsersWithValidData(String jsonName) {
        File json = new File(Constants.REQ_BODY_USERS + "" + jsonName + "");
        usersAPI.postUsers(json);
    }

    @When("Send request post users")
    public void sendRequestPostUsers() {
        SerenityRest.when()
                .post(UsersAPI.USERS_PATH);
    }
}
