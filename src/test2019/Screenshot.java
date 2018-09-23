package test2019;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Driver;
import java.util.List;

import javax.imageio.ImageIO;
import javax.xml.xpath.XPath;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class Screenshot {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		//选取字段	
//		driver.get("https://www.aozora.gr.jp/");
		
/*		WebElement wele1=driver.findElement(By.xpath("/html/body/center/h1"));
		WebElement wele2=driver.findElement(By.xpath("/html/body/center/table[2]/tbody/tr[7]/td[2]"));
		
		Actions act=new Actions(driver);
		act.clickAndHold(wele1).moveToElement(wele2).perform();
		Thread.sleep(2000);
		act.release();*/
		
		//截屏
/*		java.io.File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new java.io.File(".\\screenshot\\screen.png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}*/
		
		//robot截全屏
/*		BufferedImage image=new Robot().createScreenCapture(
				new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())
				);
		try {
			ImageIO.write(image, "png", new java.io.File(".\\screenshot\\screen_robot.png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}*/
		
		//点击下拉子菜单
		driver.get("https://www.lenovo.com/jp/ja");
		driver.findElement(By.xpath("//*[@id=\"countrySelector\"]")).click();
		List<WebElement> lst=driver.findElements(By.xpath("//*[@id=\"countrySelector\"]/option[@*]"));
		for (WebElement webElement : lst) {
			/*if (webElement.getAttribute("innerHTML").equals("Oman")) {
				webElement.click();
				break;
			}*/
			if (webElement.getText().equals("Oman")) {
				webElement.click();
				break;
			}
		}
		Thread.sleep(3000);
		
		
		
		driver.quit();
		
		
		
	}

}
