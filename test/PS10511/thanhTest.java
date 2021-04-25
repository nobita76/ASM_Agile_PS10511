package PS10511;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class thanhTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("12");
		//System.setProperty("webdriver.chrome.driver", "F:\\Kiểm thử\\Nâng cao\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "F:\\Kiểm thử\\Nâng cao\\chromedriver_win32\\chromedriver.exe");

		WebDriver webdriver = new ChromeDriver();
		String url = "https://lms.poly.edu.vn";
		
		webdriver.get(url);
	}

}
