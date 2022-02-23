package testingbaba_test;

import org.apache.poi.hpsf.Property;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutiltiy;
import testingbaba_pages.Login_page;

public class Login_test extends BaseLibrary

{

Login_page ob;
 @BeforeTest
 
 public void getlaunchUrl()
 
 {
	 	 getlaunch(Propertyutiltiy.getReaddata("Url"));
	 ob= new Login_page();
 }
@Test(priority=0)
public void gettitle()
{
	ob.gettitle();
}


}
