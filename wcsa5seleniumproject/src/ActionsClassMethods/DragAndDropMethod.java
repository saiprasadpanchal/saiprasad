package ActionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement src1=driver.findElement(By.xpath("//a[normalize-space(text())='SALES']"));
		WebElement target1=driver.findElement(By.xpath("(//li[contains(normalize-space(@class),'placeholder')])[3]"));
	
		
		WebElement src2=driver.findElement(By.xpath("//a[normalize-space(text())='BANK']"));
		WebElement target2=driver.findElement(By.xpath("(//li[contains(normalize-space(@class),'placeholder')])[1]"));
		
		
		WebElement src3=driver.findElement(By.xpath("(//a[contains(normalize-space(@class),'button button-orange')])[2]"));
		WebElement target3=driver.findElement(By.xpath("(//li[contains(normalize-space(@class),'placeholder')])[4]"));
	
		
		WebElement src4=driver.findElement(By.xpath("(//a[contains(normalize-space(@class),'button button-orange')])[4]"));
		WebElement target4=driver.findElement(By.xpath("(//li[contains(normalize-space(@class),'placeholder')])[2]"));
	
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(src1, target1).perform();
		Thread.sleep(3000);
		act.dragAndDrop(src2, target2).perform();
		Thread.sleep(3000);
		act.dragAndDrop(src3, target3).perform();
		Thread.sleep(3000);
		act.dragAndDrop(src4, target4).perform();
		Thread.sleep(3000);
	
		
		if(driver.findElement(By.xpath("//a[text()='Perfect!']")).isDisplayed())
		{
			System.out.println("drag and drop done!!");
			driver.close();
		}
		else
		{
			System.out.println("exception");
		}
	
	}
}
