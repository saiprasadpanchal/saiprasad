package Dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiselectDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://bhulekh.mahabhumi.gov.in/");
		Thread.sleep(4000);
		WebElement multiSelectDD =driver.findElement(By.id("list"));
		Select sel= new Select (multiSelectDD);
		sel.selectByIndex(2);
		
		sel.selectByVisibleText("Aurangabad");
		
		
		
		
		
		
		
		
		
	}

}
