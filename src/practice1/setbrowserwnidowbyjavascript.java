package practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setbrowserwnidowbyjavascript {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\web\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//create Chrome Browser driver
		WebDriver driver = new ChromeDriver();
		String url="https://www.tutorialspoint.com/index.htm";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.resizeTo(1000,800)");
		//js.executeScript("window.resizeTo(450,630);");
		

	}

	

}
