package com.seleniumprojects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static WebElement elementId, elementName, elementXp;
	public static Alert s;
	public static Select d;
	public static Set<String> windowHandles;

	public static WebDriver getBrowser(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", ".\\Driver\\msedgedriver.exe");
				driver = new EdgeDriver();

			} else if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();

			} else if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
				;

			} else if (browsername.equalsIgnoreCase("opera")) {
				System.setProperty("webdriver.opera.driver", ".\\Driver\\operadriver.exe");
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

	public static void minimize() {
		try {
			driver.manage().window().minimize();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void getUrl(String url) {
		try {
			driver.get(url);
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

	public static void sendKey(String value, String keys) {
		try {
			if (value.equalsIgnoreCase("id")) {

				elementId.sendKeys(keys);

			} else if (value.equalsIgnoreCase("name")) {

				elementName.sendKeys(keys);

			} else if (value.equalsIgnoreCase("xpath")) {

				elementXp.sendKeys(keys);

			} else {
				System.out.println("Invalid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickButton(String value) {

		try {
			if (value.equalsIgnoreCase("name")) {

				elementName.click();

			} else if (value.equalsIgnoreCase("id")) {

				elementId.click();

			} else if (value.equalsIgnoreCase("xpath")) {

				elementXp.click();
			} else {
				System.out.println("Invalid");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void screenShot(String location) throws IOException {

		TakesScreenshot hi = (TakesScreenshot) driver;
		File screenshotAs = hi.getScreenshotAs(OutputType.FILE);
		File file = new File(location);
		FileUtils.copyFile(screenshotAs, file);

	}

	public static void alerts(String value) {

		try {
			s = driver.switchTo().alert();
			if (value.equalsIgnoreCase("accept")) {
				s.accept();
			} else if (value.equalsIgnoreCase("dismiss")) {
				s.dismiss();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void dropDown(String value, String txt, String keys) {
		try {
			if (value.equalsIgnoreCase("id")) {
				d = new Select(elementId);
				if (txt.equalsIgnoreCase("value")) {
					d.selectByValue(keys);

				} else if (txt.equalsIgnoreCase("visibletext")) {
					d.selectByVisibleText(keys);

				} else if (txt.equalsIgnoreCase("index")) {
					int parseInt = Integer.parseInt(keys);
					d.selectByIndex(parseInt);
				}

			} else if (value.equalsIgnoreCase("name")) {
				Select d = new Select(elementName);
				if (txt.equalsIgnoreCase("value")) {
					d.selectByValue(keys);

				} else if (txt.equalsIgnoreCase("visibletext")) {
					d.selectByVisibleText(keys);

				} else if (txt.equalsIgnoreCase("index")) {
					int parseInt = Integer.parseInt(keys);
					d.selectByIndex(parseInt);
				}

			} else if (value.equalsIgnoreCase("xpath")) {
				Select d = new Select(elementXp);
				if (txt.equalsIgnoreCase("value")) {
					d.selectByValue(keys);

				} else if (txt.equalsIgnoreCase("visibletext")) {
					d.selectByVisibleText(keys);

				} else if (txt.equalsIgnoreCase("index")) {
					int parseInt = Integer.parseInt(keys);
					d.selectByIndex(parseInt);
				}

			} else {
				System.out.println("Invalid");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void navigateTo(String url) {
		try {

			driver.navigate().to(url);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void navigateBack() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void navigateReferesh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void navigateForward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void getUrl() {
		try {
			String currentUrl = driver.getCurrentUrl();
			System.out.println("My current URL is " + currentUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void getTitle() {
		try {
			String currentTitle = driver.getTitle();
			System.out.println("My current Title is " + currentTitle);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void getText(String value) {
		try {
			if (value.equalsIgnoreCase("id")) {
				String text = elementId.getText();
				System.out.println(text);

			} else if (value.equalsIgnoreCase("name")) {
				String text = elementName.getText();
				System.out.println(text);

			} else if (value.equalsIgnoreCase("xpath")) {
				String text = elementXp.getText();
				System.out.println(text);

			} else {
				System.out.println("Invalid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getAtribute(String value) {
		try {
			if (value.equalsIgnoreCase("id")) {
				String text = elementId.getAttribute("type");
				System.out.println(text);

			} else if (value.equalsIgnoreCase("name")) {
				String text = elementName.getAttribute("type");
				System.out.println(text);

			} else if (value.equalsIgnoreCase("xpath")) {
				String text = elementXp.getAttribute("type");
				System.out.println(text);

			} else {
				System.out.println("Invalid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void close() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void quit() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void scrollUpDown(String value) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			if (value.equalsIgnoreCase("xpath")) {
				js.executeScript("arguments[0].scrollIntoView();", elementXp);

			} else if (value.equalsIgnoreCase("id")) {
				js.executeScript("arguments[0].scrollIntoView();", elementId);

			} else if (value.equalsIgnoreCase("name")) {
				js.executeScript("arguments[0].scrollIntoView();", elementName);

			} else {
				System.out.println("Invalid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void framess(String value, String keys) {
		try {
			if (value.equalsIgnoreCase("String")) {
				driver.switchTo().frame(keys);

			} else if (value.equalsIgnoreCase("webelement")) {
				driver.switchTo().frame(driver.findElement(By.xpath(keys)));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void switchframe(String option) {
		try {
			if (option.equalsIgnoreCase("default")) {
				driver.switchTo().defaultContent();

			} else if (option.equalsIgnoreCase("parent")) {
				driver.switchTo().parentFrame();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void actionss(String value, String txt) {
		try {
			Actions e = new Actions(driver);
			if (value.equalsIgnoreCase("id")) {
				if (txt.equalsIgnoreCase("move")) {
					e.moveToElement(elementId).build().perform();
					;

				} else if (txt.equalsIgnoreCase("context")) {
					e.contextClick(elementId).build().perform();
					;

				}

			}
			if (value.equalsIgnoreCase("name")) {
				if (txt.equalsIgnoreCase("move")) {
					e.moveToElement(elementName).build().perform();
					;

				} else if (txt.equalsIgnoreCase("context")) {
					e.contextClick(elementName).build().perform();
					;

				}

			}
			if (value.equalsIgnoreCase("xpath")) {
				if (txt.equalsIgnoreCase("move")) {
					e.moveToElement(elementXp).build().perform();
					;

				} else if (txt.equalsIgnoreCase("context")) {
					e.contextClick(elementXp).build().perform();
					;

				} else {
					System.out.println("Invalid");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void roboot(int a) throws AWTException {
		Robot robot = new Robot();
		for (int i = 0; i < a; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void sleeep() throws InterruptedException {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void isEnabledd(String options) {
		try {
			if (options.equalsIgnoreCase("id")) {
				boolean enabled = elementId.isEnabled();
				System.out.println(enabled);

			} else if (options.equalsIgnoreCase("name")) {
				boolean enabled = elementName.isEnabled();
				System.out.println(enabled);

			} else if (options.equalsIgnoreCase("xpath")) {
				boolean enabled = elementXp.isEnabled();
				System.out.println(enabled);

			} else {
				System.out.println("Invalid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void isSelectted(String options) {
		try {
			if (options.equalsIgnoreCase("id")) {
				boolean selected = elementId.isSelected();
				System.out.println(selected);

			} else if (options.equalsIgnoreCase("name")) {
				boolean selected = elementName.isSelected();
				System.out.println(selected);

			} else if (options.equalsIgnoreCase("xpath")) {
				boolean selected = elementXp.isSelected();
				System.out.println(selected);

			} else {
				System.out.println("Invalid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void isDisplayyed(String options) {
		try {
			if (options.equalsIgnoreCase("id")) {
				boolean displayed = elementId.isDisplayed();
				System.out.println(displayed);

			} else if (options.equalsIgnoreCase("name")) {
				boolean displayed = elementName.isDisplayed();
				System.out.println(displayed);

			} else if (options.equalsIgnoreCase("xpath")) {
				boolean displayed = elementXp.isDisplayed();
				System.out.println(displayed);

			} else {
				System.out.println("Invalid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static Set<String> windowsHandlee() {
		try {
			windowHandles = driver.getWindowHandles();
			for (String allTab : windowHandles) {
				String title = driver.switchTo().window(allTab).getTitle();
				System.out.println(title);

			}
			return windowHandles;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return windowHandles;
	}
	
	
}
