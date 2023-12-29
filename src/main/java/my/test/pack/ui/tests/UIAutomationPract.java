package my.test.pack.ui.tests;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.List;

public class UIAutomationPract {

    private static final Logger log = LogManager.getLogger(UIAutomationPract.class);

    public static WebDriver driver;
    static JavascriptExecutor js;

    public static final String url = "https://www.makemytrip.com/";

    public static void main(String[] args){
         js = (JavascriptExecutor)driver;

        log.info(Thread.currentThread().getStackTrace()[1].getMethodName());

        try{
            uiSeleniumStart();
            uiSeleniumScript();
            uiSeleniumQuit();
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.info("Exception occurred");
            driver.quit();
        }

    }

    public static void uiSeleniumStart(){
        log.info(Thread.currentThread().getStackTrace()[1].getMethodName());

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds( 20));

    }

    public static void uiSeleniumScript() throws InterruptedException, IOException {
        js = (JavascriptExecutor)driver;
        log.info(Thread.currentThread().getStackTrace()[1].getMethodName());
        log.info("Loading url: "+url);
        driver.get(url);
        Thread.sleep(5000);
        WebElement dateInput = driver.findElement(By.xpath("//div[contains(@class,'flt_fsw_inputBox dates')]/label[@for='departure']"));
        dateInput.click();
        js.executeScript("arguments[0].scrollIntoView();", dateInput);
        Actions action = new Actions(driver);
        action.click(dateInput).build().perform();


        String nextMonthXpath = "//span[@aria-label='Next Month']";

        WebElement nextMonth = driver.findElement(By.xpath(nextMonthXpath));
        action.click(nextMonth);
        ts(driver);
        List<WebElement> mDaysWeb = driver.findElements(By.xpath("//span[contains(@class,'flatpickr-day') and not (contains(@class,'disabled'))]"));
        log.info("Days found: "+mDaysWeb.size());

        for(WebElement dayEl: mDaysWeb){
            if(dayEl.getAttribute("textContent").equalsIgnoreCase("22")){
                Thread.sleep(2000);
                log.info("Element found, text: "+dayEl.getAttribute("textContent"));
                js.executeScript("arguments[0].style.border='3px solid red'", dayEl);
                Actions action2 = new Actions(driver);
                action2.moveToElement(dayEl).click().build().perform();
                Thread.sleep(2000);
                ts(driver);
                break;
            }

        }




    }

    public static void ts(WebDriver driver) throws IOException {

        File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scr, new File("screenshot//scr_"+getTime()+".png"));

    }

    public static void uiSeleniumQuit(){
        log.info(Thread.currentThread().getStackTrace()[1].getMethodName());

        driver.quit();

    }
    public static String getTime() {

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss-SSS");
        return sdf.format(cal.getTime());
    }


}
