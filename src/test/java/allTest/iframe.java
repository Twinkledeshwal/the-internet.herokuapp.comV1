package allTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	
	driver.get("https://the-internet.herokuapp.com/iframe");
	driver.switchTo().frame("mce_0_ifr");
	WebElement iframetextbox = driver.findElement(By.xpath("//body//p"));
	
	Thread.sleep(3000);
	iframetextbox.clear();
	iframetextbox.sendKeys("i am writing a new text into the text area inside the frame");
	
	}
	

}
