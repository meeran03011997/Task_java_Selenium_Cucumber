package com.stepdefintion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.reuseabilty.Reusemethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass  extends Reusemethods{
	@Before
	public void beforeSenario() throws FileNotFoundException, IOException {
		getDriver(getpropertyFileValvue("browser"));
		loadUrl(getpropertyFileValvue("url"));
		maximize();
	}
	@After
	public  void afterSenario() throws IOException  {
		File file = new File("C:\\Users\\sathish kumar .s\\eclipse-workspace\\TestVagrant1\\src\\test\\resources\\ScreenShot\\wiki.png");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, file);
		close();
		quit();
	}
}
