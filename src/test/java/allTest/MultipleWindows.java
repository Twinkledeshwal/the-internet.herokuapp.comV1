package allTest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	
	driver.get("https://the-internet.herokuapp.com/windows");

	System.out.println(driver.getWindowHandle());
	
	driver.findElement(By.linkText("Click Here")).click();
	
	driver.findElement(By.linkText("Elemental Selenium")).click();
	
	Set<String> windows=driver.getWindowHandles();
	for(String w:windows) {
		driver.switchTo().window(w);
		System.out.println(driver.getTitle());
	}
	}

}
