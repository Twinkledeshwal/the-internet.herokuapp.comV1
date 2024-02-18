package allTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Inputs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	
	driver.get("https://the-internet.herokuapp.com/inputs");
	WebElement num=driver.findElement(By.xpath("//input[@type='number']"));
	num.sendKeys("21112022");
	
	Thread.sleep(4000);
	Actions act = new Actions(driver);
	act.moveByOffset(900, 145).clickAndHold().perform();
	
	}

}
