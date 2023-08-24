package in.sportyshoes.SportyShoesRestAssured;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class GetAllProducts extends TestBase{

	@Test
	public void getAllProducts() {
		RestAssured
			.when()
				.get("http://localhost:9010/get-shoes")
			.then()
				.assertThat()
				.statusCode(200)
				.log().all();
		logger.info("All Products Are Displayed");
	}

}
