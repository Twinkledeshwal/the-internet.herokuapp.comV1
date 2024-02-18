package allTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryUImenu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	
	driver.get("https://the-internet.herokuapp.com/jqueryui");
	driver.findElement(By.xpath("//a[normalize-space()='Menu']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//a[@href='#'])[3]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//a[@href='#'])[4]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[normalize-space()='Excel']")).click();
	
	}

}
