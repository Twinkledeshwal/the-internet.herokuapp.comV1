package allTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusCode {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	
	driver.get("https://the-internet.herokuapp.com/status_codes");
driver.findElement(By.linkText("200")).click();
 String   text=driver.findElement(By.xpath("//div[@class='example']//p")).getText();
	
	System.out.println(text);
	
	}

}
