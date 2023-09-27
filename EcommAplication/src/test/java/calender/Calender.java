package calender;

<<<<<<< HEAD

=======
>>>>>>> f27a5e7c0d7986b6d004b9cb060ff9dd6de1c0d2
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		JavascriptExecutor js=  (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		Thread.sleep(2000);
		String months=driver.findElement(By.xpath("//div[@class='flatpickr-current-month']")).getText();
		System.out.println(months);

<<<<<<< HEAD
		
		
		
=======
>>>>>>> f27a5e7c0d7986b6d004b9cb060ff9dd6de1c0d2
	}

}
