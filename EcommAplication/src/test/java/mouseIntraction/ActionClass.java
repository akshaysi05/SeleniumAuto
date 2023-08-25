package mouseIntraction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//Create Actions Class Object 
	   Actions a= new Actions(driver);
	   //Enter Text In Text Box With Upper Case
	   WebElement TextBox= driver.findElement(By.id("twotabsearchtextbox"));
	   a.moveToElement(TextBox).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
	   
	   //DoubleClick Action
	   a.moveToElement(TextBox).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	   
	   //Move the Mouse to the Specific Element
	   WebElement move=driver.findElement(By.cssSelector("#nav-link-accountList"));
	   a.moveToElement(move).build().perform();
	   
	   //RightClick of Specific Element
	   a.moveToElement(move).contextClick().build().perform();
	   
	   
	  
	   

	}

}
