package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ajio {
  @Test
  public void ajio() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.ajio.com/");
//	  Assert.fail();
  }
}
