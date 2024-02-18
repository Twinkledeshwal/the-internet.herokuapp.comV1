package allTest;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class BrokenImages {
	public static void VerifyBrokenImagesUsingSelenium() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Broken Images')]")).click();
		

		Thread.sleep(5000);

		List<WebElement> images = driver.findElements(By.cssSelector("div.example img"));
		System.out.println(images.size());

		for (WebElement image : images) {
			String imageSrc = image.getAttribute("src");

			try {
				URL url = new URL(imageSrc);
				URLConnection urlConnection = url.openConnection();
				HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
				httpURLConnection.setConnectTimeout(5000);
				httpURLConnection.connect();

				if(httpURLConnection.getResponseCode() == 200)
					System.out.println(imageSrc + " >> " + httpURLConnection.getResponseCode() + " >> " +httpURLConnection.getResponseMessage());
				else
					System.err.println(imageSrc + " >> " + httpURLConnection.getResponseCode() + " >> " +httpURLConnection.getResponseMessage());

				httpURLConnection.disconnect();
			} catch (Exception e) {
				System.err.println(imageSrc);
			}
		}
		
	}

}
