package WebPage;

import org.testng.annotations.Test;

import BasePackage.Base;
import Testcases.LoginPage;
import Testcases.MyHomePage;
import Testcases.MyLeadsPage;
import Testcases.WelcomePage;

public class VerifyloginPage extends Base {

	@Test
	public void Run() {

		LoginPage obj = new LoginPage();
		obj.EnterUsername().EnterPwd().ClickButton().verifyTitle().crmclick().myhomeverify().Clickleads().Createlead()
				.Companyname().Firstname().Lastname().Phonenumber().Submit().Verfiy().verifyleadpage().VerifyFirstname();

	}

}
