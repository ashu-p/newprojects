package frameworkprog;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewProjectPage {
	@FindBy(name="name")
		private WebElement projectNameTextField;
	@FindBy(name="customerId")
	private WebElement selectTheCustomerFromSelectOption;
		@FindBy(name="createProjectSubmit")
		private WebElement createProjectButton;
		public AddNewProjectPage()
		{
			PageFactory.initElements(BaseClass.driver,this);
		}
		public void enterProjectNameInProjectNameTextField(String projectName)
		{
			projectNameTextField.sendKeys(projectName);
		}
		public void selectCustomerNameFromDropdwon(String customerName)
		{
			Select s=new Select(selectTheCustomerFromSelectOption);
			s.selectByVisibleText(customerName);
		}
		public void clickOnCreateProjectButton()
		{
			createProjectButton.click();
		}
		}


