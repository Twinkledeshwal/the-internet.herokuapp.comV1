package allTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataTables {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/tables");
		List<WebElement> headers= driver.findElements(By.xpath("//table[@id='table1']//thead"));
	
	for(WebElement el:headers) {
		System.out.println(el.getText());
		
		
		List<WebElement> rows= driver.findElements(By.xpath("//table//tbody//tr"));
		
		for(WebElement row:rows) {
		List<WebElement> cols=row.findElements(By.tagName("td"));
		for(WebElement celldata:cols) {
			System.out.println(celldata.getText());
			if(celldata.getText().equals("Tim")) {
				System.out.println("test case passed");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	}

}}
