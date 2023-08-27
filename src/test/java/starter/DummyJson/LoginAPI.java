package starter.DummyJson;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;

public class LoginAPI {

    public static String LOGIN_DUMMYJSON = Constants.BASE_URL + "auth/login";

    @Step("Login Dummy")
    public void postLogin(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }

}
