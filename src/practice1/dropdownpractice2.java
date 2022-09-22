package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownpractice2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\web\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		String baseUrl="http://demo.guru99.com/test/newtours/register.php";
		driver.get(baseUrl);
		
		WebElement dropdown1=driver.findElement(By.xpath("//select[@name='country']"));
		Select obj=new Select(dropdown1);
		obj.selectByVisibleText("AUSTRIA");

	}

}
