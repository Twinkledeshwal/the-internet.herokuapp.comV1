package allTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class KeyPresses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			driver.get("https://the-internet.herokuapp.com/key_presses");
			
			Actions act = new Actions(driver);
			act.sendKeys(Keys.ENTER).perform();
			String text = driver.findElement(By.id("result")).getText();
			System.out.println(text);
			Assert.assertEquals(text, "You entered: ENTER");
			
			
	}
	
	

}
