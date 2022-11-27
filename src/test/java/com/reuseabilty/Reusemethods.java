package com.reuseabilty;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reusemethods {
	
		public static WebDriver driver;

		public static void getDriver() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		public static void Url(String url) {
			driver.get(url);
		}
		public static void max() {
			driver.manage().window().maximize();
		}
		public String getText(WebElement element) {
			String text = element.getText();
			return text;
		}
		
		public String getAttribute(WebElement element) {
			String text = element.getAttribute("value");
			return text;
		}
		
		public static String getpropertyFileValvue(String key) throws FileNotFoundException, IOException {
			Properties properties=new Properties();
			properties.load(new FileInputStream("C:\\Users\\sathish kumar .s\\eclipse-workspace\\TestVagrant\\src\\test\\resources\\configure\\config.properties"));
			return(String)properties.get(key);
		}
		public static void loadUrl(String url) {
			driver.get(url);
		}
		public static void maximize() {
			driver.manage().window().maximize();
		}
		public static void getDriver(String browserType) {
			switch (browserType) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
			case "ie":
				driver=new InternetExplorerDriver();
				break;
			case "edge":
				driver=new EdgeDriver();
				break;
				
			default:
				break;
			}
		}
		public File screenShot() {
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File file = screenshot.getScreenshotAs(OutputType.FILE);
			return file;
		}
		public static void quit() {
			driver.quit();
		}
		public void close() {
			driver.close();
		}
		public byte[] getScreenShot() {
			TakesScreenshot screenshot=(TakesScreenshot)driver;
			byte[] b = screenshot.getScreenshotAs(OutputType.BYTES);
			return b;
			
		}

}
