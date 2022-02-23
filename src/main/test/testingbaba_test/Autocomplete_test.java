package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutiltiy;
import testingbaba_pages.Autocomplete_pages;
import testingbaba_pages.Nestedframe_page;

public class Autocomplete_test extends BaseLibrary
{


Autocomplete_pages ob;	
@BeforeTest
public void getlaunchurl()
{
	
	getlaunch(Propertyutiltiy.getReaddata("Url"));
	ob = new Autocomplete_pages();
}
@Test(priority=1)
public void clickwidgets()
{
	ob.clickonwidgets();
}
@Test(priority=2)
public void autocompleteclick() throws InterruptedException
{
	ob.clickonautocomplete();
}
@Test(priority=3)
public void details()
{
ob.filldetails();	
	
}
@Test(priority=4)
public void datepicker()
{
	
	ob.clickondatepicker();
}
@Test(priority=4)
public void date()
{
	ob.clickonselectdate();
}


}
