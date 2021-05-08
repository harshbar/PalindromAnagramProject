package com.xndev.genericRepo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public WebDriver driver;
	public FileLib lib = new FileLib();
	@BeforeClass
	public void configBC() throws IOException
	{
		System.out.println("-----Launch Browser-----");
		
		if(lib.fetchProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", IAutoConstant.CHROME_PATH);
			driver = new ChromeDriver();
		}else if(lib.fetchProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", IAutoConstant.FIREFOX_PATH);
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("------Open URL------");
		driver.get(lib.fetchProperty("url"));
	}
	@AfterClass
	public void configAC()
	{
		System.out.println("-----close Browser-----");
		driver.close();
	}
}
