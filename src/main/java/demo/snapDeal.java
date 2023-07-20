package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapDeal {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.snapdeal.com");
		
		Thread.sleep(2000);
		driver.close();
	}

}
