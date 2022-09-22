package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\web\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //driver.findElement(By.id("travelOptions")).click();
		
    //driver.findElement(By.xpath("//label[text()='Round Trip']")).click();
    driver.get("https://demo.guru99.com/test/radio.html");
    Thread.sleep(5000);
   WebElement radio1= driver.findElement(By.id("vfb-7-1"));
   WebElement radio2=driver.findElement(By.id("vfb-7-2"));
   radio1.click();
   radio2.click();
	}

}
