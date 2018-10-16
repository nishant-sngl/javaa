package api;

import io.restassured.RestAssured;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Api1 {

	public static void main(String[] args) {
	
		
		regDevice("7.1.1", "4.3.0-debug", "1");
		
	}
	
	static void regDevice(String osVersion, String appVersion, String cityId) {
		String deviceProp = "{\"platform\":\"java\",\"os_name\":\"android\",\"os_version\":\"" + osVersion
				+ "\",\"app_version\":\"" + appVersion
				+ "\",\"device_make\":\"Google\",\"device_model\":\"Android SDK built for x86\",\"screen_resolution\":\"1080X1794\",\"screen_dpi\":420}";
		RestAssured.given().formParam("device_id", "526947ff7526dd8f").formParam("city_id", cityId)
		.formParam("pro/558959+perties", deviceProp)
		.when()
		.post("/mapi/v3.5.0/register-device/")
		.then().assertThat()
		.body(matchesJsonSchemaInClasspath("testJson.json"));
		System.out.println("sds");
	}
	
}
