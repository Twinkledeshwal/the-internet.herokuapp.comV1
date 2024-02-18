package allTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NotificationMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	
	driver.get("https://the-internet.herokuapp.com/notification_message_rendered");

driver.findElement(By.linkText("Click here")).click();
String message= driver.findElement(By.xpath("//div[@id='flash']")).getText();

	System.out.println(message);
	
		
	
	}

}
