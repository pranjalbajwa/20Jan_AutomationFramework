package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Radiobutton extends BaseLibrary

{

public Radiobutton()
{
    PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="//*[@data-target='#elements']")
private WebElement elements;
@FindBy(xpath="//a[text()='radio buttons']")
private WebElement Radiobuttons;
@FindBy(xpath="//input[@id='yes']")
private WebElement Yes;
@FindBy(xpath="//input[@id='impressive']")
private WebElement Impressive;
@FindBy(xpath="//input[@id='no']")
private WebElement No;

public void clickonElements()
{
	elements.click();
}
public void clickonRadiobutton()
{
	
	Radiobuttons.click();
}
public void clickonYes()
{
	
	Yes.click();
}

public void clickonImpressive()
{
	
	Impressive.click();
}

public void clickonNo()
{
	
	No.click();
}


}

