package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class image {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\web\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		String baseUrl="https://demo.guru99.com/test/radio.html";
		driver.get(baseUrl);
		driver.findElement(By.xpath("//img[@src='https://demo.guru99.com/images/java-logo.png']")).click();

	}

}
