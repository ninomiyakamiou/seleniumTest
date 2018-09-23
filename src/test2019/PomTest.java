package test2019;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testPom.Pom;

public class PomTest {
	WebDriver driver;
	Pom pom=new Pom();
	@BeforeClass
	public void before() throws Exception{
		driver=pom.setBrowser();
	}
	@Test
	public void cahTest() throws Exception {
		//选取字段
		Pom pom1=PageFactory.initElements(driver, Pom.class);
		pom1.cah(driver);
		//下拉子菜单
		pom1.submenuSelect(driver);
	}
	@AfterClass
	public void qiut() {
		driver.quit();

	}

}
