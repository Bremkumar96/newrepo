package org.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void max() {
		driver.manage().window().maximize();
	}

	public static void url(String link) {
		driver.get(link);
	}
	
	public static void addText(WebElement ele , String text){
		ele.sendKeys(text);
	}
	
	public static void clk(WebElement ele){
		ele.click();
	}
	
	public static String title() {
		String tit = driver.getTitle();	
		return tit;
	}
	
	public static String getText(WebElement ele) {
		String x = ele.getText();
		return x;
	}
	
	public static void close() {
		driver.close();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void fluWait(WebElement w) {
	    FluentWait<WebDriver> wait = new FluentWait<>(driver)
	            .withTimeout(Duration.ofSeconds(10))
	            .pollingEvery(Duration.ofMillis(5));

	    wait.until(ExpectedConditions.visibilityOf(w));
	}

}
