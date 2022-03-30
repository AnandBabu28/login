package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookQ1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationProjectWorkspace\\SeleniumTaskVel\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
WebElement txtEmailOrPhone = driver.findElement(By.id("email"));
txtEmailOrPhone.sendKeys("8870568780");
WebElement txtpassword = driver.findElement(By.id("pass"));
txtpassword.sendKeys("banda@2568745");
	}

}

