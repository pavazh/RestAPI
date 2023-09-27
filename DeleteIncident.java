package chainingJira;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteIncident extends BaseClass{
	@Test(dependsOnMethods="chainingJira.UpdateIncident.update")
	public void delete() {
		
		Response response = RestAssured.delete("/"+issueId);
		System.out.println(response.getStatusCode());
		
	}
}
