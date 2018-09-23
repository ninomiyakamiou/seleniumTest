package test2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg {
	WebDriver driver;
	@Test
	public void openlenovo() {
		driver.get("https://www.baidu.com/");
		WebElement inputbox = driver.findElement(By.id("kw"));
		inputbox.sendKeys("a");
	}
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	

}
