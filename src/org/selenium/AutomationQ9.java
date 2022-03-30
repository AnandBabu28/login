package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationQ9 {

	public static void main(String[] args) {
		// http://demo.automationtesting.in/Register.html
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationProjectWorkspace\\Day3TaskSelenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement txtFirstName = driver.findElement(By.xpath("//input[contains(@placeholder,'F')]"));
		txtFirstName.sendKeys("Anand");
		////textarea[contains(@rows,'3')]
		WebElement txtAddress = driver.findElement(By.xpath("//textarea[contains(@rows,'3')]"));
		txtAddress.sendKeys("14 omr chennai");
	}

}

