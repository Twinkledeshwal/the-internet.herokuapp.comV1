package allTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hovers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	
	driver.get("https://the-internet.herokuapp.com/hovers");
	Actions act =new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"))).perform();
	Thread.sleep(3000);
	act.moveToElement(driver.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"))).perform();
	Thread.sleep(3000);
act.moveToElement(driver.findElement(By.xpath("(//img[@alt='User Avatar'])[3]"))).perform();
	

	
	
	}

}
