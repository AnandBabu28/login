package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramQ8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationProjectWorkspace\\SeleniumTaskVel\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
WebElement txtMobilenum = driver.findElement(By.xpath("//input[@maxlength='75']"));
txtMobilenum.sendKeys("8870556850");
		WebElement txtPassword = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		txtPassword.sendKeys("258741@5");
	}

}
