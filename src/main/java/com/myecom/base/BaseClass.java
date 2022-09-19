package com.myecom.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	public static WebDriver driver;
	public static Properties prop;
	static String projectPath = System.getProperty("user.dir");
	
	public void loadApplication()
	{
		String browser=(String)prop.get("browser");
		

		if(browser.equalsIgnoreCase("chrome"))
		{
			String projectpath;
			System.setProperty("webdriver.chrome.driver", projectPath +"//driver//chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", projectPath+"//driver//geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.setProperty("Webdriver.edge.driver",projectPath +" //driver//mmsedgedriver.exe");
			driver=new EdgeDriver();
			
		}
	}
	
	public void readProp() throws IOException 
	{
		String projectpath =System.getProperty("user.dir");
		FileInputStream fis =new FileInputStream(projectpath+"config/config");
		prop=new Properties();
		prop.load(fis);
	    
		
	}
}
