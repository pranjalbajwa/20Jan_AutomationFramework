package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutiltiy;

public class Frames_page extends BaseLibrary
{

public Frames_page()
{
	//PageFactory.initElements(driver, this);
}
@FindBy(xpath="//button[@class='btn  btn-block p-0 text-left mr-5 ']")
private WebElement Alertsframe;
@FindBy(xpath="//a[text()='frames']")
private WebElement Alerts;
@FindBy(xpath="(//iframe[@title='Iframe Example'])[1]")
private WebElement framexpath1;
@FindBy(xpath="//*[@charset='utf-8']/following::body/h1")
private WebElement firsttext1;
@FindBy(xpath="(//iframe[@title='Iframe Example'])[2]")
private WebElement framexpath2;
@FindBy(xpath="//*[@charset='utf-8']/following::body/h1")
private WebElement firsttext2;
public void clickonAlertsframe()
{
	Alertsframe.click();
}
public void clickonAlerts()
{
	Alerts.click();
}
public WebElement getFramexpath() 
{
	return framexpath1;
}
public void getdetails()
{
	String name = Propertyutiltiy.getReaddata("Text1");
	
}
public void verifydetails()
{
SoftAssert assertt=new SoftAssert();
assertt.assertEquals(firsttext1.getText(),Propertyutiltiy.getReaddata("Text1"));	
assertt.assertAll();
}


}
