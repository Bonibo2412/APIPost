package ru.netology;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
public class PostmanEchoTest {
    @Test
    void scholdReturnSendData() {
        String text = "Hi";

        given()
                .baseUri("https://postman-echo.com")
                .body("Hi")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", org.hamcrest.Matchers.equalTo(text));
    }
}
