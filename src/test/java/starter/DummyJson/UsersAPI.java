package starter.DummyJson;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;

public class UsersAPI {
    public static String USERS_PATH = Constants.BASE_URL + "users/add";
    public static String USERS_PARAM = Constants.BASE_URL + USERS_PATH + "{id}";

    //USERS
    @Step("Get all carts")
    public void getUsers() {
        SerenityRest.given();
    }

    @Step("Get users")
    public void getUsersSingle(Object id) {
        SerenityRest.given()
                .pathParam("id", id);
    }

    @Step("Post users")
    public void postUsers(File json) {
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Put users")
    public void setUsers(Object id, File json) {
        SerenityRest.given()
                .pathParam("id", id)
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Delete cart")
    public void getDeleteUsers(Object id) {
        SerenityRest.given()
                .pathParam("id", id);
    }
}
