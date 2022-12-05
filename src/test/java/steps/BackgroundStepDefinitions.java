package steps;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BackbroundColorPage;
import pages.TestBasePage;

public class BackgroundStepDefinitions extends TestBasePage{

	
	BackbroundColorPage bgColorPage;
	
	public void setUp() {
		initDriver();
		
bgColorPage = PageFactory.initElements(driver,BackbroundColorPage.class);
	}
	

@Given("^\"([^\"]*)\" button exists$")
public void button_exists(String name)  {
 
	
	TestBasePage.initDriver();


	
	bgColorPage =  PageFactory.initElements(driver,BackbroundColorPage.class);
	  System.out.println(name);
	if(name.equals("Set SkyBlue Background"))
	{
	
	 Assert.assertEquals(name, bgColorPage.locateSkyBlueButton());
	}
	else  if(name.equals("Set SkyWhite Background"))
	  {
		//driver.get("http://techfios.com/test/101/");
		Assert.assertEquals(name, bgColorPage.locateWhiteButton());
	  }
	 
		


}

@When("^I click on the button As \"([^\"]*)\"$")
public void i_click_on_the_button_As(String button)  {
    if(button.equals("Set SkyBlue Background"))
    {
    	bgColorPage.clickSkyBlueButton();
    }
    else if(button.equals("Set White Background"))
    {
    	bgColorPage.clickWhiteButton();
    }
 
}


@Then("^the background color will change to sky blue$")
public void the_background_color_will_change_to_sky_blue() throws InterruptedException {
	
	Assert.assertEquals("rgba(135, 206, 235, 1)",bgColorPage.validateBlueBackground());
	
	// TestBasePage.tearDown();
}

@Then("^the background color will change to white$")
public void the_background_color_will_change_to_white() {
	
	Assert.assertEquals("rgba(255, 255, 255, 1)",bgColorPage.validateWhiteBackground());
	// TestBasePage.tearDown();
}

}
