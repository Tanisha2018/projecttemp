package practice1;

import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinowhandelDemo {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\web\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

//Load the website

//Load the website
driver.get("http://www.naukri.com/");
String parent=driver.getWindowHandle();

Set<String>s=driver.getWindowHandles();
Iterator<String> I1= s.iterator();
while(I1.hasNext())
{

String child_window=I1.next();


if(!parent.equals(child_window))
{
driver.switchTo().window(child_window);

System.out.println(driver.switchTo().window(child_window).getTitle());

driver.close();
}

}
//switch to the parent window
driver.switchTo().window(parent);



	}

}
