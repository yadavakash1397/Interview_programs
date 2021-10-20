package assignment1;
//package assignment1;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.TreeSet;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//
//public class Assign 
//{
//
//	public static void main(String[] args) 
//	{
//		System.setProperty("webdriver.chrome.driver",
//				"D:\\All about Software testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		
//		driver.get("http://tutorialsninja.com/demo/index.php");
//		
//		driver.manage().window().maximize();
//		
//		//1
//		
//		driver.findElement(By.xpath("//a[text()='My Account']")).click();
//		
//		driver.findElement(By.xpath("(//a[text()='Login'])[2]")).click();
//		
//		//2
//		
//		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("sctqatest@grr.la");
//		
//		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Spring123$");
//		
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		
//		//3
//		
//		driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();
//		
//		WebElement canon = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
//		
//		Actions act=new Actions(driver);
//		act.moveToElement(canon).perform();
//		
//		int size = driver.findElements(By.xpath("//div[@class=\"caption\"]")).size();
//		
//		
//		HashMap<String, String> hm=new HashMap<>();
//		
//		for(int i=1;i<=size;i++)
//		{
//			String caption = driver.findElement(By.xpath("(//div[@class='caption'])["+i+"]/h4/a")).getText();
//			String prize = driver.findElement(By.xpath("(//div[@class='caption'])["+i+"]/p[@class='price']")).getText();
//			//hm.put(caption, prize);
//			hm.put(prize,caption);
//		}
//		System.out.println("prize and lable");
//		
//		
//		Collection<String> keys = hm.keySet();
//		TreeSet<String> tr=new TreeSet(keys);
//		ArrayList<String> list=new ArrayList(tr);
//		for(String onedata:list)
//		{
//			
//			System.out.println(hm.get(onedata)+"  "+onedata);
//			System.out.println();
//		}
//		
//		
//		
//		//4
//		
//		WebElement laptop = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
//		act.moveToElement(laptop).perform();
//		
//		WebElement alllaptop = driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']"));
//		act.moveToElement(alllaptop).click().perform();
//		
//		
//	
//	
//		
//		WebElement sortby = driver.findElement(By.xpath("//select[@id='input-sort']"));
//		Select sel=new Select(sortby);
//		sel.selectByVisibleText("Price (High > Low)");
//	
//		
//		WebElement macbook = driver.findElement(By.xpath("//div[@class='caption']//a[text()='MacBook Pro']"));
//		act.moveToElement(macbook).perform();
//		act.click(macbook).perform();
//	
//		
//		driver.findElement(By.xpath("//input[@id='input-quantity']")).clear();
//		
//		driver.findElement(By.xpath("//input[@id='input-quantity']")).sendKeys("2");
//		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
//		
//		
//		driver.findElement(By.xpath("//span[text()='Shopping Cart']")).click();
//		
//
//		System.out.println("table data ");
//		
//		int rowsize = driver.findElements(By.xpath("((//table[@class='table table-bordered'])[2]//tr)")).size();
//		int colsize1 = driver.findElements(By.xpath("((//table[@class='table table-bordered'])[2]//tr)[1]/td")).size();
//	     
//		for(int i=1;i<=rowsize;i++)
//		{
//			for(int j=2;j<=colsize1;j++)
//			{
//				
//				String data = driver.findElement(By.xpath("((//table[@class='table table-bordered'])[2]//tr[1])["+i+"]/td["+j+"]")).getText();
//				System.out.print(data+"  ");
//			}
//			System.out.println();
//		}
//		
//		
////		
////		driver.findElement(By.xpath(""));
//
//	}
//
//}
//
//

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//public class BaseClass 
//{
//	
//	public String url="http://demo.guru99.com/v4/";
//	public String uid="mngr354863";
//	public String password="apuzUqa";
//	public static WebDriver driver;
//	
//	@BeforeClass
//	public void setUp() 
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balgu\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		driver=new ChromeDriver();	
//		driver.manage().window().maximize();
//	}
//}



public class Homepage_Test  
{
	public String url="http://demo.guru99.com/v4/";
	public String uid="mngr354863";
	public String password="apuzUqa";
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\All about Software testing\\NEW START\\chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void loginTest() 
	{
	driver.get(url);
	driver.findElement(By.name("uid")).sendKeys(uid);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.name("btnLogin")).click();
	}
	
	    @Test(dependsOnMethods="loginTest",priority=2)
	    public void homepageLogoTest() throws InterruptedException {
		boolean b=driver.findElement(By.xpath("//img[@alt='Guru99 Demo Sites']")).isDisplayed();
		Assert.assertTrue(b);
		
	    }
		@Test(dependsOnMethods="loginTest",priority=3)
		public void logoLinkRedirectTest() {
		WebElement logo=driver.findElement(By.xpath("//img[@alt='Guru99 Demo Sites']"));
		logo.click();
	    String title=driver.getTitle();
	    Assert.assertEquals(title, "Guru99 Bank Manager HomePage");
		}
		
		@Test(priority=4)
		public void editCustomerLinkVerify() throws InterruptedException 
		{
			
		WebElement edit=driver.findElement(By.xpath("//*[text()='New Customer']"));
		edit.click();

		}
		
		
		
		
	}
