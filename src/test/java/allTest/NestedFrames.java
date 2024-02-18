package allTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	
	driver.get("https://the-internet.herokuapp.com/nested_frames");
	List<WebElement> f =driver.findElements(By.tagName("frame"));
	System.out.println("total frames: "+""+f.size());
	driver.switchTo().frame(1);
	String bottomframe=driver.findElement(By.tagName("body")).getText();
	System.out.println(bottomframe);
	driver.switchTo().parentFrame();
	driver.switchTo().frame("frame-top");
	driver.switchTo().frame("frame-left");
	String leftframe=driver.findElement(By.tagName("body")).getText();
	System.out.println(leftframe);
	driver.switchTo().defaultContent();
	}

}
