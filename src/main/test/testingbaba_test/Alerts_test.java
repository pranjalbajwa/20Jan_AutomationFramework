package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutiltiy;
import testingbaba_pages.Alerts_page;
import testingbaba_pages.Browser_page;

public class Alerts_test extends BaseLibrary
{
 
Alerts_page ob;
@BeforeTest
public void getlaunchurl()
{
	getlaunch(Propertyutiltiy.getReaddata("Url"));
    ob=new Alerts_page(); 
}
@Test(priority=1)
public void Alerts()
{
	ob.clickonAlertsframe();
}
@Test(priority=2)
public void Alerts1()
{
	ob.clickonAlerts();
}
@Test(priority=3)
public void click1()
{
	ob.clickonclickme1();
}
@Test(priority=4)
public void click2()
{
	ob.clickonclickme2();
}
@Test(priority=5)
public void click3()
{
	ob.clickonclickme3();
}
@Test(priority=6)
public void click4()
{
	ob.clickonclickme4();
}

}
