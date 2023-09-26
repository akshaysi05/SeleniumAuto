package assignmentUdemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);
		// First Scenarios Row Count
		int rowsize = driver.findElements(By.xpath("(//table[@id='product'])[1]//tr")).size();
		System.out.println("Row Size Count: " + rowsize);

		// 2nd Scenarios Col Size Count
		int colsize = driver.findElements(By.xpath("(//table[@id='product']//tr)[4]/td")).size();
		System.out.println("col Size Count: " + colsize);

		// 3rd Scenarios Print 3rd Number Col Text
		List<WebElement> Scenod = driver.findElements(By.xpath("(//table[@id='product']//tr)[4]/td"));
		for (int i = 1; i < colsize; i++) {
			String text = Scenod.get(i).getText();
			System.out.print(text + "   ");

		}
		System.out.println();

	}

}
