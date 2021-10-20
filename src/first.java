import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class first
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\All about Software testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		WebElement company = driver.findElement(By.xpath("//div[text()=\"Companies\"]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(company).perform();
		driver.findElement(By.xpath("(//div[@class='subMenu'])//a[text()='About Companies']")).click();	
			
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
