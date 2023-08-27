package starter;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import starter.Utils.Constants;

import java.io.File;

public class Hooks {

    @Before("@Token")
    public void login(){
        File json = new File(Constants.REQ_BODY_LOGIN + "ValidLogin.json");
        Response response = SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json)
                .post(Constants.BASE_URL+"auth/login");
        JsonPath jsonPath = response.jsonPath();
        Constants.TOKEN_LOGIN = jsonPath.get("token");
    }

    @After("@Token")
    public void resetTokenUser() {
        Constants.TOKEN_LOGIN = null;
    }
}
