package chainingJira;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateIncident extends BaseClass{
	@Test(dependsOnMethods="chainingJira.CreateIncident.create")
	public void update() {
		
		RequestSpecification input=RestAssured.given().contentType("application/json").when().body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "    \"project\":\r\n"
				+ "                {\r\n"
				+ "                    \"key\": \"RSA\"\r\n"
				+ "                },\r\n"
				+ "    \"summary\": \"updated issue in RSA project\",\r\n"
				+ "    \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
				+ "    \"issuetype\": {\r\n"
				+ "                    \"name\": \"Bug\"\r\n"
				+ "                }\r\n"
				+ "    }\r\n"
				+ "}\r\n"
				+ "");
		Response response = input.put("/"+issueId);
		
		
	}
}
