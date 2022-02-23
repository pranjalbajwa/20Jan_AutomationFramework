package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import baselibrary.BaseLibrary;
import screenutility.Screenshot;
import waitutility.Waitutility;

public class Link_Pages extends BaseLibrary

{

public Link_Pages()
{
	
	//PageFactory.initElements(driver,this);
	
}
@FindBy(xpath="//button[@class='btn btn-block p-0 text-left']")
private WebElement elements;
@FindBy(xpath="//a[text()='links']")
private WebElement links;
@FindBy(xpath="//a[text()='Demo Page']")
private WebElement Demopage;
@FindBy(xpath="//button[text()='×']")
private WebElement closebtn;
public void clickonelements()
{
	
	Waitutility.clickme(elements);
}

public void clickonlinks()
{
	
	Waitutility.clickme(links);
	//Screenshot.getScreenshot("passed","clickonelements");
	
}

public void clickonDemopage()
{
	
	Waitutility.clickme(Demopage);
}

public void closenewtabclosebtn()
{
	Applicationutility.Changewindow(1);
	Waitutility.clickme(closebtn);
	driver.close();
	Applicationutility.Changewindow(0);
	
}




}
