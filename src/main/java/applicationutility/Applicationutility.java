package applicationutility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baselibrary.BaseLibrary;

public class Applicationutility extends BaseLibrary
{

public static void clickme(WebElement ele)

{
	//WebDriverWait wait = new WebDriverWait(driver,5);
	//wait.until(ExpectedConditions.elementToBeClickable(ele));
	//ele.click();
}

public static void doubleclick(WebElement ele)
{
	Actions act = new Actions(driver);
	act.doubleClick(ele).perform();
}

public static void Rightclick(WebElement ele)
{
	Actions act = new Actions(driver);
	act.contextClick(ele).perform();
}

public static void Changewindow(int tabno)
{
	Set<String> dd = driver.getWindowHandles();
	ArrayList<String>tabs = new ArrayList<String>(dd);
	driver.switchTo().window(tabs.get(tabno));
}

public static void fileupload(String loc) throws AWTException
{
	
StringSelection sel = new StringSelection(loc);
Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();	
clipboard.setContents(sel, null);	
Robot robot = new Robot();
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_CONTROL);
robot.keyRelease(KeyEvent.VK_V);
robot.keyPress(KeyEvent.VK_ENTER);
robot.delay(250);	
robot.keyRelease(KeyEvent.VK_ENTER);

}



}
