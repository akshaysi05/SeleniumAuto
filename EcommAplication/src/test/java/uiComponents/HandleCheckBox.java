package uiComponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(	driver.findElement(By.xpath("//*[@id='ctl00_mainContent_SeniorCitizenDiv']")).isSelected());
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_SeniorCitizenDiv']")).click();
		Thread.sleep(1000);
	    System.out.println(	driver.findElement(By.xpath("//*[@id='ctl00_mainContent_SeniorCitizenDiv']")).isSelected());
		//size of checkbox
		
		List<WebElement> sizeCheckbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(sizeCheckbox.size());

	}

}
