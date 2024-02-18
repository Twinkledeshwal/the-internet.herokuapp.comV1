package allTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicContent {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	
	driver.get("https://the-internet.herokuapp.com/dynamic_content");
			
		
		//To get direct descendants with 'row' class of div elements
		List<WebElement> dynamicContent = driver.findElements(By.xpath("(//div[@class='row'])[4]"));
		//To get the text from the 2nd row of dynamic content
		System.out.println(dynamicContent.get(1).findElement(By.cssSelector("div:nth-child(2)")).getText());		
		Thread.sleep(6000);

	}

}
