package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutiltiy;
import testingbaba_pages.Browser_page;

public class Browser_Test extends BaseLibrary 
{
Browser_page ob;
@BeforeTest
public void getlaunchurl()
{
	getlaunch(Propertyutiltiy.getReaddata("Url"));
    ob=new Browser_page(); 
}
@Test(priority=1)
public void Alerts() 
{
	ob.clickonAlertsframe();
	
}
@Test(priority=2)
public void Browser()
{
	ob.clickonBrowserwindows();
}
@Test(priority=3)
public void Newtabdetails()
{
	ob.clickonNewtab();
}
@Test(priority=4)
public void Newtabclose()
{
	ob.clickonnewtabclose();
}
@Test(priority=5)
public void Newwindow()
{
	ob.clickonNewWindow();
	
}
@Test(priority=6)
public void Newwindowclose()
{
	ob.clickonNewWindowclose();
}
@Test(priority=7)
public void NewMessage()
{
	ob.clickonNewWindowmsg();
}
}
