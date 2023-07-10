package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathcase3 {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='username' ]")).sendKeys("sai____4777");
			driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d'and@ name='password' ]")).sendKeys("Sai@7775838175");
			driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}

}
