package testcases;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected final String baseURI = "https://www.breakingbadapi.com/api/";
    protected Response response;
    protected JsonPath jsonData;

    @BeforeTest
    public void setUp()throws Exception{

        RestAssured.defaultParser = Parser.JSON;
        RestAssured.baseURI = baseURI;
    }
}

