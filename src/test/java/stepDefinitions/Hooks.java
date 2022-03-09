package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

//import org.junit.Before;
public class Hooks {

	
	
	@Before("@DeletePlace")
	public void beforeScenarios() throws IOException {
		
		StepDefinitions m = new StepDefinitions();
		if(StepDefinitions.place_id ==null) 
		{
		m.addplace_playload_having_parameters_and_and("john", "french", "Asia");
		m.user_makes_a_request_to_the_endpoint_with_request("AddplaceAPI", "POST");
		m.verify_that_place_id_created_maps_to_using("john", "Asia");
		
	}
	
}
}
