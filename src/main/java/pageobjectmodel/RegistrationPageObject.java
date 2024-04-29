package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageObject {

	public WebDriver driver;
	
	private By myAccount =By.xpath("//a[@title='My Account']");
	private By register =By.xpath("//a[text()='Register']");
	private By firstname=By.xpath("//input[@id='input-firstname']");
	private By lastname=By.xpath("//input[@id='input-lastname']");
	private By email=By.xpath("//input[@id='input-email']");
	private By telephone=By.xpath("//input[@id='input-telephone']");
	private By password=By.xpath("//input[@id='input-password']");
	private By passwordconfirm=By.xpath("//input[@id='input-confirm']");
	private By checkbox=By.xpath("//input[@name='agree']");
	private By Continuebutton=By.xpath("//input[@value='Continue']");
	
	public RegistrationPageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement clickonMyAccount()
	{
		return driver.findElement(myAccount);
	}
	
	public WebElement clickonRegister()
	{
		return driver.findElement(register);
	}
	
	public WebElement enterFirstName()
	{
		return driver.findElement(firstname);
	}
	
	public WebElement enterLastName()
	{
		return driver.findElement(lastname);
	}
	public WebElement enterEmail()
	{
		return driver.findElement(email);
	}
	public WebElement enterTelephoneNo()
	{
		return driver.findElement(telephone);
	}
	public WebElement enterpassword()
	{
		return driver.findElement(password);
	}
	public WebElement passwordConfirm()
	{
		return driver.findElement(passwordconfirm);
	}
	public WebElement checkCheckbox()
	{
		return driver.findElement(checkbox);
	}
		
	public WebElement ClickOnContinuebutton()
	{
		return driver.findElement(Continuebutton);
	}
}
