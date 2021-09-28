package com.maven.AriseFrameWork1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Base {

	public WebDriver driver;
	public Properties properties;
	@Test
	public WebDriver BrowserCall() throws IOException {
		properties=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\00002803\\eclipse\\training\\AriseFrameWork1\\Data.properties");
		properties.load(fis);
		String vBrowser=properties.getProperty("Browser");
		if(vBrowser.equalsIgnoreCase("chrome")){
			System.out.println("Chrome Browser is set");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\00002803\\eclipse\\chrome_driver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(vBrowser.equalsIgnoreCase("Edge")){
			System.out.println("Edge Browser is set");
			System.setProperty("webdriver.edge.driver", "C:\\Users\\00002803\\eclipse\\edge_driver\\msedgedriver.exe");
			driver= new EdgeDriver();
			driver.manage().window().maximize();
		}
		else {
			System.out.println("Invalid Browser");
		}
		return driver;
	}
	
}