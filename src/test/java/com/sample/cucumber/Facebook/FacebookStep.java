package com.sample.cucumber.Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookStep {
	WebDriver driver;
	/*@Given("^User is in facebook loginpage$")
	public void user_is_in_facebook_loginpage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Computer\\Desktop\\prabakar\\GreenTechnology\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@When("^User enters username and password and User click login button$")
	public void user_enters_username_and_password_and_User_click_login_button() throws Throwable {
	     
	}

	@Then("^User check the name equals to Prabakaran$")
	public void user_check_the_name_equals_to_Prabakaran() throws Throwable {
	     
	}
	*/
	
	@Given("^User is in facebook loginpage$")
	public void user_is_in_facebook_loginpage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Computer\\Desktop\\prabakar\\GreenTechnology\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@When("^User enters username and password and User click login button$")
	public void user_enters_username_and_password_and_User_click_login_button() throws Throwable {
	     System.out.println("action");
	}

	@Then("^User check the name equals to Prabakaran$")
	public void user_check_the_name_equals_to_Prabakaran() throws Throwable {
	    System.out.println("verfication");
	}
}
