package iframeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		//Switch WebPage to Iframe
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		
		//Drag And Drop test Here
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target= driver.findElement(By.id("droppable"));
		Actions a= new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		
		//After Switch Frame We Want to Go Back To The Normal Window We Do 
		driver.switchTo().defaultContent();

	}

}
