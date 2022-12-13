package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserEngine {
	
public static WebDriver driver;
	
	public static WebDriver browserConfig()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\DigitalPoint Project\\MavenProject\\HybridTest\\HybridAutomation\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		System.out.println("opened chrome browser");
		
		//maximize the browser
		driver.manage().window().maximize();
		//when provide a specific dimension(450,1080)
		//Dimension d=new Dimension(450,1080);
		//driver.manage().window().setSize(d);
		
		//delete all cookies from the browser
		driver.manage().deleteAllCookies();
		
		return driver;
		
	}

}
