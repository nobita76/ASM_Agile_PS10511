package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public void verifyHomepageTitle() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Kiểm thử\\Nâng cao\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		String url = "http://lms.poly.edu.vn/";
		String title_website = "Hệ thống quản lý trị học tập Fpt Polytechnic";
		String title_expected = "";
		driver.get(url);
		
		title_expected = driver.getTitle();
		if(title_expected.contentEquals(title_website)) {
			System.out.println("test pass");
		}else {
			System.out.println("test fail");
		}
		
		driver.close();
	}
}
