package PS10511.selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest {
		
		
		@Test
		public void test() {
				System.setProperty("webdriver.chrome.driver", "F:\\Kiểm thử\\Nâng cao\\chromedriver_win32\\chromedriver.exe");

				WebDriver webdriver = new ChromeDriver();
				String url = "https://lms.poly.edu.vn";
				
				webdriver.get(url);
				
			
		}
}
