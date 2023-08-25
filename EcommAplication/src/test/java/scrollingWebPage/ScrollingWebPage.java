package scrollingWebPage;



import static org.testng.Assert.assertEquals;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingWebPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=  (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);
		//js.executeAsyncScript("document.querySelector('.tableFixHead').scrollTop=5000");
		//Thread.sleep(2000);
		int sum=0;
	List<WebElement> values=	driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
	
	for(int i=0;i<values.size();i++) {
	    sum=sum+Integer.parseInt(values.get(i).getText());   
	}
	System.out.println(sum);
	String text=driver.findElement(By.cssSelector(".totalAmount")).getText();
	String actualAmount=text.split(" Collected:")[1].trim();
	int actualvalues =Integer.parseInt(actualAmount);
	System.out.println(actualAmount);
	assertEquals(actualvalues, sum);

	}
    

	
}
