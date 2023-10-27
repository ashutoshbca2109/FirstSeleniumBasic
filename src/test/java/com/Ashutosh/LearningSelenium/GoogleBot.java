package com.Ashutosh.LearningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleBot {
	public static void main(String[] args) throws InterruptedException {
//		System.out.println(System.getProperty("os.name"));
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\FirstSeleniumBasic\\Binaries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		driver.quit();
		
	}

}
