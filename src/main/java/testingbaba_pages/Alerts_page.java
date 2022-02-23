package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;
import waitutility.Waitutility;

public class Alerts_page extends BaseLibrary 
{

	public Alerts_page()
	{
		
		//PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//button[@class='btn  btn-block p-0 text-left mr-5 ']")
private WebElement Alertsframe;	
@FindBy(xpath="//a[text()='alerts']")	
private WebElement Alerts;
@FindBy(xpath="(//button[@class='btn btn-primary'])[8]")
private WebElement clickme1;
@FindBy(xpath="(//button[@class='btn btn-primary'])[9]")
private WebElement clickme2;
@FindBy(xpath="(//button[@class='btn btn-primary'])[10]")
private WebElement clickme3;
@FindBy(xpath="(//button[@class='btn btn-primary'])[11]")
private WebElement clickme4;

public void clickonAlertsframe()
{
	Alertsframe.click();
}
public void clickonAlerts()
{
	Alerts.click();
}
public void clickonclickme1()
{
 clickme1.click();
 driver.switchTo().alert().accept();
}
public void clickonclickme2()
{
	
	clickme2.click();
	driver.switchTo().alert().accept();
}
public void clickonclickme3()
{
	
	clickme3.click();
	driver.switchTo().alert().accept();
}
public void clickonclickme4()
{
	clickme4.click();
	driver.switchTo().alert().accept();
}


}