package ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {

WebDriver driver;
	
	public DashBoard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Campaigns")
	private WebElement campaignsLink;
	
	@FindBy(linkText="Contacts")
	private WebElement contactsLink;
	
	@FindBy(linkText="Products")
	private WebElement productsLink;
	
	@FindBy(xpath="//*[name()='svg' and @role='img']")
	private WebElement profileIcon;
	
	@FindBy(xpath="//div[text()='Logout ']")
	private WebElement logoutBtn;


	public void logout()
	{
		profileIcon.click();
		Actions action=new Actions(driver);
		action.moveToElement(logoutBtn).click();
	}
	public void cont() throws InterruptedException
	{
		Thread.sleep(3000);
		contactsLink.click();
	}
	public void Product()
	{
		productsLink.click();
	}
	
	
}

