package org.drpd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Year {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\eclipse-workspace\\Dropdown\\Driver\\chromedriver.exe");
		
		WebDriver l = new ChromeDriver();
		
		l.get("https://www.facebook.com/");
		WebElement yr = l.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		yr.click();
		
		
		
		JavascriptExecutor m =(JavascriptExecutor)l;
		
		Thread.sleep(3000);
		WebElement f = l.findElement(By.xpath("//select[@aria-label='Year']"));
		WebElement mon = l.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[3]"));
		Select s = new Select(mon);
		
		List<WebElement> month = s.getOptions();
		
		for (int i = 0; i <month.size(); i++) {
			WebElement k = month.get(i);
			String months = k.getText();
			System.out.println(months);
		}
	}

}
