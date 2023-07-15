package starter.dummyjson;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

import java.io.File;

public class PathAPI {
    public static String POSTS_PATH = Constants.BASE_URL + "/posts/";
    public static String POSTS_PARAM = Constants.BASE_URL + POSTS_PATH + "{id}";
    public static String CARTS_PATH = Constants.BASE_URL + "/comments/";
    public static String CARTS_PARAM = Constants.BASE_URL + CARTS_PATH + "{id}";
    public static String USERS_PATH = Constants.BASE_URL + "/users/";
    public static String USERS_PARAM = Constants.BASE_URL + USERS_PATH + "{id}";

    //CARTS
    @Step("Get all carts")
    public void getCart() {
        SerenityRest.given();
    }

    @Step("Get carts")
    public void getCartSingle(Object id) {
        SerenityRest.given()
                .pathParam("id", id);
    }

    @Step("Post carts")
    public void setCarts(File json) {
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Put carts")
    public void setCarts(Object id, File json) {
        SerenityRest.given()
                .pathParam("id", id)
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Delete cart")
    public void getDeleteCarts(Object id) {
        SerenityRest.given()
                .pathParam("id", id);
    }

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
    public void setUsers(File json) {
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

    //POST
    @Step("Get all posts")
    public void getPosts() {
        SerenityRest.given();
    }

    @Step("Get posts")
    public void getPostsSingle(Object id) {
        SerenityRest.given()
                .pathParam("id", id);
    }

    @Step("Post posts")
    public void setPosts(File json) {
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Put posts")
    public void setPosts(Object id, File json) {
        SerenityRest.given()
                .pathParam("id", id)
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Delete post")
    public void getDeletePosts(Object id) {
        SerenityRest.given()
                .pathParam("id", id);
    }
}
