package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaAlertHandeled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Accept Java Alert   and print the text also
		driver.findElement(By.id("name")).sendKeys("Akshay singh");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		//Switch to driver to alter so Web Can Perfom Google Alert and accept.
	     System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//2nd Kind of Window Alter
		driver.findElement(By.id("name")).sendKeys("Akshay singh");
		driver.findElement(By.id("confirmbtn")).click();
		//Thread.sleep(2000);
		//cancle the alert
	     System.out.println(	driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	

	}

}
