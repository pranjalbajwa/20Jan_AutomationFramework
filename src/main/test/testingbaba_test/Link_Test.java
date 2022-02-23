package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutiltiy;
import testingbaba_pages.Button_page;
import testingbaba_pages.Link_Pages;

public class Link_Test extends BaseLibrary
{

    Link_Pages ob;
	@BeforeTest
	public void getlaunchurl()
	{
		getlaunch(Propertyutiltiy.getReaddata("Url"));
		ob=new Link_Pages();
		
	}
@Test(priority=1)
public void elements()
{
	
	ob.clickonelements();
}
@Test(priority=2)
public void Links()
{
	ob.clickonlinks();
}
@Test(priority=3)
public void Demopage()
{
	
	ob.clickonDemopage();
}
@Test(priority=4)
public void closenewtab()
{
	
	ob.closenewtabclosebtn();
}


}
