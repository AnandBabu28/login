package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusQ2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationProjectWorkspace\\SeleniumTaskVel\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		WebElement txtDestinationFrom = driver.findElement(By.id("src"));
		txtDestinationFrom.sendKeys("Chennai");
		WebElement txtTo = driver.findElement(By.id("dest"));
		txtTo.sendKeys("Velakkani");
	}
	

}
