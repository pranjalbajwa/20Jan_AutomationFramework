package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutiltiy;
import testingbaba_pages.Checkbox_page;

public class Checkbox_test extends BaseLibrary

{
  Checkbox_page ob;

  @BeforeTest
  public void getlaunchurl()
  {
	  getlaunch(Propertyutiltiy.getReaddata("Url"));
	  ob= new Checkbox_page();
	}
 
  @Test(priority=1)
  public void elements()
  {
  	
  	ob.clickonElements();
  
  }
  
  @Test(priority=2)
  public void checkbox()
  {
	ob.clickoncheckbox();
	
  }
  
  
  @Test(priority=3)

  public void clickonbtn()
  {
	  driver.switchTo().frame(ob.getFramexpath());
	ob.clickonmyCheck();
	ob.clickonmylaptop();
	ob.clickonmydesktop();
	driver.switchTo().defaultContent();
	  
  }
	


}
  


