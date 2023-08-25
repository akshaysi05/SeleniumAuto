package syncronization;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SyncronizationTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String veggies[] = { "Cucumber", "Brocolli", "Cauliflower" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		addItem(driver, veggies);
		//Cart Click 
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println( driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
		
		
		

	}

	public static void addItem(WebDriver driver, String veggies[]) {
		int j = 0;
		List<WebElement> ProdName = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < ProdName.size(); i++) {
			String name = ProdName.get(i).getText().split(" ")[0].trim();

			// Check weather name you expect is present in Array or not
			// Convert Array Into Array List for Easy Search

			List VeggiesList = Arrays.asList(veggies);

			if (VeggiesList.contains(name)) {
				j++;
				// Add To CartAfter Matching ProductName

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == veggies.length) {
					break;
				}

			}
		}
	}

}
