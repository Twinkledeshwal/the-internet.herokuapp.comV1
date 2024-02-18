package allTest;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicAuth {
	@Test
	public void test() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth/");
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		String pageMessage = driver.findElement(By.cssSelector("p")).getText();
		assertEquals(pageMessage, "Congratulations!");
	}

}
