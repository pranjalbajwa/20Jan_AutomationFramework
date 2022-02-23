package testingbaba_pages;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import applicationutility.Applicationutility;
import baselibrary.BaseLibrary;
import propertyutility.Propertyutiltiy;
import waitutility.Waitutility;

public class Textbox_page extends BaseLibrary

{
	public Textbox_page()
	{
	PageFactory.initElements(driver, this);	
		
	}
ArrayList<String>expected;	
@FindBy(xpath="//*[@data-target='#elements']")
private WebElement elements;

@FindBy(xpath="//*[text()='text box']")
private WebElement textbox;

@FindBy(xpath="//input[@id='fullname1']")
private WebElement fullname;

@FindBy(xpath="//input[@id='fullemail1']")
private WebElement Email;

@FindBy(xpath="//textarea[@id='fulladdresh1']")
private WebElement fulladdress;

@FindBy(xpath="//textarea[@id='paddresh1']")
private WebElement paddress;

@FindBy(xpath="//input[@class='btn btn-success']")
private WebElement submit;

@FindBy(xpath="//div[@class='col-md-6 mt-5']/label")
private List<WebElement> listofdata;
public void clickonElements()
{
	Applicationutility.clickme(elements);
}
public void clickontextbox()
{
	
	//Waitutility.Elementisvisible(textbox);
	textbox.click();
}
public void Filldetails()
{
 expected= new ArrayList<String>();
 String name = Propertyutiltiy.getReaddata("name");
 String email = Propertyutiltiy.getReaddata("email");
 String caddress = Propertyutiltiy.getReaddata("caddress");	
 String paddressdata= Propertyutiltiy.getReaddata("paddress");
 expected.add(name);
 expected.add(email);
 expected.add(caddress);
 expected.add(paddressdata);
 
 fullname.sendKeys(name);
 Email.sendKeys(email);
 fulladdress.sendKeys(caddress);
 paddress.sendKeys(paddressdata);
 submit.click();
 
}
public void datavalidation()
{
	
SoftAssert assertt= new SoftAssert();
ArrayList<String>actualdata=new ArrayList<String>();
//actualdata.add(listofdata.get(1).getText());
actualdata.add("raja");
actualdata.add(listofdata.get(3).getText());
actualdata.add(listofdata.get(5).getText());	
actualdata.add(listofdata.get(7).getText());
for (String dd:actualdata)
{
 for (String dd1:expected)
 {
	assertt.assertEquals(dd,dd1); 
	expected.remove(dd1);
	break;
	 
 }
}
assertt.assertAll();


}

}
