package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutiltiy;
import testingbaba_pages.Frames_page;

public class Frames_test extends BaseLibrary 
{
	 Frames_page ob;
	 @BeforeTest
 public void getlaunchurl()
 {
	 getlaunch(Propertyutiltiy.getReaddata("Url"));
	 ob=new Frames_page();
 }
@Test(priority=1)
public void AlertsFrameclick()
{
	ob.clickonAlertsframe();
}
@Test(priority=2)
public void Frameclick()
{
	ob.clickonAlerts();
}
@Test(priority=3)
public void details()
{
	ob.getdetails();
}
@Test(priority=4)
public void frame1()
{
	driver.switchTo().frame(ob.getFramexpath());
	ob.verifydetails();
	driver.switchTo().defaultContent();
}
}
