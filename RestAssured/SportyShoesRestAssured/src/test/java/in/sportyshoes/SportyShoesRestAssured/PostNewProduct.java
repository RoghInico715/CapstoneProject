package in.sportyshoes.SportyShoesRestAssured;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class PostNewProduct extends TestBase {
	
	@Test
	public void postNewProduct() {
		RestAssured
			.when()
				.post("http://localhost:9010/add-shoe?id=102&image=image_url&name=SampleShoe&category=Running&sizes=9&price=1000")
			.then()
				.assertThat()
				.statusCode(200)
				.log().all();
		logger.info("New Products is Added");
	}

}

