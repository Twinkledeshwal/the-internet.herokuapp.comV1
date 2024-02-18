package allTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxes {
	@Test
	public void test()  {	

		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/");
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Checkboxes')]")).click();
		List<WebElement> checkboxElements = driver.findElements(By.cssSelector("#checkboxes input[type='checkbox']"));
		//To select the checkbox which is not selected
		System.out.println("no of checkboxes are : "+checkboxElements.size());
		for(WebElement checkbox:checkboxElements) {
			System.out.println("is this selected : "+checkbox.isSelected());
			if(!checkbox.isSelected()) {
				checkbox.click();
			}
		}		
	}
}
