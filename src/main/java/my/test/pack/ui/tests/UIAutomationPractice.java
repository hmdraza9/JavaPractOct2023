package my.test.pack.ui.tests;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UIAutomationPractice {

	public static void mainUIAutomationPractice() throws IOException {

		CalendarDateSelect.selectDateFromCalendar();
	}

}

class CalendarDateSelect {

	private static final Logger log = LogManager.getLogger(UIAutomationPractice.class);
	private static WebDriver driver;
	private static JavascriptExecutor js;
	private static String monthYearLabel;

	private static String dateSelect = "02-08-2024";

	static int implicitWaitSeconds = 6;

	private static int daySelect; // 21-01-2024 -> 21

	private static int monthSelect;

	private static int yearSelect;

	private static String currentMonthDayXpath = "//div[text()='$monthYearLabel']/ancestor::div[@class='DayPicker-Month']//*[contains(@class,'DayPicker-Day') and not(contains(@class,'disabled')) and not(contains(@class,'outside'))]";

	private static String dateInputXpath = "//div[contains(@class,'flt_fsw_inputBox dates')]/label[@for='departure']";

	private static String calendarLabelXpath = "//div[@class='DayPicker-Caption']/div[text()='$monthYearLabel']";

	private static String nextMonthXpath = "//span[@role='button' and @aria-label='Next Month']";

	private static final String url = "https://www.makemytrip.com/";

	public static void selectDateFromCalendar() throws IOException {

		js = (JavascriptExecutor) driver;

		log.info(Thread.currentThread().getStackTrace()[1].getMethodName());

		try {
			uiSeleniumStart();
			uiSeleniumScript();
			uiSeleniumQuit();
		} catch (Exception ex) {
			ex.printStackTrace();
			log.info("Exception occurred");
			ts(driver);
			driver.quit();
		}

	}

	private static void uiSeleniumStart() {
		log.info(Thread.currentThread().getStackTrace()[1].getMethodName());

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWaitSeconds));
		log.info("implicitlyWait set to " + implicitWaitSeconds);

	}

	private static void uiSeleniumScript() throws InterruptedException, IOException {
		js = (JavascriptExecutor) driver;
		log.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		log.info("Loading url: " + url);
		driver.get(url);
		Thread.sleep(5000);

		js.executeScript("alert('Date to select is " + dateSelect + "')");
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();

		WebElement dateInput = driver.findElement(By.xpath(dateInputXpath));
		tsPartial(driver, dateInput);
		dateInput.click();
		js.executeScript("arguments[0].scrollIntoView();", dateInput);
		Actions action = new Actions(driver);
		action.click(dateInput).build().perform();

		String monthYearSelect = dateSelect.substring(3, 10); // 31-02-2023 --> 02-2023
		log.info("monthYearSelect set to " + monthYearSelect);

		goToSelectMonth(driver, monthYearSelect);

		ts(driver);
		List<WebElement> mDaysWeb = driver
				.findElements(By.xpath(currentMonthDayXpath.replace("$monthYearLabel", monthYearLabel)));

		for (WebElement dayEl : mDaysWeb) {
			String temp = dayEl.getText().split("\n")[0];
			tsPartial(driver, dayEl);
			if (temp.equalsIgnoreCase(String.valueOf(daySelect))) {
				js.executeScript("arguments[0].style.border='3px solid red'", dayEl);
				Thread.sleep(1333);
				ts(driver);
				dayEl.click();
				ts(driver);
				break;
			}
		}
	}

	private static void goToSelectMonth(WebDriver driver, String monthYearSelect) throws InterruptedException {

		List<String> monthList = new ArrayList<>();
		monthList.add(0, "Jan_January");
		monthList.add(1, "Feb_February");
		monthList.add(2, "Mar_March");
		monthList.add(3, "Apr_April");
		monthList.add(4, "May_May");
		monthList.add(5, "Jun_June");
		monthList.add(6, "Jul_July");
		monthList.add(7, "Aug_August");
		monthList.add(8, "Sep_September");
		monthList.add(9, "Oct_October");
		monthList.add(10, "Nov_November");
		monthList.add(11, "Dec_December");
		daySelect = Integer.parseInt(dateSelect.substring(0, 2));
		log.info("daySelect set to " + daySelect);
		monthSelect = Integer.parseInt(monthYearSelect.split("-")[0]);
		log.info("monthSelect set to " + monthSelect);
		yearSelect = Integer.parseInt(monthYearSelect.split("-")[1]);
		log.info("yearSelect set to " + yearSelect);

		monthYearLabel = monthList.get(monthSelect - 1).split("_")[1] + " " + yearSelect;
		log.info("monthYearLabel set to " + monthYearLabel);

		boolean isCalFound = false;

		while (!isCalFound) {
			isCalFound = driver.findElements(By.xpath(calendarLabelXpath.replace("$monthYearLabel", monthYearLabel)))
					.size() > 0;
			log.info("isCalFound set to " + isCalFound);
			driver.findElement(By.xpath(nextMonthXpath)).click();
		}

	}

	public static void ts(WebDriver driver) throws IOException {

		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String temp = "screenshot//scr_" + getTime() + ".png";
		FileUtils.copyFile(scr, new File(temp));

		log.info("Screenshot taken at: " + temp);

	}

	public static void tsPartial(WebDriver driver, WebElement element) throws IOException {

		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		BufferedImage bi = ImageIO.read(scr);
		// location of web element
		Point location = element.getLocation();

		// dimension of web element
		int w = element.getSize().getWidth();
		int h = element.getSize().getHeight();

		// crop image
		BufferedImage cImage = bi.getSubimage(location.getX(), location.getY(), w, h);
		ImageIO.write(cImage, "jpg", scr);

		String temp = "screenshot//scr_part_" + getTime() + ".jpg";

		FileUtils.copyFile(scr, new File(temp));

		log.info("Screenshot taken at: " + temp);

	}

	private static void uiSeleniumQuit() throws IOException {
		log.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		driver.quit();

	}

	public static String getTime() {

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss-SSS");
		return sdf.format(cal.getTime());

	}
}