package stepDefinations;

import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.ConnectIP;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class StepDefination extends Utils {
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	TestDataBuild data = new TestDataBuild();

	@Given("The endpoint of the API to get all devices")
	public void the_endpoint_of_the_API_to_get_all_devices() throws IOException {
		res = given().spec(requestSpecification());
	}

	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) {
		APIResources resourceAPI = APIResources.valueOf(resource);
		System.out.println(resourceAPI.getResource());

		resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

		if (method.equalsIgnoreCase("POST"))
			response = res.when().post(resourceAPI.getResource());
		else if (method.equalsIgnoreCase("GET"))
			response = res.when().get(resourceAPI.getResource());

	}

	@Then("the API call should get success with status code {int}")
	public void the_API_call_should_get_success_with_status_code(Integer int1) {
		assertEquals(response.getStatusCode(), 200);
	}

	@Given("The endpoint of the API to connect to input device")
	public void the_endpoint_of_the_API_to_connect_to_input_device() throws IOException {
		res = given().spec(requestSpecification()).queryParam("ip", "192.168.100.10");
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String Expectedvalue) {
		assertEquals(getJsonPath(response, keyValue), Expectedvalue);
	}

	@Given("The endpoint of the API to get device state")
	public void the_endpoint_of_the_API_to_get_device_state() throws IOException {
		res = given().spec(requestSpecification());
	}

	@Given("The endpoint of the API to set the brightness to input device")
	public void the_endpoint_of_the_API_to_set_the_brightness_to_input_device() throws IOException {
		res = given().spec(requestSpecification()).queryParam("brightness", 4);
	}

	@Given("The endpoint of the API to set the color to input device")
	public void the_endpoint_of_the_API_to_set_the_color_to_input_device() throws IOException {
		res = given().spec(requestSpecification()).queryParam("color", "#336699");
	}

	@Given("The endpoint of the API to set the name to input device")
	public void the_endpoint_of_the_API_to_set_the_name_to_input_device() throws IOException {
		res = given().spec(requestSpecification()).queryParam("name", "foobar");
	}

	@Given("The endpoint of the API to disconnect to input device")
	public void the_endpoint_of_the_API_to_disconnect_to_input_device() throws IOException {
		res = given().spec(requestSpecification());
	}

}
