package allTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicControl {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
	
	driver.get("https://the-internet.herokuapp.com/dynamic_controls");
	WebElement removebuttonselector= driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));		
WebElement checkboxselector= driver.findElement(By.xpath("//div[@id='checkbox']"));
WebElement inputselector= driver.findElement(By.xpath("//input[@type='text']"));

WebElement enbleinputbtnselector= driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
	
System.out.println("is the checkbox displayed: "+checkboxselector.isDisplayed());
WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(100));


	
removebuttonselector.click();

Thread.sleep(5000);
	
	try {
		checkboxselector.isDisplayed();
		Thread.sleep(5000);
	} catch (Exception e) {
		System.out.println("the checkbox was removed");
		Thread.sleep(5000);
	}

	System.out.println("is the input enabled: "+inputselector.isEnabled());
	Thread.sleep(5000);
	enbleinputbtnselector.click();
	Thread.sleep(5000);
	System.out.println("is the input enabled: "+inputselector.isEnabled());
	
	
	
	
	
	
	
	
	
	
	}

}
