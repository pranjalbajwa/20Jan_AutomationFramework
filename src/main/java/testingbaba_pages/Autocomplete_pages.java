package testingbaba_pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Autocomplete_pages extends BaseLibrary
{

public Autocomplete_pages()
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//button[@data-target='#widget']")
private WebElement widgets;
@FindBy(xpath="//a[text()='auto complete']")
private WebElement autocomplete;
@FindBy(xpath="//input[@id='myInput']")
private WebElement myinput;
@FindBy(xpath="(//iframe[@class='embed-responsive-item'])[3]")
private WebElement frame1;
@FindBy(xpath="//a[text()='date picker']")
private WebElement datepicker;
@FindBy(xpath="(//input[@class='form-control'])[10]")
private WebElement selectdate;
public void clickonwidgets()
{
	widgets.click();
}
public void clickonautocomplete() throws InterruptedException
{
	Thread.sleep(2000);
	autocomplete.click();
	
}
public void filldetails()
{
	driver.switchTo().frame(frame1);
	myinput.sendKeys("Ind");
	myinput.sendKeys(Keys.ARROW_DOWN);
	myinput.sendKeys(Keys.ENTER);
	driver.switchTo().defaultContent();
}

public void clickondatepicker()
{
	datepicker.click();
}

public void clickonselectdate()
{

	selectdate.click();	
	selectdate.sendKeys(Keys.ARROW_LEFT);
	selectdate.sendKeys(Keys.ARROW_LEFT);
	selectdate.sendKeys("23-02-2022");
}



}
