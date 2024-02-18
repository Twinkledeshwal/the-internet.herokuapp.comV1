package allTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragaAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	
	driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		WebElement source = driver.findElement(By.xpath("//div[@id='column-a']"));
		
		WebElement destination = driver.findElement(By.xpath("//div[@id='column-b']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, destination).perform();
		
	}

}
