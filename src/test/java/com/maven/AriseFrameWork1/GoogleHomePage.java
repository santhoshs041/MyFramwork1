package com.maven.AriseFrameWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {
	
	public WebDriver driver;
	
	public GoogleHomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	By searchField=By.xpath("//input[@class='gLFyf gsfi']");
//	By searchButton=By.xpath("(//input[@value='Google Search'])[1]");
	By searchButton=By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");
	public WebElement GoogleSearchTextBox() {
		return driver.findElement(searchField);
	}
	public WebElement GoogleSearchButton() {
		return driver.findElement(searchButton);
	}
}
