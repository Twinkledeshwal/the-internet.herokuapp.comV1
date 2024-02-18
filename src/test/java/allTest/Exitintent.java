package allTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exitintent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	
	driver.get("https://the-internet.herokuapp.com/exit_intent");
	Actions act = new Actions(driver);
	Thread.sleep(5000);
	act.moveByOffset(32, 6).perform();
	act.moveByOffset(350, 250).perform();
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20))	;
wait.until(ExpectedConditions.alertIsPresent());

	}

}
