package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BackbroundColorPage {

	
	
	@FindBy(how=How.XPATH,using="//button[text()='Set SkyBlue Background']")WebElement skyBlueButton;
	//@FindBy(how=How.CSS,using="button[onclick='myFunctionSky()']")WebElement skyBlueButton;
	
	public String locateSkyBlueButton()
	{
		//System.out.println("TFP:"+skyBlueButton.getText());
		return skyBlueButton.getText();
	}
	
	public void clickSkyBlueButton()
	{
		System.out.println("Clicking Blue Button...");
		skyBlueButton.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Set White Background']")WebElement whiteButton;
	public String locateWhiteButton()
	{
		//System.out.println("TFP:"+WHITE_BUTTON.getText());
		return whiteButton.getText();
	}
	
	public void clickWhiteButton()
	{
		System.out.println("Clicking White Button...");
		whiteButton.click();
	}
	
	@FindBy(how=How.XPATH,using="//body[@style='background-color: skyblue;']")WebElement 
                 skyBlueValidation;
	public String validateBlueBackground()
	{
		//System.out.println("Color:"+SKY_BLUE_VALIDATION.getCssValue("background-color"));
		return skyBlueValidation.getCssValue("background-color"); //skyblue
	}
	@FindBy(how=How.XPATH,using="//body[@style='background-color: white;']")WebElement whitBackgroundValidation;
	public String validateWhiteBackground()
	{
		//System.out.println("Color:"+whitBackgroundValidation.getCssValue("background-color"));
		return whitBackgroundValidation.getCssValue("background-color"); //WHITE
	}
	
}
