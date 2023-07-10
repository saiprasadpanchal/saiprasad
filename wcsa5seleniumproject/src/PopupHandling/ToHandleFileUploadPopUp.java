package PopupHandling;

import java.io.IOException;
import java.lang.annotation.Target;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopUp {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(5000);
		
		
		WebElement target=driver.findElement(By.xpath("//*[@id='uploadfile']"));
		Actions act =new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(target).perform();
		
		Runtime.getRuntime().exec("./AutoitPrograms");
		
		
		
		
	}
}
