package screenutility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import baselibrary.BaseLibrary;

public class Screenshot extends BaseLibrary
{

public static void getScreenshot(String foldername,String filename)
{

String location=System.getProperty("user.dir");
String path= location+"\\Screenshots\\"+foldername+"\\"+filename+"jpeg";
EventFiringWebDriver efw=new EventFiringWebDriver(driver);
File src = efw.getScreenshotAs(OutputType.FILE);
try {
	FileUtils.copyFile(src,new File(path));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}




}




 


}
