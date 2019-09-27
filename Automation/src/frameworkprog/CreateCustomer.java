package frameworkprog;

import org.testng.annotations.Test;

public class CreateCustomer extends BaseClass
{
@Test
public void testCreateCustomer()
{
	OpenTaskPage otp=new OpenTaskPage();
	otp.clickOnProjectsAndCustomersLink();
	ActiveProjectsAndCustomerspage apac=new ActiveProjectsAndCustomerspage();
	apac.clickOnAddCustomerButton();
	AddNewCustomerpage ancp=new AddNewCustomerpage();
	ancp.enterCustomerNameInCustomerNameTextField("suman");
	ancp.clickOnCreateCustomerButton();
	String s=apac.retriveSuccessMessage();
	System.out.println(s);
	
}

	}


