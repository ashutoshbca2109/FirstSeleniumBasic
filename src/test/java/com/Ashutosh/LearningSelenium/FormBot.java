package com.Ashutosh.LearningSelenium;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class FormBot {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./binaries/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://form-bot-anvsystems.pages.dev/");
		driver.findElement(By.name("firstname")).sendKeys("Ashutosh");
		driver.findElement(By.name("lastname")).sendKeys("Rout");
		driver.findElement(By.name("email")).sendKeys("ashut@rout.com");
		driver.findElement(By.name("gender")).click();
		
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/label[4]/label[2]/input")).click();
		
		driver.findElement(By.name("phone")).sendKeys("7865442132");
		driver.findElement(By.xpath("//option[@value='USA']")).click();
		
//		Select s = new Select(driver.findElement(By.name("country")));
//		s.selectByIndex(2);
//		s.selectByVisibleText("India");
//		s.selectByValue("UK");
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/label[6]/select/option[5]")).click();
		
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		driver.quit();
	}
}
