package Testcases;

import org.openqa.selenium.By;

import BasePackage.Base;

public class MyLeadsPage extends Base {

	public Createlead Clickleads() {
		driver.findElement(By.linkText("Leads")).click();
		return new Createlead();
	}

}
