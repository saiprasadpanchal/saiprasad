package ActionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {
	public static void main(String[] args) {
		//use to perform mouseHover action
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		driver.findElement(By.xpath("(//span[contains(normalize-space(@class),'caret hs')])[8]")).click();
		
		WebElement targetcoins = driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-1gms,m']"));
		Actions act =new Actions(driver);
		
		act.moveToElement(targetcoins).perform();
		
		driver.close();
	
	}
}
