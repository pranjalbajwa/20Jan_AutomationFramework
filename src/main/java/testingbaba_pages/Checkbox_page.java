package testingbaba_pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import applicationutility.Applicationutility;
import baselibrary.BaseLibrary;
import propertyutility.Propertyutiltiy;
import screenutility.Screenshot;
import waitutility.Waitutility;

public class Checkbox_page extends BaseLibrary
{

public Checkbox_page()
{
	
	//PageFactory.initElements(driver, this);	
}

@FindBy(xpath="//*[@data-target='#elements']")
private WebElement elements;
@FindBy(xpath="//a[text()='check box']")
private WebElement checkbox;
@FindBy(xpath="(//iframe[@class='embed-responsive-item'])[1]")
private WebElement framexpath;
@FindBy(xpath="//input[@id='myCheck']")
private WebElement Mobile;
@FindBy(xpath="//input[@id='mylaptop']")
private WebElement laptop;
@FindBy(xpath="//input[@id='mydesktop']")
private WebElement desktop;

private List<WebElement> listofdata;
ArrayList<String> expected;
public void clickonElements()
{
	elements.click();
	//Screenshot.getScreenshot("passed","clickonelements");
}
public void clickoncheckbox()
{
	
	checkbox.click();
}
public void clickonmyCheck()
{
	Mobile.click();
}
public void clickonmylaptop()
{
	
	laptop.click();
}
public void clickonmydesktop()
{
	desktop.click();
	
}

public WebElement getFramexpath() {
	return framexpath;
}
public void checkdetails()
{
  expected = new ArrayList<String>();
String Mobile = Propertyutiltiy.getReaddata("Mobile");
String Laptop = Propertyutiltiy.getReaddata("Laptop");
String Desktop = Propertyutiltiy.getReaddata("Desktop");
expected.add(Mobile);
expected.add(Laptop);
expected.add(Desktop);

}
public void detailsvalidation()
{
	
SoftAssert assertt=new SoftAssert();	
ArrayList<String> actualdata = new ArrayList<String>();
actualdata.add("raja");
actualdata.add(listofdata.get(3).getText());
actualdata.add(listofdata.get(5).getText());

for(String dd:actualdata)	
{
	for(String dd1:expected)
	{
	assertt.assertEquals(dd,dd1);
	expected.remove(dd1);
	break;
		
	}
}
assertt.assertAll();


}


}
