package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyQ6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationProjectWorkspace\\SeleniumTaskVel\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		WebElement txtUserLocation = driver.findElement(By.id("location"));
		txtUserLocation.sendKeys("2nd street omr chennai");
	}

}
