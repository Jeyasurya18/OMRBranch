package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author JeyaSurya
 * @Date 22-03-2023
 * @see Used to maintains the reusable methods
 *
 */
public class BaseClass {
	/**
	 * 
	 * @return String
	 * @see To maintain the project path
	 */

	public static String getProjectPath() {
		String path = System.getProperty("user.dir");
		return path;

	}

	/**
	 * 
	 * @return byte[]
	 * @see Used for take screenshots for the project
	 */
	public byte[] screenshot() {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		byte[] b = screenshot.getScreenshotAs(OutputType.BYTES);
		return b;

	}

	/**
	 * 
	 * @param key
	 * @return String
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @see To maintain the propertyfile values
	 */
	public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream(getProjectPath() + "\\Config\\Config.properties"));
		Object object = properties.get(key);
		String value = (String) object;
		return value;
	}

	/**
	 * 
	 * @param key
	 * @param value
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @see Used to get the orderId
	 */
	public void setPropertyFileValue(String key, String value) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream(getProjectPath() + "\\Config\\Config.properties"));
		properties.setProperty(key, value);

		FileOutputStream outPut = new FileOutputStream(getProjectPath() + "\\Config\\Config.properties");
		properties.store(outPut, "");
		outPut.close();

	}

	/**
	 * 
	 * @param key
	 * @see Used to remove orderId
	 */
	public void deleteDataPropertyFileValue(String key) {
		Properties properties = new Properties();
		properties.remove(key);

	}

	public static WebDriver driver;

	/**
	 * 
	 * @param browserType
	 * @see Used to maintain the all browsers which is required to run
	 */
	public static void getDriver(String browserType) {
		switch (browserType) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			break;
		}

	}

	/**
	 * 
	 * @param url
	 * @see To maintain resusable method for get the url
	 */

	public static void enterAppUrl(String url) {
		driver.get(url);
	}

	/**
	 * @see To maintain resusable method for maximise the window
	 */

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	/**
	 * 
	 * @param element
	 * @param data
	 * @see To maintain resusable method for passing datas
	 */

	public void elementSendkeys(WebElement element, String data) {
		element.sendKeys(data);
	}

	/**
	 * 
	 * @param element
	 * @param data
	 * @see To maintain resusable method for pass datas with ENTER key
	 */

	public void elementSendkeysEnter(WebElement element, String data) {
		element.sendKeys(data, Keys.ENTER);
	}

	/**
	 * 
	 * @param element
	 * @see To maintain resusable method for click option
	 */

	public void elementClick(WebElement element) {
		visibilityOfElement(element);
		element.click();
	}

	/**
	 * @see Used to handle Stale element reference exception
	 */

	public void sleep() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @return String
	 * @see To maintain resusable method for get the App title
	 */

	public String getAppTitle() {
		String title = driver.getTitle();
		return title;
	}

	/**
	 * 
	 * @param attributeValue
	 * @return WebElement
	 * @see To maintain resusable method for to find the element using locator(id)
	 */

	public WebElement findElementById(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
	}

	/**
	 * 
	 * @param attributeValue
	 * @return WebElement
	 * @see To maintain resusable method for to find the element using locator(name)
	 * 
	 */

	public WebElement findElementByName(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
	}

	/**
	 * 
	 * @param attributeValue
	 * @return WebElement
	 * @see To maintain resusable method for to find the element using
	 *      locator(classname)
	 */

	public WebElement findElementByClassName(String attributeValue) {
		WebElement element = driver.findElement(By.className(attributeValue));
		return element;
	}

	/**
	 * 
	 * @param xpathExp
	 * @return WebElement
	 * @see To maintain resusable method for to find the element using
	 *      locator(xpath)
	 */

	public WebElement findElementByXpath(String xpathExp) {
		WebElement element = driver.findElement(By.xpath(xpathExp));
		return element;
	}

	/**
	 * 
	 * @return String
	 * @see To maintain resusable method for get the current url
	 */

	public String getTheCurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	/**
	 * 
	 * @param element
	 * @return String
	 * @see To maintain resusable method for get the text
	 */

	public String getTheText(WebElement element) {
		String text = element.getText();
		return text;
	}

	/**
	 * 
	 * @param element
	 * @param attributeName
	 * @return String
	 * @see To maintain resusable method for get the attribute value
	 */

	public String getTheAttributeValue(WebElement element, String attributeName) {
		String attribute = element.getAttribute(attributeName);
		return attribute;
	}

	/**
	 * 
	 * @param element
	 * @return String
	 * @see To maintain resusable method for get the value
	 */

	public String getTheAttributeValue(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	/**
	 * 
	 * @param element
	 * @param text
	 * @see To maintain resusable method for Dropdown
	 */

	public void selectOptionByText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	/**
	 * 
	 * @param element
	 * @param attributevalue
	 * @see To maintain resusable method for Dropdown
	 */

	public void selectOptionByValue(WebElement element, String attributevalue) {
		Select s = new Select(element);
		s.selectByValue(attributevalue);
	}

	/**
	 * 
	 * @param element
	 * @param index
	 * @see To maintain resusable method for Dropdown
	 */

	public void selectOptionByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	/**
	 * 
	 * @param element
	 * @param text
	 * @see To maintain resusable method for get the value using Js
	 */

	public void elementSendkeysJs(WebElement element, String text) {
		JavascriptExecutor e = (JavascriptExecutor) driver;
		e.executeScript("arguments[0].setAttribute('value','" + text + "')", element);
	}

	/**
	 * 
	 * @param element
	 * @see To maintain resusable method for click option using Js
	 */

	public void elementClickJs(WebElement element) {
		JavascriptExecutor e = (JavascriptExecutor) driver;
		e.executeScript("arguments[0].click()", element);
	}

	/**
	 * @see To maintain resusable method for accpet the alert
	 */

	public void clickOkInAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	/**
	 * @see To maintain resusable method for dismiss the alert
	 */

	public void clickCancelInAlert() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	/**
	 * @see To maintain resusable method for close the all window
	 */

	public static void closeAllWindow() {
		driver.quit();
	}

	/**
	 * @see To maintain resusable method for close the current window
	 */

	public static void closeCurrentWindow() {
		driver.close();
	}

	/**
	 * 
	 * @param childwin
	 * @see To maintain resusable method for switch to childwindow
	 */

	public void switchToChildWindow(String childwin) {
		driver.switchTo().window(childwin);
	}

	/**
	 * 
	 * @param index
	 * @see To maintain resusable method for switch to frame using index
	 */

	public void switchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * @see Used to switch the frame into default frame
	 */
	public void switchToFrameDefaultcontent() {
		driver.switchTo().defaultContent();
	}

	/**
	 * 
	 * @param id
	 * @see To maintain resusable method for switch to frame using id
	 */

	public void switchToFrameById(int id) {
		driver.switchTo().frame(id);
	}

	/**
	 * 
	 * @param element
	 * @return String
	 * @see To maintain resusable method for get the first selected option
	 */

	public String getTheFirstSelectedOption(WebElement element) {
		Select s = new Select(element);
		WebElement ele = s.getFirstSelectedOption();
		String text = ele.getText();
		return text;
	}

	/**
	 * 
	 * @param element
	 * @return boolean
	 * @see To maintain resusable method for check options in dropdown
	 */

	public boolean getTheMultiselectedOption(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
	}

	/**
	 * 
	 * @param sec
	 * @see To maintain resusable method for handle the exception(No such
	 *      element,element interupted)
	 */

	public void implicitWait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	/**
	 * 
	 * @param sec
	 * @param value
	 * @return boolean
	 * @see To maintain resusable method for handle the exception(No such
	 *      element,element interupted)
	 */

	public boolean explicitWait(long sec, String value) {
		WebDriverWait w = new WebDriverWait(driver, sec);
		Boolean until = w.until(ExpectedConditions.invisibilityOfElementLocated(By.id(value)));
		return until;
	}

	public void visibilityOfElement(WebElement element) {

		WebDriverWait driverWait = new WebDriverWait(driver, 30);
		driverWait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * 
	 * @param sec
	 * @param sec1
	 * @see To maintain resusable method for handle the exception(No such
	 *      element,element interupted)
	 * 
	 */

	public void fluentWait(long sec, long sec1) {
		Wait w = new FluentWait(driver).withTimeout(Duration.ofSeconds(sec)).pollingEvery(Duration.ofSeconds(sec1))
				.ignoring(Throwable.class);

	}

	/**
	 * 
	 * @param element
	 * @param index
	 * @see To maintain resusable method for Dropdown(deselect)
	 * 
	 */

	public void deselectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.deselectByIndex(index);
	}

	/**
	 * 
	 * @param element
	 * @param value
	 * @see To maintain resusable method for Dropdown(deselect)
	 * 
	 */

	public void deselectByAttribute(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByValue(value);
	}

	/**
	 * @see To maintain resusable method for Dropdown(deselect)
	 */

	public void deselectByText(WebElement element, String text) {
		Select s = new Select(element);
		s.deselectByVisibleText(text);
	}

	/**
	 * 
	 * @param element
	 * @see To maintain resusable method for Dropdown(deselect)
	 */

	public void deselectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}

	/**
	 * 
	 * @return String
	 * @see To maintain resusable method for windows handling(get parentwindow)
	 * 
	 */

	public String getTheParentWindow() {
		String handle = driver.getWindowHandle();
		return handle;
	}

	/**
	 * 
	 * @return Set<String>
	 * @see To maintain resusable method for windows handling(get allwindow)
	 */

	public Set<String> getTheAllWindow() {
		Set<String> handles = driver.getWindowHandles();
		return handles;
	}

	/**
	 * @see To maintain resusable method for screenshot
	 */

	public void takeScreenshot() {
		TakesScreenshot ts = (TakesScreenshot) driver;
	}

	/**
	 * 
	 * @param element
	 * @see To maintain resusable method for take screenshot for element
	 */

	public void takeScreenshotForElement(WebElement element) {
		element.getScreenshotAs(OutputType.FILE);
	}

	/**
	 * 
	 * @param source
	 * @param target
	 * @see To maintain resusable method for ActionClass(dragAndDrop)
	 */

	public void dragAndDrop(WebElement source, WebElement target) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target).perform();
		;
	}

	/**
	 * 
	 * @param element
	 * @see To maintain resusable method for ActionClass(rightClick)
	 */

	public void rightClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick().perform();
	}

	/**
	 * 
	 * @param element
	 * @see To maintain resusable method for ActionClass(doubleClick)
	 */

	public void doubleClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.doubleClick();
	}

	/**
	 * 
	 * @param element
	 * @see To maintain resusable method for ActionClass(mouseOver)
	 */

	public void mouseOverOptionForSingleOption(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element);
	}

	/**
	 * 
	 * @param element
	 * @return List<WebElement>
	 * @see To maintain resusable method for dropdown(get all option as text)
	 */

	public List<WebElement> getTheAllOptionFromDropdownAsText(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getAllSelectedOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement ele = options.get(i);
			String text = ele.getText();
		}
		return options;
	}

	/**
	 * 
	 * @param element
	 * @param value
	 * @return List<WebElement>
	 * @see To maintain resusable method for dropdown(get all option as attribute)
	 */

	public List<WebElement> getTheAllOptionFromDropdownAsAttribute(WebElement element, String value) {
		Select s = new Select(element);
		List<WebElement> options = s.getAllSelectedOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement ele = options.get(i);
			String attribute = ele.getAttribute(value);
		}
		return options;
	}

}
