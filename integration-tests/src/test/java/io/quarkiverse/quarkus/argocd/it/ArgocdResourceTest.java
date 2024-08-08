package io.quarkiverse.quarkus.argocd.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class ArgocdResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/argocd")
                .then()
                .statusCode(200)
                .body(is("Hello argocd"));
    }
}
