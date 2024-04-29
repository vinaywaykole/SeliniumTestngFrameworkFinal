package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseclass {
	
	
	public WebDriver driver;
	public static String email= generaterandomemail();
	//browser code
	
	public void driverintialization() throws IOException
	{
		
		//Properties file data reading
		
		FileInputStream fs =new FileInputStream("C:\\Users\\wayko\\eclipse-workspace\\mainframeworkproject\\src\\main\\java\\resources\\data.properties");
		
		//Access data from properties file
		
		Properties prop =new Properties();
		prop.load(fs);
		String browserName = prop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome"))
		{
			
			 driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			 driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("edge"))
		{
			 driver =new EdgeDriver();
		}
		else
		{
			System.out.println("Please choose proper Driver name");
		}
			
	}
	
	
	public static String generaterandomemail()
	
	{
		return "vinay.waykole"+System.currentTimeMillis()+"@gmail.com";
	}
	}
	


