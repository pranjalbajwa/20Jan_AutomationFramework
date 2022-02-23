package testingbaba_test;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutiltiy;
import testingbaba_pages.Link_Pages;
import testingbaba_pages.Upload_Download_page;

public class Upload_downlaod_test extends BaseLibrary
{
    
	Upload_Download_page ob;
	@BeforeTest
	public void getlaunchurl()
	{
		getlaunch(Propertyutiltiy.getReaddata("Url"));
		ob=new Upload_Download_page();
	}

@Test(priority=1)
public void elements()
{
		
ob.clickonelements();
}
@Test(priority=2)
public void uploaddownlaod()
{
	
ob.clickonuploaddownload();
}
@Test(priority=3)
public void choosefile()
{
	
	ob.clickonselectfile();
}

@Test(priority=4)
public void file() throws InterruptedException, AWTException
{
	
	ob.fileupload();
}

}
