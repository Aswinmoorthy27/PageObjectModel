package Testcases;

import org.openqa.selenium.By;

import BasePackage.Base;

public class LoginPage extends Base {

	public LoginPage EnterUsername() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		return this;
	}

	public LoginPage EnterPwd() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}

	public WelcomePage ClickButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}
}
