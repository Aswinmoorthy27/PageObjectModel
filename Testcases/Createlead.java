package Testcases;

import org.openqa.selenium.By;

import BasePackage.Base;

public class Createlead extends Base {

	public Createlead Createlead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return this;

	}

	public Createlead Companyname() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		return this;
	}

	public Createlead Firstname() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
		return this;

	}

	public Createlead Lastname() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subi");
		return this;

	}

	public Createlead Phonenumber() {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		return this;

	}

	public Createlead Submit() {
		driver.findElement(By.name("submitButton")).click();
		return this;

	}

	public ViewLeadsPage Verfiy() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead is not created");
		}
		return new ViewLeadsPage();

	}
}
