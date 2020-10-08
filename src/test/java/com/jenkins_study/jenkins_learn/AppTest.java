package com.jenkins_study.jenkins_learn;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	private WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vigne\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
    /**
     * Rigorous Test :-)
     */
	@Test
    public void shouldAnswerWithTrue()
    {
       driver.navigate().to("www.google.com");
       driver.manage().window().maximize();
       driver.navigate().refresh();
       System.out.println(driver.getCurrentUrl());
       System.out.println(driver.getTitle());
       String searchText = "edureka";
       WebElement searchTextBox = driver.findElement(By.name("q"));
       WebElement searchTextButton = driver.findElement(By.name("btnK"));
       searchTextBox.clear();
       searchTextBox.sendKeys(searchText);
       searchTextButton.click();
       
    }
}
