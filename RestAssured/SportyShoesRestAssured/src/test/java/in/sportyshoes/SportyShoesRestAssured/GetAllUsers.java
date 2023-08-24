package in.sportyshoes.SportyShoesRestAssured;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class GetAllUsers extends TestBase {

	@Test
	public void getAllUsers() {
		RestAssured
			.when()
				.get("http://localhost:9010/get-users")
			.then()
				.assertThat()
				.statusCode(200)
				.log().all();
		logger.info("All Users Are Displayed");
	}

}
