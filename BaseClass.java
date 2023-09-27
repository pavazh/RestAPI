package chainingJira;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	public static String issueId;
	public static RequestSpecification input;
	public static Response response;
@BeforeMethod
	public void setUp() {
		RestAssured.baseURI="https://pavazha-thamizh.atlassian.net/rest/api/2/issue";
		RestAssured.authentication=RestAssured.preemptive().basic("pavazh@gmail.com", "ATATT3xFfGF0upG6Qf8SHgIGWe1DMYkjS5E2DYgwA5yyB4_TB2oiixZ08yNekM9PJ7jZHUFP_CQbOQ4i1YsEorTsIVuXpdvTzhdCne_dCCJkcgAEGUJpCIh2vVwudEGUsKukm2h_rWCcL5pKOzmGwlO52an1JXiBI8fZ_lmVVsQwzYk8AG1pe-I=EFB9137A");
	}
}
