package frameworkprog;

import org.testng.annotations.Test;

public class CreateProject extends BaseClass
{
		@Test
		public void testCreateCustomer()
		{
			OpenTaskPage otp=new OpenTaskPage();
			otp.clickOnProjectsAndCustomersLink();
			ActiveProjectsAndCustomerspage apac=new ActiveProjectsAndCustomerspage();
			apac.clickOnAddProjectButton();
			AddNewProjectPage ancp=new AddNewProjectPage();
			ancp.selectCustomerNameFromDropdwon("ashu");
			ancp.enterProjectNameInProjectNameTextField("data mining");
			ancp.clickOnCreateProjectButton();
			String s=apac.retriveSuccessMessage();
			System.out.println(s);
			

	}

}
