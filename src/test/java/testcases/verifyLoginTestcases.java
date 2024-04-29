package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobjectmodel.loginPageObject;
import resources.baseclass;

public class verifyLoginTestcases extends baseclass {

	@Test
	
	public void varifyLoginwithValidData() throws IOException
	{
		driverintialization();
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		loginPageObject lpo = new loginPageObject(driver);
		
		lpo.enterEmail().sendKeys(email);
		lpo.enterPassword().sendKeys("vinay123");
		lpo.ClickOnLoginbutton().click();
		
		SoftAssert sa= new SoftAssert();
		
		String actual=driver.findElement(By.xpath("//h2[text()='My Account']")).getText();
		String expected="My Account";		
		sa.assertEquals(actual,expected);
		sa.assertAll();
		
	}
	


}
