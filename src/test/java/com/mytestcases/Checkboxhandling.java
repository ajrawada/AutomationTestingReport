package com.mytestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxhandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Project_name\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
System.out.println(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
driver.findElement(By.xpath("//input[@value='option1']")).click();
System.out.println(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
driver.findElement(By.xpath("//input[@value='option2']")).click();
driver.findElement(By.xpath("//input[@value='option3']")).click();
System.out.println(driver.findElement(By.xpath("//input[@value='option2']")).isSelected());
System.out.println(driver.findElement(By.xpath("//input[@value='option3']")).isSelected());

	}

}