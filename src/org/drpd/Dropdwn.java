package org.drpd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdwn {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\eclipse-workspace\\Dropdown\\Driver\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		
		WebElement bt = d.findElement(By.xpath("(//a[@role='button'])[2]"));
		bt.click();
		
		Thread.sleep(3000);
		WebElement mon = d.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[2]"));
		Select s = new Select(mon);
		
		List<WebElement> month = s.getOptions();
		
		for (int i = 0; i <month.size(); i++) {
			WebElement m = month.get(i);
			String months = m.getText();
			System.out.println(months);
		}
		
		
	}

}
