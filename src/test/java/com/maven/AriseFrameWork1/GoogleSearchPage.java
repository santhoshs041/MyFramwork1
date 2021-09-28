package com.maven.AriseFrameWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

	public WebDriver driver;

	public GoogleSearchPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By searchResult=By.xpath("//input[@class='gLFyf gsfi']");
	
	public String GoogleSearchResult(String result) {
		String searchRes= driver.findElement(searchResult).getAttribute("value");
		
		if (searchRes.equals(result)) {
			System.out.println("Same value - PASS");
		}
		else {
			System.out.println("Wrong value!!!!!!!! - FAIL");
		}
		return searchRes;
	}
}