package com.selenium.locators;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Example for Locating element by Id 

public class LocateById {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\TestAutomation\\Grid\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://in.yahoo.com/");

		// Maximize the window
		driver.manage().window().maximize();
		// To Delay execution for 10 sec. as to view the resize browser

		Thread.sleep(50000);
		// Relative xpath for sign-in button in the yahoo home page

		driver.findElement(By.xpath("//*[@id='uh-signin']")).click();

		Thread.sleep(50000);
		// Absolute xpath for news tab in the yahoo home page
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div[2]/ul/li[3]/a")).click();
		;

		// To Delay execution for 10 sec. as to view the resize browser

		Thread.sleep(10000);

		// close the browser
		driver.quit();

	}

}
