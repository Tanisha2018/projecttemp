package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsdemo {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\web\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//create Chrome Browser driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();

	}

}
