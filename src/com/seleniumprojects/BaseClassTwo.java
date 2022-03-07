package com.seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClassTwo {
	public static WebDriver driver;
	
	public static WebElement elementId, elementName, elementXp;
	
	public static WebDriver getBrowser(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", ".\\Driver\\msedgedriver.exe");
				driver = new EdgeDriver();

			} else if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", ".\\\\Driver\\\\geckodriver.exe");
				driver = new FirefoxDriver();

			} else if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", ".\\\\Driver\\\\chromedriver.exe");
				driver = new ChromeDriver();
				;

			} else if (browsername.equalsIgnoreCase("opera")) {
				System.setProperty("webdriver.opera.driver", ".\\\\Driver\\\\operadriver.exe");
				driver = new OperaDriver();

			} else {
				System.out.println("Invalid Browser");
			}
			driver.manage().window().maximize();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return driver;

	}
	   public static  void directClick(WebElement element) {
		element.click();
         
	}
	
	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static  void sendKeyssss(WebElement element, String keys) {
		try {
  			element.sendKeys(keys);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void dropDown(WebElement element, String txt, String keys) {
		
		try {
			Select d = new Select(element);
			if (txt.equalsIgnoreCase("value")) {
				d.selectByValue(keys);

			} else if (txt.equalsIgnoreCase("visibletext")) {
				d.selectByVisibleText(keys);

			} else if (txt.equalsIgnoreCase("index")) {
				int parseInt = Integer.parseInt(keys);
				d.selectByIndex(parseInt);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		

	
	}
	
	public static void scrollUpDown(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void findElement(String value, String txt) {
		try {
			if (value.equalsIgnoreCase("id")) {

				elementId = driver.findElement(By.id(txt));

			} else if (value.equalsIgnoreCase("name")) {

				elementName = driver.findElement(By.name(txt));

			} else if (value.equalsIgnoreCase("xpath")) {

				elementXp = driver.findElement(By.xpath(txt));

			} else {
				System.out.println("Invalid");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	
	
}

