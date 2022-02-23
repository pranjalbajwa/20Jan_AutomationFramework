package testingbaba_pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import baselibrary.BaseLibrary;
import waitutility.Waitutility;

public class Upload_Download_page extends BaseLibrary

{
	
String path="C:\\Users\\pranj\\eclipse2\\20Jan_AutomationFramework\\testdata\\overloading.txt";
public Upload_Download_page()
{
	
	PageFactory.initElements(driver, this);	
	
}

@FindBy(xpath="//button[@class='btn btn-block p-0 text-left']")
private WebElement elements;
@FindBy(xpath="//a[text()='upload and download']")
private WebElement upload_download;
@FindBy(xpath="//label[text()='Select a file']")
private WebElement Selectfile;

public void clickonelements()
{
	Waitutility.clickme(elements);
	
}
public void clickonuploaddownload()
{
	
	Waitutility.clickme(upload_download);
}
public void clickonselectfile()
{
	
	Waitutility.clickme(Selectfile);
}


public void fileupload() throws InterruptedException, AWTException 
{
	Thread.sleep(2000);

		Applicationutility.fileupload(path);
	
}

}
