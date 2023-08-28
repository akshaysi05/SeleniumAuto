package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement Drops=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s= new Select(Drops);
		s.selectByIndex(2);
	    System.out.println(	s.getFirstSelectedOption().getText());
	    s.selectByVisibleText("USD");
	    System.out.println(	s.getFirstSelectedOption().getText());
	    s.selectByValue("INR");
	    System.out.println(	s.getFirstSelectedOption().getText());
	    driver.close();
		

	}

}
