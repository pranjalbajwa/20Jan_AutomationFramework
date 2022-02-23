package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Nestedframe_page extends BaseLibrary 
{
public Nestedframe_page()
{
	
	//PageFactory.initElements(driver, this);
}
@FindBy(xpath="//button[@class='btn  btn-block p-0 text-left mr-5 ']")
private WebElement Alertsframe;
@FindBy(xpath="//a[text()='nested frames']")
private WebElement Nestedframe;
@FindBy(xpath="//iframe[@src='target1.html']")
private WebElement frame1;
@FindBy(xpath="//iframe[@src='text.html']")
private WebElement frame2;
@FindBy(xpath="//iframe[@src='example.html']")
private WebElement frame3;
@FindBy(xpath="//a[text()='Click Here']")
private WebElement Clickme;
public void clickonAlertsframe()
{
	Alertsframe.click();
}
public void clickonnestedframes()
{
	Nestedframe.click();
}
public void clicktoframe() throws InterruptedException
{
	driver.switchTo().frame(frame1);
	Thread.sleep(2000);
	driver.switchTo().frame(frame2);
	driver.switchTo().frame(frame3);
	Clickme.click();
	
}

}
