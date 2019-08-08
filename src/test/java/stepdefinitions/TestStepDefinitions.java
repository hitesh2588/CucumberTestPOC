package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumbertestcommon.RequestTest;

public class TestStepDefinitions extends RequestTest{

	@Given("^The user access the endpoint URL \"([^\"]*)\" and basepath \"([^\"]*)\"$")
	public void theUserAccessTheEndpointURLAndBasepath(String URL, String basepath) {
	   setup(URL,basepath);
	}

	@When("^The user makes a request$")
	public void theUserMakesARequest()  {
	GetRequest();
//	System.out.println("when not implemented");
	}

	@Then("^then the status code is (\\d+)$")
	public void thenTheStatusCodeIs(int stCode)  {
		
		statusValidate(stCode);
		
//		System.out.println("then not implemented");
	}
	
	@When("^the user makes a request for student id \"([^\"]*)\"$")
	public void theUserMakesARequestForStudentId(String pathparam) {
		GetRequestWithParam(pathparam);

	}

	@Then("^The status code is (\\d+)$")
	public void theStatusCodeIs(int stCode)  {
		statusValidate(stCode);
	
	}

	
}
