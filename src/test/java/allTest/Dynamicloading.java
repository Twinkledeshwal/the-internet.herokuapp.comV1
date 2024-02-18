package allTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamicloading {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	
	
	driver.get("https://the-internet.herokuapp.com/dynamic_loading");
	driver.findElement(By.xpath("//div[@id='content']//a[1]")).click();
	WebElement start1=	driver.findElement(By.xpath("//div[@id='start']//button"));
	start1.click();
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(100));
			
			wait.until(ExpectedConditions.invisibilityOf(start1));
			Thread.sleep(5000);
			System.out.println(driver.findElement(By.xpath("//div[@id='finish']")).getText());	
			

	}

}
