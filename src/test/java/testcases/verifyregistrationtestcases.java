package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import org.testng.annotations.Test;

import resources.baseclass;

import pageobjectmodel.RegistrationPageObject;

public class verifyregistrationtestcases extends baseclass {

	@Test

	public void verifyregistrationwithvaliddata() throws IOException {
		driverintialization();
		driver.get("https://naveenautomationlabs.com/opencart/");

		RegistrationPageObject rpo = new RegistrationPageObject(driver);
		
		rpo.clickonMyAccount().click();
		rpo.clickonRegister().click();
		rpo.enterFirstName().sendKeys("Vinay");
		rpo.enterLastName().sendKeys("Waykole");
		rpo.enterEmail().sendKeys(email);
		rpo.enterTelephoneNo().sendKeys("9890986967");
		rpo.enterpassword().sendKeys("vinay123");
		rpo.passwordConfirm().sendKeys("vinay123");
		rpo.checkCheckbox().click();
		rpo.ClickOnContinuebutton().click();
		
		
		SoftAssert sa= new SoftAssert();
		String actual=driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();
		String expected="Your Account Has Been Created!";		
		sa.assertEquals(actual,expected);
		sa.assertAll();
	}

	
	@Test
	public void verifyregistrationwithInvaliddata() throws IOException {
		driverintialization();
		driver.get("https://naveenautomationlabs.com/opencart/");

		RegistrationPageObject rpo = new RegistrationPageObject(driver);
		
		rpo.clickonMyAccount().click();
		rpo.clickonRegister().click();
		rpo.ClickOnContinuebutton().click();
		
		
		SoftAssert sa= new SoftAssert();
		String fnactual=driver.findElement(By.xpath("//div[text()='First Name must be between 1 and 32 characters!']")).getText();
		String fnexpected="First Name must be between 1 and 32 characters!";		
		sa.assertEquals(fnactual,fnexpected);
		
		
		String lnactual=driver.findElement(By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']")).getText();
		String lnexpected="Last Name must be between 1 and 32 characters!";		
		sa.assertEquals(lnactual,lnexpected);
		
		
		String emailactual=driver.findElement(By.xpath("//div[text()='E-Mail Address does not appear to be valid!']")).getText();
		String emailexpected="E-Mail Address does not appear to be valid!";		
		sa.assertEquals(emailactual,emailexpected);

		
		String telactual=driver.findElement(By.xpath("//div[text()='Telephone must be between 3 and 32 characters!']")).getText();
		String telexpected="Telephone must be between 3 and 32 characters!";		
		sa.assertEquals(telactual,telexpected);

		
		String passactual=driver.findElement(By.xpath("//div[text()='Password must be between 4 and 20 characters!']")).getText();
		String passexpected="Password must be between 4 and 20 characters!";		
		sa.assertEquals(passactual,passexpected);		
		
		String passCactual=driver.findElement(By.xpath("//input[@name='confirm']")).getText();
		String passCexpected=passactual;	
		sa.assertEquals(passCactual,passCexpected);
		sa.assertAll();
		
		
	}
}
