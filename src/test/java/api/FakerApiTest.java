package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FakerApiTest {

    private final String BASE_URL = "https://fakerapi.it/api/v1/companies";

    private void testCompaniesEndpoint(int quantity) {
        Response response = RestAssured
                .given()
                .queryParam("_quantity", quantity)
                .when()
                .get(BASE_URL)
                .then()
                .statusCode(200)
                .extract().response();

        int actualSize = response.jsonPath().getList("data").size();
        System.out.println("Requested: " + quantity + " | Received: " + actualSize);

        Assertions.assertEquals(quantity, actualSize,
                "Expected number of data items to match quantity parameter.");
    }

    @Test
    public void testQuantity20() {
        testCompaniesEndpoint(20);
    }

    @Test
    public void testQuantity5() {
        testCompaniesEndpoint(5);
    }

    @Test
    public void testQuantity1() {
        testCompaniesEndpoint(1);
    }
}
