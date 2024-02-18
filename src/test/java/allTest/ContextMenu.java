package allTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ContextMenu {
	@Test
	public void test()  {	

		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/context_menu']")).click();
		
		WebElement contextBox = driver.findElement(By.xpath("//div[@id='hot-spot']"));
		Actions actions = new Actions(driver);
		
		actions.contextClick(contextBox).perform();
		driver.switchTo().alert().accept();
		
		
}
}