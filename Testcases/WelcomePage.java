package Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BasePackage.Base;

public class WelcomePage extends Base {

	public WelcomePage verifyTitle() {
		String verify = driver.getTitle();
		System.out.println(verify);

		if (verify.contentEquals(verify)) {
			System.out.println("TITLE VERIFIED");
		}

		return this;
	}

	public MyHomePage crmclick() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();

	}
}
