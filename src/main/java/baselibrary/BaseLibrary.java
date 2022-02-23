package baselibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import screenutility.Screenshot;

public class BaseLibrary 
{

	
public static WebDriver driver = null;
String Closebtn="//*[text()='×']";
String practice="//*[text()='Practice']";


public void getlaunch(String url)

{
	    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        driver = new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath(Closebtn)).click(); 
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath(practice)).click();
        
}
//@AfterMethod
//public void getanalysis(ITestResult result)
//{
 //String filename = result.getMethod().getMethodName();
 //if(result.isSuccess())
// {
//	 Screenshot.getScreenshot("passed",filename);
//}
// else if (result.getStatus()==ITestResult.FAILURE)	
 //{
	 
//	 Screenshot.getScreenshot("failed", filename);
 //}
 ////else if (result.getStatus()==ITestResult.SKIP)
 //{
	 
//	 Screenshot.getScreenshot("Skip", filename);
// }
 
//}

//@AfterTest
//public void teardown()
{
	
//driver.quit();	

}


}
