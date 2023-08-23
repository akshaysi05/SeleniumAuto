package ecommApliTest;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddproductEcomm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String veggies[] = {"Cucumber", "Brocolli" ,"Cauliflower"};
		int j=0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
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
				
				if(j==veggies.length) {
					break;
				}

			}
		}
	

	}

}
