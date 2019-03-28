package com.comcastnew.genericlib;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.comcastnew.objectrepositorylib.Login;

public class BaseClass {
	public static WebDriver driver;
	public static FileLib Flib=new FileLib();
	@BeforeClass
	public void configBc() throws Throwable{
		String Browsername=Flib.getPropertyKeyValue("browser");
		if (Browsername.equals("frefox")) {
			driver=new FirefoxDriver();
		}
		else if(Browsername.equals("chrome")) {
			driver=new ChromeDriver();
		
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}	
		@BeforeMethod
		public void configBm() throws Throwable{
			String URL=Flib.getPropertyKeyValue("url");
			String USER=Flib.getPropertyKeyValue("username");
			String PASSWORD=Flib.getPropertyKeyValue("password");
			driver.get(URL);
			Login Lp=PageFactory.initElements(driver,Login.class);
			Lp.loginToApp(USER,PASSWORD);
			Thread.sleep(2000);
		}
		
		@AfterMethod
		public void configAm() {
			
			
			
		}
			

		

}

