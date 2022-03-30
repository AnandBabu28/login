package org.seleenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactInHotel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationProjectWorkspace\\Day3TaskSelenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement txtUsername = driver.findElement(By.xpath("//input[@id='username']"));
		txtUsername.sendKeys("anandbabu");
		WebElement txtpassword = driver.findElement(By.xpath("//input[@id='password']"));
		txtpassword.sendKeys("Babu@28");
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
		WebElement locationDrop = driver.findElement(By.id("location"));
		Select select=new Select(locationDrop);
		select.selectByVisibleText("Melbourne");
		Thread.sleep(2000);
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select select1=new Select(hotels);
		select1.selectByVisibleText("Hotel Hervey");
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select s3=new Select(roomType);
		s3.selectByVisibleText("Double");
		Thread.sleep(3000);
		WebElement roomNum = driver.findElement(By.id("room_nos"));
		Select s4=new Select(roomNum); 
		s4.selectByVisibleText("5 - Five");
		WebElement dateCheckin = driver.findElement(By.id("datepick_in"));
		//Select s5=new Select(dateCheckin);
		dateCheckin.sendKeys("19-03-2022");
		
		WebElement adlatroom = driver.findElement(By.id("adult_room"));
		Select s6=new Select(adlatroom);
		s6.selectByVisibleText("3 - Three");
		WebElement childRomm = driver.findElement(By.id("child_room"));
		Select s7=new Select(childRomm);
		s7.selectByVisibleText("4 - Four");
		WebElement btn = driver.findElement(By.id("Submit"));
		btn.click();
		WebElement element = driver.findElement(By.id("radiobutton_0"));
		element.click();
		
	}

}
