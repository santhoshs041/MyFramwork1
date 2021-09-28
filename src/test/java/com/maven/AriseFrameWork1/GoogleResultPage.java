package com.maven.AriseFrameWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleResultPage {
	WebDriver driver;

	public GoogleResultPage(WebDriver driver) 
	{
		super();
		this.driver = driver;
	}
	
	
	By Result=By.xpath("//input[@class='gLFyf gsfi']");
	
	
	public WebElement ResultStat()
	{
		return driver.findElement(Result);
	}
}
