package com.Ashutosh.LearningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
	public static void main(String[] args) throws InterruptedException {
//		System.out.println(System.getProperty("os.name"));
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\FirstSeleniumBasic\\Binaries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Redmi 12 5G");
//		driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();
  }
}
