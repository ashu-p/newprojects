package frameworkprog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveProjectsAndCustomerspage {

	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement addNewCustomerButton;
	@FindBy(xpath="//input[@value='Add New Project']")
	private WebElement addNewProjectButton;
	@FindBy(className="successmsg")
	private WebElement successMessage;
	public ActiveProjectsAndCustomerspage()
	{
		PageFactory.initElements(BaseClass.driver,this);
	}
	public void clickOnAddCustomerButton()
	{
		addNewCustomerButton.click();
	}
	public void clickOnAddProjectButton()
	{
		addNewProjectButton.click();
	}
	public String retriveSuccessMessage()
	{
		String s=successMessage.getText();
		return s;
	}
}


