package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.BaseLibrary;

public class Login_page extends BaseLibrary

{
	
	
	public void gettitle()
	{
		
		String title= driver.getTitle();
		System.out.println("actual title is :"+title);
		Assert.assertEquals(title, "Testing baba");
		
	
	}

	
	}
