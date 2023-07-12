package org.mts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.compress.compressors.FileNameUtil;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	
	public static WebDriver driver;
	
	
	public static void chromeLaunch() {
		driver = new ChromeDriver();
	}
	
	public static void getUrl(String Url) {
		driver.get(Url);
	}
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public static void sendkeys(WebElement element, String data ) {
		element.sendKeys(data);
	}
	
	public static void sendkeysEnter(WebElement element, String data ) {
		element.sendKeys(data,Keys.ENTER);
	}
	
	public static void clickButton(WebElement element) {
		element.click();
	}
	
	public void clickOkInAlert() {
		driver.switchTo().alert().accept();
	}
	
	public void clickCancelInAlert() {
		driver.switchTo().alert().dismiss();
	}
	
	public String getText(WebElement element) {
		String text = element.getText();
	    return text;
	}
	
	public String getAttribute(WebElement element, String name) {
		String attribute = element.getAttribute(name);
		return attribute;
	}
	
	public void closeAllWindow() {
		driver.quit();
	}
	
	public void closeCurrentWindow() {
		driver.close();
	}
	
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
	    return currentUrl;
	}
	
	public void selectOptionByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void selectOptionByAttribute(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public void selectOptionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);		
	}
	
	public void elementSendKeysByJs(WebElement element, String data ) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','"+data+"')",element);
	}
	
	public void clickButtonByJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", element);
	}
	
	public void switchToChildWindow(WebElement element) {
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		for(String eachWindow : allWindow ) {
			if(! parentWindow.equals(allWindow)) {
				driver.switchTo().window(eachWindow);
				System.out.println(eachWindow);
			}
		}
	}
	
	public void switchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}
	
	public void switchToFrameById(String id) {
		driver.switchTo().frame(id);
	}
	
	public void switchToFrameByName(String name) {
		driver.switchTo().frame(name);
	}
	
	public WebElement findLocatorById(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}
	
	public WebElement findLocatorByName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}
		
	public WebElement findLocatorByClassName(String attributeValue) {
		WebElement element = driver.findElement(By.className(attributeValue));
		return element;
	}
	
	public static WebElement findLocatorByXpath(String xpathExpression) {
		WebElement element = driver.findElement(By.xpath(xpathExpression));
		return element;
	}
	
	public static List<WebElement> findElementsByXpath(String xpathExpression) {
		List<WebElement> element = driver.findElements(By.xpath(xpathExpression));
		return element;
	}
	
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void robotKeyPress(int args) throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(args);		
	}
	
	public void robotKeyRelease(int arg0) throws AWTException {
		Robot robot = new Robot();
		robot.keyRelease(arg0);		
	}
	
	//excel
	public static String readValueFromExcel(String sheetname, int rownum, int cellnum ) throws IOException {
		
		String result = null;
		File file = new File("C:\\Users\\Karthikraja\\eclipse-workspace\\FrameworkGreens\\excel\\framework.xlsx");
		FileInputStream fileinputstream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileinputstream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType cellType = cell.getCellType();
		
		switch (cellType) {
		case STRING:
			
			result = cell.getStringCellValue();
						
			break;

		case NUMERIC:
			if(DateUtil.isCellDateFormatted(cell)) {
				java.util.Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateformat = new SimpleDateFormat("dd/MMMM/yyy");
				result = dateformat.format(dateCellValue);
				
			}
			else {
				double numericCellValue = cell.getNumericCellValue();
				long round = Math.round(numericCellValue);
				if (numericCellValue == round) {
					result = String.valueOf(round);
				}
				else {
					result = String.valueOf(numericCellValue);
				}	
			}
			break;
		default:
			break;
		}
	 return result;
	}
	
	//write in excel
	public void writeValueFromExcel(String sheetname, int rownum, int cellnum, String Data ) throws IOException {
		File file = new File("C:\\Users\\Karthikraja\\eclipse-workspace\\FrameworkGreens\\excel\\framewoek.xlsx");
		FileInputStream fileinputstream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileinputstream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		cell.setCellValue(Data);
		FileOutputStream fileoutputstream = new FileOutputStream(file);
		workbook.write(fileoutputstream);

	}
	
	//update data in excel
	public void updateValueFromExcel(String sheetname, int rownum, int cellnum,  String oldData, String newData ) throws IOException {
		File file = new File("C:\\Users\\Karthikraja\\eclipse-workspace\\FrameworkGreens\\excel\\framewoek.xlsx");
		FileInputStream fileinputstream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileinputstream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
	    String value = cell.getStringCellValue();
	    if(value.equals(oldData)) {
	    	cell.setCellValue(newData);
	    }
		FileOutputStream fileoutputstream = new FileOutputStream(file);
		workbook.write(fileoutputstream);
	}

	public void screenshot(String name) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Karthikraja\\eclipse-workspace\\FrameworkGreens\\screenshot"+name+".png");
		FileUtils.copyFile(source, destination);
	}
	
}