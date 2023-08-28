package links;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinkCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Count Link
		int linkCount=driver.findElements(By.tagName("a")).size();
		System.out.println(linkCount);
		
		//Print Link\
		for(int i=1;i<linkCount;i++) {
			System.out.println( driver.findElements(By.tagName("a")).get(i).getText());
		}
		WebElement footerLink=driver.findElement(By.id("gf-BIG"));
	 System.out.println(footerLink.findElements(By.tagName("a")).size());
	 
	 WebElement collinks= footerLink.findElement(By.xpath("//div[@id='gf-BIG']//tbody/tr/td[1]/ul"));
	 System.out.println(collinks.findElements(By.tagName("a")).size());
	 for(int i=1;i<collinks.findElements(By.tagName("a")).size();i++) {
		 String clickonbutton=Keys.chord(Keys.CONTROL,Keys.ENTER);
		 collinks.findElements(By.tagName("a")).get(i).sendKeys(clickonbutton);
		Set<String>Windows= driver.getWindowHandles();
		Iterator<String> it=Windows.iterator();
		while(it.hasNext()) {
			driver.switchTo().window( it.next());
			System.out.println(driver.getTitle());
		}
	 }
		
		
		
		

	}

}
