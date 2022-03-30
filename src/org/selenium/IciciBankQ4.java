package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBankQ4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationProjectWorkspace\\SeleniumTaskVel\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.infinity.icicibank.com/");
		WebElement btnLogin = driver.findElement(By.xpath("//input[@name='DUMMY']"));
		btnLogin.click();
	}

}
