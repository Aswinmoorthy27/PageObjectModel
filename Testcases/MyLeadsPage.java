package Testcases;

import org.openqa.selenium.By;

import BasePackage.Base;

public class MyLeadsPage extends Base {


	public MyLeadsPage Createlead() {
		driver.findElement(By.linkText("Create Lead")).click();
        return this;

	}

	public MyLeadsPage Companyname() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
        return this;
	}

	public MyLeadsPage Firstname() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
        return this;

	}

	public MyLeadsPage Lastname() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subi");
        return this;

	}

	public MyLeadsPage Phonenumber() {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
        return this;

	}

	public MyLeadsPage Submit() {
		driver.findElement(By.name("submitButton")).click();
        return this;

	}

	public MyLeadsPage Verfiy() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead is not created");
		}
        return this;

	}

}
