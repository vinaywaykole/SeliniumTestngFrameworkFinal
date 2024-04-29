package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObject {
	
	
	private By email =By.xpath("//input[@name='email']");
	private By password =By.xpath("//input[@name='password']");
	private By loginbutton=By.xpath("//input[@type='submit']");

	public WebDriver driver; 
	
	public loginPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver2; 
	}

	public WebElement enterEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement enterPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement ClickOnLoginbutton()
	{
		return driver.findElement(loginbutton);
	}
	
}
