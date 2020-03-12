package com.jdbc;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Project   {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\gobi042\\Selenium042\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();

		d.get("https://www.kogan.com/");
		WebElement q = d.findElement(By.xpath("//input[@id='product-search-field']"));
		q.sendKeys("iphone 7");
		WebElement q2 = d.findElement(By.xpath("(//div[@role='button'])[3]"));
		q2.click();
				
		WebElement q1 = d.findElement(By.className("search-nav__icon"));
	q1.click();
	WebElement q3 = d.findElement(By.xpath("(//div[@role='button'])[3]"));
	q3.click();
	WebElement r = d.findElement(By.xpath("(//img [@class='_1Xm_H'])[3]"));
	r.click();
	Thread.sleep(2000);
	WebElement p = d.findElement(By.xpath("(//span[@class='buttonText'])[2]"));
	Actions a=new Actions(d);
	a.moveToElement(p);
	p.click();
	Thread.sleep(1000);
	// (//button[@type='button'])[3]
	WebElement j = d.findElement(By.xpath("//button[@class='_3t33I _1v6X8 _1x8rE fullWidth notouch _2l7WB']"));
	a.moveToElement(j);
	j.click();
	Thread.sleep(2000);
	WebElement j1 = d.findElement(By.xpath("(//span[text()='Checkout'])[1]"));
	j1.click();
	
	WebElement l = d.findElement(By.xpath("//input[@id='email']"));
	l.sendKeys("aravind008@gmail.com");

	WebElement l1 = d.findElement(By.xpath("//input[@id='full_name']"));
	l1.sendKeys("aravind");
	WebElement l2 = d.findElement(By.xpath("//input[@id='phone']"));
	l2.sendKeys("9889898989");
	
	WebElement h = d.findElement(By.xpath("//span[text()='Continue']"));
	h.click();
	}
}
