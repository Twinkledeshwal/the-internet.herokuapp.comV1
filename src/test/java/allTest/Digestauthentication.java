package allTest;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Digestauthentication {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		((HasAuthentication)driver).register(UsernameAndPassword.of("admin", "admin"));
driver.get("https://the-internet.herokuapp.com/digest_auth");
Thread.sleep(3000);

	}

}
