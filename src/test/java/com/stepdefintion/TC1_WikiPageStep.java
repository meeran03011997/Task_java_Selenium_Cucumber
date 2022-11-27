package com.stepdefintion;

import org.junit.Assert;

import com.pageobjectmanager.PageObjectManger;
import com.reuseabilty.Reusemethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_WikiPageStep extends Reusemethods  {
	PageObjectManger pom = new PageObjectManger();
	

	@Given("User is on Pushpa: The Rise Wiki page")
	public void user_is_on_pushpa_the_rise_wiki_page() {	
	}
	@Then("User should verify the movie {string}")
	public void user_should_verify_the_movie(String successmgs) {
		Assert.assertEquals("hhj", successmgs,getText(pom.getWikiPage().getVerifyMessage()));
		}

	@When("User get the Country Detail")
	public void user_get_the_country_detail() {
		pom.getWikiPage().country();
		
	}
	@Then("User get the Release Date")
	public void user_get_the_release_date() {
		pom.getWikiPage().releaseDate();
	}
	@Then("User should successfully get screenshot of Wiki page")
	public void user_should_successfully_get_screenshot_of_wiki_page() {
	}


	
	

	
	
	
	}








	
	




