package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BasePackage.Base;

public class ViewLeadsPage extends Base {

	public ViewLeadsPage verifyleadpage() {
		String Currentpage = driver.getTitle();
		System.out.println(Currentpage);
        return this;
	}

	public ViewLeadsPage VerifyFirstname() {
		WebElement Firstname = driver.findElement(By.xpath("(//span[text()='First name']//following::td)[1]"));
		String Fname = Firstname.getText();
		System.out.println(Fname);

		if (Fname.equalsIgnoreCase("Subraja")) {
			System.out.println("Verified");
		}

        return new ViewLeadsPage();
	}
}
