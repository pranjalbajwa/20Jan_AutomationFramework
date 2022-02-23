package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutiltiy;
import testingbaba_pages.Nestedframe_page;

public class Nestedframe_test extends BaseLibrary
{

Nestedframe_page ob;	
@BeforeTest
public void getlaunchurl()
{
	
	getlaunch(Propertyutiltiy.getReaddata("Url"));
	ob = new Nestedframe_page();
}
@Test(priority=1)
public void Alertsframeclick()
{
ob.clickonAlertsframe();	
	
}
@Test(priority=2)
public void Nestedframe()
{
	ob.clickonnestedframes();
}
@Test(priority=3)
public void frameclick() throws InterruptedException
{
	ob.clicktoframe();
}





}
