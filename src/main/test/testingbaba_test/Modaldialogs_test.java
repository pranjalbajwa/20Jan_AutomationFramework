package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutiltiy;
import testingbaba_pages.Modaldialogs_pages;


public class Modaldialogs_test extends BaseLibrary
{

Modaldialogs_pages ob;
@BeforeTest
public void getlaunhcurl()
{
	getlaunch(Propertyutiltiy.getReaddata("Url"));
	ob = new Modaldialogs_pages();
}
@Test(priority=1)
public void Alertsframeclick()
{
	ob.clickonAlertsframe();
}
@Test(priority=2)
public void Modalsdialogclick()
{
ob.clickonModalsdialog();
}
@Test(priority=3)
public void Smallmodalclick()
{
	ob.clickonSmallModal();
}
@Test(priority=4)
public void closeclick1() throws InterruptedException
{
	Thread.sleep(4000);
	ob.clickonClose1();
}
public void Largemodalclick() throws InterruptedException
{
	Thread.sleep(2000);
	ob.clickonLargeModal();
}
public void closeclick2()
{
	ob.clickonClose2();
}







}
