package allTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	
	driver.get("https://the-internet.herokuapp.com/login");
WebElement username= driver.findElement(By.xpath("//input[@id='username']"));
username.isDisplayed();
username.isEnabled();
username.sendKeys("tomsmith");
WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
password.isDisplayed();
password.isEnabled();
password.sendKeys("SuperSecretPassword!");
WebElement loginbutton= driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
loginbutton.isDisplayed();
loginbutton.isEnabled();
loginbutton.click();

WebElement securearea= driver.findElement(By.xpath(""));
String actualvalue=securearea.getText();
String expectedvalue= "Secure Area";
if(actualvalue==expectedvalue)
{
	System.out.println("test case passed");
}
else 
	System.out.println("test case failed");




	}

}
