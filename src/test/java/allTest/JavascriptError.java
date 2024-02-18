package allTest;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.LogEntry;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JavascriptError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			driver.get("https://the-internet.herokuapp.com/javascript_error");

	//CAPTURE all browser related error
		
		Set<String> logtypes=	driver.manage().logs().getAvailableLogTypes();
	
	for(String string:logtypes)
	{
		System.out.println(logtypes);
	}
	
 LogEntries logentries =driver.manage().logs().get(LogType.BROWSER)	;
System.out.println(logentries.getAll());
System.out.println("index 0 error "  +logentries.getAll().get(0));
System.out.println("size "  +logentries.getAll().size());
	
	
	
	
	
	
	
	}

}
