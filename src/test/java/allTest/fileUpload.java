package allTest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class fileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement choosefile  =     driver.findElement(By.xpath("//input[@id='file-upload']"));
		Actions act= new Actions(driver);
		act.click(choosefile).perform();
		
		Runtime.getRuntime().exec("./autoit/upload1.exe");
		Thread.sleep(2000);
		WebElement upload	=	driver.findElement(By.xpath("//input[@id='file-submit']"));
	
	Actions act1= new Actions(driver);
		act1.click(upload).perform();
		
		
		
	}

}
