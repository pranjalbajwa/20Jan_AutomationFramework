package testingbaba_test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutiltiy;
import testingbaba_pages.Checkbox_page;
import testingbaba_pages.Webtables_page;

public class Webtables_test extends BaseLibrary

{
	Webtables_page ob;
	@BeforeTest
	  public void getlaunchurl()
	  {
		  getlaunch(Propertyutiltiy.getReaddata("Url"));
		  ob= new Webtables_page();
		}
@Test(priority=1)
public void elements()
{
	
	ob.clickonElements();
}

@Test(priority=2)
public void webtables()
{
	
	ob.clickonwebtables();
}
@Test(priority=3)
public void details() throws IOException
{
	driver.switchTo().frame(ob.getframexpath());
	ob.Filldetails();
	driver.switchTo().defaultContent();
}
@Test(priority=4,enabled=false)
public void Update() throws IOException
{
	ob.Updatedetails();
}
@Test(priority=5 , enabled=true)
public void validation() throws IOException
{
	ob.datavalidation();
}
}
