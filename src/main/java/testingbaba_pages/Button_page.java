package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import baselibrary.BaseLibrary;
import waitutility.Waitutility;

public class Button_page extends BaseLibrary
{

public Button_page()
{
	PageFactory.initElements(driver, this);	
	
}
@FindBy(xpath="//*[@data-target='#elements']")
private WebElement elements;
@FindBy(xpath="//a[text()='buttons']")
private WebElement buttons;
@FindBy(xpath="(//button[@class='btn btn-primary'])[1]")
private WebElement doubleclick;
@FindBy(xpath="//button[@id='noContextMenu']")
private WebElement rightclick;
@FindBy(xpath="(//button[@class='btn btn-primary'])[3]")
private WebElement clickme;

public void clickonelements()
{
	Waitutility.clickme(elements);
}

public void clickonbuttons()
{
	Waitutility.clickme(buttons);
}

public void clickonDoubleclick()
{
    Applicationutility.doubleclick(doubleclick);
}

public void clickonrightclick()
{
	Applicationutility.Rightclick(rightclick);
	
}

public void clickonclickme()
{
	Waitutility.clickme(clickme);
	
}

}
