package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EndToEndTestingFliJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Select From And To Destination
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='CCU']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
		Thread.sleep(3000);
		//Select Current Date 
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		//Select Check Box
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_SeniorCitizenDiv']")).click();
		Thread.sleep(3000);
		
		//Check Ui Enabled Or Disabled
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
			System.out.println("It is Enabled ");
			
		}
		else {
			System.out.println("It is Disabled ");
		}
		//Select 5 Passenger
		driver.findElement(By.id("divpaxinfo")).click();
		 Thread.sleep(2000);
		 for(int i=1;i<=4;i++) {
		 driver.findElement(By.id("hrefIncAdt")).click();
		 }
		 driver.findElement(By.id("btnclosepaxoption")).click();
		 //Click On Search Button
		 driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		 driver.close();

	}

}
