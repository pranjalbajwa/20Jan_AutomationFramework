package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import baselibrary.BaseLibrary;
import waitutility.Waitutility;

public class Browser_page extends BaseLibrary 

{

public Browser_page()
{
	//PageFactory.initElements(driver,this);
	
}

@FindBy(xpath="//button[@class='btn  btn-block p-0 text-left mr-5 ']")
private WebElement Alertsframe;
@FindBy(xpath="//a[text()='browser windows']")
private WebElement Browserwindows;
@FindBy(xpath="(//a[@class='btn btn-primary'])[1]")
private WebElement Newtab;
@FindBy(xpath="//a[text()='New Window']")
private WebElement Newwindow;
@FindBy(xpath="//a[text()='New Window Message']")
private WebElement NewWindowmsg;
public void clickonAlertsframe() 
{
	try {
		Thread.sleep(2000);
		Waitutility.Elementisvisible(Alertsframe);
		Alertsframe.click();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void clickonBrowserwindows()
{
	Browserwindows.click();
}

public void clickonNewtab()
{
	Newtab.click();
}
public void clickonnewtabclose()
{
	Applicationutility.Changewindow(1);
	driver.close();
	Applicationutility.Changewindow(0);
}
public void clickonNewWindow()
{
	Newwindow.click();
}
public void clickonNewWindowclose()
{
	Applicationutility.Changewindow(1);
	driver.close();
	Applicationutility.Changewindow(0);
	
}
public void clickonNewWindowmsg()
{
	NewWindowmsg.click();
}

}
