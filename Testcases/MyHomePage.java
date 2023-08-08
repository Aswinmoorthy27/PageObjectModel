package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BasePackage.Base;

public class MyHomePage extends Base {

	public MyLeadsPage myhomeverify() {
		WebElement Myhome = driver.findElement(By.xpath("//a[text()='My Home']"));
		String MyHomeVerify = Myhome.getText();
		System.out.println("" + MyHomeVerify);

		if (MyHomeVerify.equals(MyHomeVerify)) {
			System.out.println("MyHome Is Verified");
		}
		return new MyLeadsPage();

	}

}
