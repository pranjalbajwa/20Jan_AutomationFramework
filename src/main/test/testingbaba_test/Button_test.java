package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutiltiy;
import testingbaba_pages.Button_page;
import testingbaba_pages.Radiobutton;

public class Button_test extends BaseLibrary

{
    
	Button_page ob;
	@BeforeTest
	public void getlaunchurl()
	{
		getlaunch(Propertyutiltiy.getReaddata("Url"));
		ob=new Button_page();
		
	}
@Test(priority=1)
public void elements()
{
	
	ob.clickonelements();
}
@Test(priority=2)
public void buttons()
{
	
	ob.clickonbuttons();
}
@Test(priority=3)
public void doubleclick()
{
	ob.clickonDoubleclick();
	
}
@Test(priority=4)
public void Rightclick() 
{
 ob.clickonrightclick();
}

@Test(priority=5)
public void clickme()
{
	
	ob.clickonclickme();
}


}
