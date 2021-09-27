package testcases;

import POJOs.CharacterPOJO;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Arrays;

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
        Assert.assertEquals(jsonData.getString("name")
                                        .toUpperCase(),
                            characterExpected.toUpperCase(),
                                    "Character isn't "+characterExpected);
        //getting Walter White information
        //System.out.println(jsonData.get().toString());
        //System.out.println(jsonData.getString("birthday"));
        //getting Walter White birthday atribute
       System.out.println(jsonData.getString("name")+" birthday "+jsonData.getString("birthday"));
    }

    @Test
    public void givenAllCharactersInformationThenStorePOJOAndPrint(){

        response = given()
                    .when()
                        .get("/characters")
                    .then()
                        .statusCode(200)
                        .extract().response();

        jsonData = response.getBody().jsonPath();

        CharacterPOJO[] characterPOJO = jsonData.getObject("", CharacterPOJO[].class);

            Assert.assertTrue(characterPOJO.length > 0,
                    "Characters don't retrieved");

            for(int i=0; i < characterPOJO.length; i++){
                characterPOJO[i].showCharacterInformation();
            }
    }

}
