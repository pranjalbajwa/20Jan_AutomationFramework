package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutiltiy;
import testingbaba_pages.Radiobutton;

public class Radiobutton_test extends BaseLibrary
{

	Radiobutton ob;
	@BeforeTest
	public void getlaunchurl()
	{
		getlaunch(Propertyutiltiy.getReaddata("Url"));
		ob=new Radiobutton();
		
	}
@Test(priority=1)	
public void elements()
{
	  	ob.clickonElements();
}
@Test(priority=2)	
public void buttondetails()
{
	ob.clickonRadiobutton();
}
@Test(priority=3)	
public void clickdetails()
{
	ob.clickonYes();
	ob.clickonImpressive();
	ob.clickonNo();
}


}
