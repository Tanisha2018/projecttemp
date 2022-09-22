package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chckbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\web\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		String baseURl="https://demo.guru99.com/test/radio.html";
		driver.get(baseURl);
		WebElement chkboxexist =driver.findElement(By.id("vfb-6-0"));
		
		for(int i=0;i<2;i++)
		{
			chkboxexist.click();
			System.out.println(chkboxexist.isSelected());
		}

	}
	
	

}
