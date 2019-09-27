package frameworkprog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
public static WebDriver driver;
{
	String browser="chrome";
	if(browser.contentEquals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","D:/drivers\\geckodriver.exe");
		//driver=new FireFoxDriver();
	}
	else if(browser.contentEquals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","D:/drivers\\chromedriver.exe");
		driver=new ChromeDriver();
}
	else if(browser.contentEquals("firefox"))
	{
		System.setProperty("webdriver.ie.driver","D:/drivers\\iedriver.exe");
		driver=new InternetExplorerDriver();
	}
	driver.get("http://desktop-75j4mf8:81/login.do");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}
@AfterTest
public void closeBrowser()
{
	driver.close();
}
	@BeforeClass
	public void login()
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
@AfterClass
public void logout()
{
	driver.findElement(By.className("logoutimg")).click();
}
	}


