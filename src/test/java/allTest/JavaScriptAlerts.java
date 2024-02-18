package allTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			
			WebElement alert= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
			alert.click();
			
		
		driver.switchTo().alert().accept();
	Thread.sleep(5000);
	
	WebElement alert2= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
	alert2.click();
	

driver.switchTo().alert().accept();
Thread.sleep(5000);
	
WebElement alert3= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
alert3.click();


driver.switchTo().alert().sendKeys("data provided in javascript popup");
Thread.sleep(5000);

driver.switchTo().alert().accept();




	
	
	
	
	
	
	
	
	
	
	}

}
