package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathcase2 {
public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("panchalsaiprasad050@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Sai@8668245547");
			driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

}
