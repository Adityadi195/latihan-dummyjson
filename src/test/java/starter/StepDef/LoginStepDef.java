package starter.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.DummyJson.LoginAPI;
import starter.Utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.isA;

public class LoginStepDef {

    @Steps
    LoginAPI loginAPI;

    @Given("Login with valid data {string}")
    public void loginWithValidData(String jsonName) {
        File json = new File(Constants.REQ_BODY_LOGIN + "" + jsonName + "");
        loginAPI.postLogin(json);
    }

    @Given("Login with invalid data {string}")
    public void loginWithInvalidData(String jsonName) {
        File json = new File(Constants.REQ_BODY_LOGIN + "" + jsonName + "");
        loginAPI.postLogin(json);

    }

    @When("Send post login")
    public void sendPostLogin() {
        SerenityRest.when()
                .post(LoginAPI.LOGIN_DUMMYJSON);
    }

    @And("Response body should display {string}")
    public void responseBoyShouldDisplay(String jsonSch) {
        File jsonSchema = new File(Constants.JSON_SCHEMA_LOGIN + "" + jsonSch + "");
        SerenityRest.and()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }
}
