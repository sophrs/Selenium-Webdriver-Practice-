package com.soph.SelenWebdriverPrac;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AppTest {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();

	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	@Test
	public void method() {
//			database account add
//		driver.get("https://www.thedemosite.co.uk");
//		driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]")).click();
//		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input")).sendKeys("soph");
//		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input")).sendKeys("pass");
//		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input")).click();
//		driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")).click();
//		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input")).sendKeys("soph");
//		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input")).sendKeys("pass");
//		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input")).click();
		
		
		// clothes shopping website
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("dress");
		driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")).click();
		WebElement element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1"));
		assertEquals("Printed Summer Dress", element.getText());
		
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
	}
}
