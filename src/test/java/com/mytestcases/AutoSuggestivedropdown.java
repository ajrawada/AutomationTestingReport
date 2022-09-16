package com.mytestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestivedropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Project_name\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.findElement(By.id("autocomplete")).click();
driver.findElement(By.id("autocomplete")).sendKeys("Ind");
Thread.sleep(2000);
driver.findElement(By.xpath("//li//div[text()='India']")).click();
	}

}
