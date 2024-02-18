package allTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveElements {
	@Test
	public void test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/add_remove_elements/']")).click();
		validateAddElements(5, driver);
		validateRemoveElements(5, driver);
	}

	public void validateAddElements(int noOfClicks, WebDriver driver) {
		WebElement addElementBtn = driver.findElement(By.xpath("//button[contains(text(),'Add Element')]"));
		for (int i = 0; i < noOfClicks; i++) {
			addElementBtn.click();
		}
		List<WebElement> elements = driver.findElements(By.xpath("//div[@id='elements']/button"));
		Assert.assertEquals(noOfClicks, elements.size());
		System.out.println(elements.size());
	}

	public void validateRemoveElements(int noOfClicks, WebDriver driver) throws InterruptedException {

		List<WebElement> removeElementBtns = driver.findElements(By.cssSelector("button.added-manually"));
		for (int i = 0; i < removeElementBtns.size(); i++) {
			removeElementBtns.get(i).click();
			Thread.sleep(2000);
		}
	}
}
