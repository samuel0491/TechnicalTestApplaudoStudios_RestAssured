package testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class TheBreakingBadAPITest extends BaseTest{

    @Parameters({"character","characterExpected"})
    @Test
    public void givenWalterWhiteInformationThenGetHisBirthday(String character,String characterExpected){

        response = given()
                        .pathParam("character",character)
                  .when()
                        .get("/characters/{character}")
                  .then()
                        .statusCode(200)
                        .extract().response();

        jsonData = response.jsonPath();
        //
        Assert.assertEquals(jsonData.getString("name").toUpperCase(),
                characterExpected.toUpperCase(),
                "Character isn't "+characterExpected);
        //getting Walter White information
        //System.out.println(jsonData.get().toString());
        //System.out.println(jsonData.getString("birthday"));
        //getting Walter White birthday atribute
       System.out.println(jsonData.getString("name")+" birthday "+jsonData.getString("birthday"));
    }
}
