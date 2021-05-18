package com.cucumberbdd.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Stepdefination {

	WebDriver driver;

	@Given("User open Chrome Browser")
	public void user_open_chrome_browser() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}


	@Given("User open the url {string}")
	public void user_open_the_url(String applicationurl) {
		driver.get(applicationurl);
	}

	@When("user is on landing page")
	public void user_is_on_landing_page() {
		WebElement AppLog = driver.findElement(By.xpath("//img[@class=\"logo img-responsive\"]"));
		Assert.assertEquals(true, AppLog.isDisplayed());

	}

	@Then("Title of the page is {string}")
	public void title_of_the_page_is(String appTitle) {

		Assert.assertEquals(driver.getTitle(), appTitle);

	}
	
	@Then("Browser get close")
	public void browser_get_close() {
	    driver.close();
	}
	
	@Given("User open firefox Browser")
	public void user_open_firefox_browser() {
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
   
	}


}
