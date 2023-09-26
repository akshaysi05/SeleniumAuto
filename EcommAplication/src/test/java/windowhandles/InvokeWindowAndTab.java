package windowhandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeWindowAndTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//Switch New Tab In Same Window
		driver.switchTo().newWindow(WindowType.TAB);
		//Switch New Window 
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		//Get All Id In Opened tab 
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String ParentWindowId=it.next();
		String ChildWinowId=it.next();
		
		//Switch Mouse Hovor one Tab to OntherTab
		driver.switchTo().window(ChildWinowId);
		driver.get("https://rahulshettyacademy.com/");
		String CourseName=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
				.get(1).getText();
		driver.switchTo().window(ParentWindowId);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(CourseName);
		driver.quit();
		
		
		
		

	}

}
