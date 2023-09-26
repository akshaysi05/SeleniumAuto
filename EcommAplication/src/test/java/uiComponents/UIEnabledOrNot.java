package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIEnabledOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Check ENabled Or Disabled 
		WebElement EnableUI= driver.findElement(By.id("ctl00_mainContent_view_date2"));
		//System.out.println( EnableUI.isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//System.out.println( EnableUI.isEnabled());
		
		//2Methods To Check.
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
			System.out.println("It is Enabled ");
			
		}
		else {
			System.out.println("It is Disabled ");
		}
		

	}

}
//Here EnableUI.isEnabled() Methods Does Not Works Becaues  Ui All Time Already Enabled.
//We Can Check Also UI Enabled or desbled Aslo  Get Attribute And Check After Enabled or Disabled UI properties Changes or not So We Can Check Under If 
//Conditon And Find Enabled Or Disbaled .
