package org.test;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.base.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pojo.LoginPojo;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.concurrent.TimeUnit;

import jdk.internal.org.jline.utils.Log;

public class LoginClass extends BaseClass {

	
	LoginPojo l;
	
	@BeforeClass
	private void launchingBrowser() {
		browserLaunch();
		//max();
		l = new LoginPojo();
	}
	@AfterClass
	private void endBrowser() {
		quit();
	}
	
	@BeforeMethod
	private void openingEditor() {
		url("https://editor.weaveroo.io/login");
	}
	
	@AfterMethod
	private void closingEditor() {
		System.out.println("Test executed");
		close();
	}
	
	SoftAssert s = new SoftAssert();
	@Parameters({"e1","p1"})
	@Test
	private void tc1(String e1 , String p1) throws InterruptedException {
		System.out.println("Executing Test with Valid Username and Valid Password");
		addText(l.getTxtUser(),e1);
		addText(l.getTxtPassword(),p1);
		
		clk(l.getLoginButton());
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement homeLink = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/header/div/div[1]/div/div/img"));
        Assert.assertTrue(homeLink.isDisplayed(), "Login failed");
 
	}

	
		
	}
