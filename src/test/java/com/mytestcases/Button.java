package com.mytestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Project_name\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.findElement(By.xpath("//input[@value='radio1']")).click();
driver.findElement(By.xpath("//input[@value='radio2']")).click();
driver.findElement(By.xpath("//input[@value='radio3']")).click();
driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("india");

	}

}
