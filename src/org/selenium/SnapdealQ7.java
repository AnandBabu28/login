package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealQ7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationProjectWorkspace\\SeleniumTaskVel\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/login/");
		WebElement txtMobileNum = driver.findElement(By.xpath("//input[@id='userName']"));
		txtMobileNum.sendKeys("8870556850");
		
	}

}
