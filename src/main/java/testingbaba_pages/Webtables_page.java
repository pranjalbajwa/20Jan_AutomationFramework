package testingbaba_pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.lang.model.util.Elements;

import org.apache.poi.ss.usermodel.Name;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baselibrary.BaseLibrary;
import excelutility.excelutility;
import screenutility.Screenshot;
import waitutility.Waitutility;

public class Webtables_page extends BaseLibrary
{
String str ="";
public String path = null;
public Webtables_page()
{
	
	PageFactory.initElements(driver, this);
}
ArrayList<String>expected;	
@FindBy(xpath="//*[@data-target='#elements']")
private WebElement elements;
@FindBy(xpath="//a[text()='web tables']")
private WebElement Webtables;
@FindBy(xpath="(//iframe[@class='embed-responsive-item'])[2]")
private WebElement framexpath;
@FindBy(xpath="//div[@class='form-group']//input[@name='name']")
private WebElement Name;
@FindBy(xpath="//div[@class='form-group']//input[@name='email']")
private WebElement Email;
@FindBy(xpath="//button[@class='btn btn-success save-btn']")
private WebElement save;
@FindBy(xpath="//button[@class='btn btn-info btn-xs btn-edit']")
private List <WebElement>editlist;
@FindBy(xpath="//input[@name='edit_name']")
private List <WebElement>editname;
@FindBy(xpath="//input[@name='edit_email']")
private List <WebElement> editemail;
@FindBy(xpath="//button[@class='btn btn-info btn-xs btn-update']")
private WebElement update;
@FindBy(xpath="//table[@class='table table-bordered data-table']/thead/tr/following::tbody/tr/td[1]")
private WebElement newname;
@FindBy(xpath="//table[@class='table table-bordered data-table']/thead/tr/following::tbody/tr/td[2]")
private WebElement newemail;
private List<WebElement> listofdata;
public void clickonElements()
{
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    elements.click();
}

public void clickonwebtables()
{
	
Webtables.click();
}

public WebElement getframexpath()
{
	
	return framexpath;
}

public void Filldetails() throws IOException
{
	
	for(int i=1;i<=excelutility.rowcount()-1;i++)
	{
	expected= new ArrayList<String>();
	String name = excelutility.getreaddata( i, 0);
	String email = excelutility.getreaddata( i,1);

Name.sendKeys(name);
Email.sendKeys(email);
save.click();

}
}
public void Updatedetails() throws IOException
{
int i=1;
for (WebElement edit:editlist)
{
Waitutility.clickme(edit);
editname.clear();
editname.get(i).sendKeys(excelutility.getreaddata(i,2));
editemail.clear();
editname.get(i).sendKeys(excelutility.getreaddata(i,3));
Waitutility.clickme(update);
i++;	
}
}

public void datavalidation() throws IOException
{
SoftAssert assertt=new SoftAssert();
int i= 1;
for(WebElement uname:editname)
{
	String dd=uname.getText();
	assertt.assertEquals(dd,excelutility.getreaddata( i, 0));
	i++;
}
for (WebElement uemail:editemail)
{
	String dd1=uemail.getText();
	assertt.assertEquals(dd1,excelutility.getreaddata( i,1));
	i++;
}
assertt.assertAll();
}
}
