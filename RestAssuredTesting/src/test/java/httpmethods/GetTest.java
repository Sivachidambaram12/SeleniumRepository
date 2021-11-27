package httpmethods;

import static io.restassured.RestAssured.*;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

/*List Users*/

@SuppressWarnings({ "deprecation", "unused" })

public class GetTest {

	@Test

	public void get_test() {

		given().relaxedHTTPSValidation()
		.when().get("https://reqres.in/api/users?page=2")
		.then().statusCode(200);

		Response r1 = RestAssured.given()
				.relaxedHTTPSValidation()
				.when()
				.get("https://reqres.in/api/users?page=2");

		System.out.println(r1.statusCode());

		System.out.println(r1.body().asString());

		System.out.println(r1.body().asPrettyString());

		System.out.println(r1.getHeader("Content-Type"));

		System.out.println(r1.statusLine());

		System.out.println(r1.getSessionId());

		System.out.println(r1.getHeaders());

		Assert.assertEquals(200, r1.statusCode());

	}

}
