package assignmentUdemy;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		Thread.sleep(3000);
		List<WebElement> Country = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		for (WebElement option : Country) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
		Thread.sleep(2000);
		String FillName = driver.findElement(By.id("autocomplete")).getAttribute("value");
		System.out.println(FillName);
		assertEquals(FillName, "India");
		driver.close();

	}

}
