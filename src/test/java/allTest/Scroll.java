package allTest;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	
	driver.get("https://the-internet.herokuapp.com/infinite_scroll");
JavascriptExecutor js= (JavascriptExecutor)driver;
Thread.sleep(5000);
js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//Thread.sleep(5000);
//js.executeScript("window.scrollBy(0,1000)")	;
	
	}

}
