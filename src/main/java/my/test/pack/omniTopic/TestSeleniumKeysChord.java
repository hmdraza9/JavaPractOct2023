package my.test.pack.omniTopic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSeleniumKeysChord {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String keyPressString = Keys.chord(Keys.CONTROL, "a");

		driver.get("https://www.google.com");

		driver.findElement(By.name("q")).sendKeys("Selenium Java");
		Thread.sleep(1111);
		driver.findElement(By.name("q")).sendKeys(keyPressString);
		Thread.sleep(1111);		
		driver.findElement(By.name("q")).sendKeys(Keys.CONTROL,"X");
		Thread.sleep(1111);
		driver.findElement(By.name("q")).sendKeys(Keys.CONTROL,"F");
		Thread.sleep(1111);
		driver.findElement(By.name("q")).sendKeys(Keys.CONTROL,"V");
		Thread.sleep(1111);
	}

}
