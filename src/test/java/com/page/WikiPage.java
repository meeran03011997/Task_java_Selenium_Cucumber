package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reuseabilty.Reusemethods;

public class WikiPage extends Reusemethods{
	
	public WikiPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[@id='firstHeading']/i[contains(text(),'Pushpa: The Rise')]")
	private WebElement verifyMessage;
	
	@FindBy(xpath = "//li[contains(text(),'December')]")
	private WebElement releasdate;
	
	@FindBy(xpath = "//td[contains(text(),'India')]")
	private WebElement country;

	public WebElement getVerifyMessage() {
		return verifyMessage;
	}

	public WebElement getReleasdate() {
		return releasdate;
	}

	public WebElement getCountry() {
		return country;
	}
	public void country() {
		String text = getText(getCountry());
		System.out.println(text);

	}
	public void releaseDate() {
		String text = getText(getReleasdate());
		System.out.println(text);
	}
	
	
	
	
	
	

}
