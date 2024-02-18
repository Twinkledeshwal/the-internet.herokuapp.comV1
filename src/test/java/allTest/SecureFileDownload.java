package allTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecureFileDownload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	
	driver.get("https://admin:admin@the-internet.herokuapp.com/download_secure");
	driver.get("https://the-internet.herokuapp.com/download_secure");
	Thread.sleep(4000);
	driver.findElement(By.linkText("LambdaTest.txt")).click();
}
}