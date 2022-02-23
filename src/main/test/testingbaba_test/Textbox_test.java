package testingbaba_test;

import org.apache.poi.sl.usermodel.TextBox;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutiltiy;
import testingbaba_pages.Textbox_page;

public class Textbox_test extends BaseLibrary
{

	Textbox_page ob;
	@BeforeTest
	public void getlaunchurl()
	{
		
		getlaunch(Propertyutiltiy.getReaddata("Url"));
		ob=new Textbox_page();
	}

@Test(priority=0)
public void textbox()
{
	ob.clickonElements();
	ob.clickontextbox();
}
@Test(priority=1)
public void Filldetails()
{
	
	ob.Filldetails();
}
@Test(priority=2)
public void datavalidation()
{
	ob.datavalidation();
	
}

}
