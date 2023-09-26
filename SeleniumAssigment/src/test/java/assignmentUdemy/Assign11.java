package assignmentUdemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
       //Select Check Box 
        WebElement Locat=driver.findElement(By.id("checkBoxOption2"));
        Locat.click();
        // Get Level Data Of Selected Check Box
       String Level= Locat.getAttribute("value");
       System.out.println(Level);
       
       //Select DropDown
      WebElement Drops= driver.findElement(By.id("dropdown-class-example"));
      Select drop= new  Select(Drops);
      drop.selectByValue(Level);
      
      //Enter Grab Text In Name Text Box
      driver.findElement(By.id("name")).sendKeys(Level);
      driver.findElement(By.id("alertbtn")).click();
     String AlertText= driver.switchTo().alert().getText();
     System.out.println(AlertText);
     if(AlertText.contains(Level)) {
    	 System.out.println("Alter Message Success");
     }
     else {
    	 System.out.println("Something wrong with execution ");
     }
    		  
        
	}

}