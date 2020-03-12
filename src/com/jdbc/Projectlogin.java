package com.jdbc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Projectlogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\gobi042\\Selenium042\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();

		d.get("https://www.kogan.com/");
		WebElement g = d.findElement(By.xpath("//div[text()='Login or Sign Up']"));
		g.click();
		WebElement h = d.findElement(By.xpath("//input[@id='input-loginbox-email']"));
h.sendKeys("jgytdxyuiguivc");
WebElement j= d.findElement(By.xpath("//input[@id='input-loginbox-password']"));
j.sendKeys("jgytdxyuiguivc");

WebElement p= d.findElement(By.xpath("//span[text()='Log In']"));
p.click();	}

}
