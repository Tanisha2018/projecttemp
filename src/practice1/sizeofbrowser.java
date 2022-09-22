package practice1;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sizeofbrowser {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\web\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//create Chrome Browser driver
		WebDriver driver = new ChromeDriver();
		String url="https://www.tutorialspoint.com/index.htm";
		driver.get(url);
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println(driver.manage().window().getSize());
		

		Dimension dm = new Dimension(450,630);
	      //Setting the current window to that dimension
	     // driver.manage().window().setSize(new Dimension(1024,768));
	      driver.close();


	      driver.close();
		

	}

}
