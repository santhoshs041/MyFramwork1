package com.maven.AriseFrameWork1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class GoogleTC extends Base {
	@Test
	public void TS001() throws IOException, InterruptedException {
		driver=BrowserCall();
		driver.get(properties.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		GoogleHomePage home=new GoogleHomePage(driver);
		home.GoogleSearchTextBox().sendKeys(properties.getProperty("Search"));
		home.GoogleSearchButton().click();
		Thread.sleep(2000);
		
		GoogleResultPage gResult=new GoogleResultPage(driver);
		System.out.println("Search Result is "+gResult.ResultStat().getAttribute("value"));
		
		GoogleSearchPage result=new GoogleSearchPage(driver);
		result.GoogleSearchResult(properties.getProperty("Search"));
			
	}

@AfterTest
	public void close() {
		driver.close();
	}
}