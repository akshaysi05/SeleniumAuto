package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetHeigthAndWidht {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement name=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		name.sendKeys("Akshay Singh");
		int h=name.getRect().getDimension().getHeight();
		int w=name.getRect().getDimension().getWidth();
		System.out.println("Hieght: "+h);
		System.out.println("Widht : "+w);

	}

}
