package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Modaldialogs_pages  extends BaseLibrary
{

public Modaldialogs_pages()
{	
//PageFactory.initElements(driver, this);

}
@FindBy(xpath="//button[@class='btn  btn-block p-0 text-left mr-5 ']")
private WebElement Alertsframe;
@FindBy(xpath="//a[text()='modal dialogs']")
private WebElement Modalsdialog;
@FindBy(xpath="//button[@data-target='#exampleModal1']")
private WebElement SmallModal;
@FindBy(xpath="(//button[@class='btn btn-primary'])[12]")
private WebElement close1;
@FindBy(xpath="//button[@data-target='#exampleModal2']")
private WebElement LargeModal;
@FindBy(xpath="(//button[@class='btn btn-primary'])[13]")
private WebElement close2;
public void clickonAlertsframe()
{
	Alertsframe.click();
}
public void clickonModalsdialog()
{
	Modalsdialog.click();
}
public void clickonSmallModal()
{
	SmallModal.click();
}
public void clickonClose1()
{
	close1.click();
}
public void clickonLargeModal()
{
	LargeModal.click();
}
public void clickonClose2()
{
	close2.click();
}





}
