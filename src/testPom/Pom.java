package testPom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import test2019.MyNotexitExp;

public class Pom {
	WebDriver driver;
	//选择浏览器元素设置
	String browser="chrome";
	String URL1="https://www.aozora.gr.jp/";
	//选取字段元素设置
	@FindBy(xpath="/html/body/center/h1")
	WebElement ele_from;
	@FindBy(xpath="/html/body/center/table[2]/tbody/tr[5]/td[2]/table/tbody/tr[5]/td[8]/a")
	WebElement ele_to;
	//下拉子菜单元素设置
	String URL2="https://www.lenovo.com/jp/ja";
	String submenuClick="Oman";
	@FindBy(xpath="//*[@id=\"countrySelector\"]")
	WebElement menu;
	@FindBy(xpath="//*[@id=\"countrySelector\"]/option[@*]")
	List<WebElement> submenu;
	//自动补全元素设置
	String URL3="https://www.baidu.com/";
	@FindBy(id="kw")
	WebElement inputbox;
	
	
	
	
	
	//选择浏览器方法
	public WebDriver setBrowser() throws Exception{
		if(browser.equals("chrome") ){
			System.getProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
			driver.get(URL1);
			Thread.sleep(2000);
			return driver;
		}else {
			throw new MyNotexitExp("浏览器driver不存在！");
		}
	}
	//选取字段方法
	public void cah(WebDriver driver) throws Exception{
		Actions act=new Actions(driver);
		act.clickAndHold(ele_from).moveToElement(ele_to).perform();
		Thread.sleep(2000);
		act.release();
	}
	//下拉子菜单方法
	public void submenuSelect(WebDriver driver) throws Exception{
		if(!URL2.equals(null)) {
			driver.navigate().to(URL2);
		}
		menu.click();
		for (WebElement webElement : submenu) {
			if(webElement.getText().equals(submenuClick)) {
				webElement.click();
				break;
			}
		}
		Thread.sleep(2000);
	}
	

}
