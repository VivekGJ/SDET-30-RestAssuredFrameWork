package practice.CRUDOperationWithBDD;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class CreateTheCompaniesTest
{
    @Test
    public void createCompaniesTest()
    {
        baseURI="https://reqres.in/";

        JSONObject jobj = new JSONObject();
        jobj.put("name","vivek");
        jobj.put("job","QA");

        given().body(jobj).contentType(ContentType.JSON)
                .when().post("/api/users")
                .then().assertThat().statusCode(201)
                .log().all();
    }
}
