package practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\web\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/link.html");
		driver.findElement(By.linkText("click here")).click();
		Thread.sleep(5000);
		//driver.findElement(By.linkText("click here")).click();
		
		
	      List<WebElement> links = driver.findElements(By.tagName("a"));
	      System.out.println("The number of links is " + links.size());

	}

}
