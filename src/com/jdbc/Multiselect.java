package com.jdbc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiselect {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\gobi042\\Selenium042\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		d.get("https://www.kogan.com/");
		WebElement q = d.findElement(By.xpath("//input[@id='product-search-field']"));
		q.sendKeys("iphone 7");
		WebElement q2 = d.findElement(By.xpath("(//div[@role='button'])[3]"));
		q2.click();

		WebElement q1 = d.findElement(By.className("search-nav__icon"));
		q1.click();
		
		List<WebElement> g = d.findElements(By.xpath("//a[@itemprop='url']"));
		int size = g.size();
		System.out.println(size);
		for (int i = 3; i <size; i++) {
			WebElement dd = g.get(i);
			dd.click();
			d.navigate().back();
			
		}
	}
}