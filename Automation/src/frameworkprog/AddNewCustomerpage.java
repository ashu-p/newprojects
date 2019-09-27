package frameworkprog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerpage 
{
	@FindBy(name="name")
	private WebElement customerNameTextField;
	@FindBy(name="createCustomerSubmit")
	private WebElement createCustomerButton;
	public AddNewCustomerpage()
	{
		PageFactory.initElements(BaseClass.driver,this);
	}
	public void enterCustomerNameInCustomerNameTextField(String customerName)
	{
		customerNameTextField.sendKeys(customerName);
	}
	public void clickOnCreateCustomerButton()
	{
		createCustomerButton.click();
	}
}



