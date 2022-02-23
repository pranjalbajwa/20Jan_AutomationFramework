package waitutility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baselibrary.BaseLibrary;

public class Waitutility extends BaseLibrary

{

   public static void Elementisvisible(WebElement ele)
   {
	
	WebDriverWait wait = new WebDriverWait(driver, 5);  
	wait.until(ExpectedConditions.visibilityOf(ele)); 
	   
 }

public static void clickme(WebElement elements)
{
	elements.click();
	
}




}
