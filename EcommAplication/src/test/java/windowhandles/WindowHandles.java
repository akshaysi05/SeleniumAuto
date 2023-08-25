package windowhandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		//How to Switch Parent window/tab to child window.
		//This Methods To Get All The Windows id To Invoked at the same time.
		Set<String> windowIds=driver.getWindowHandles(); // OutPut Like:[parent Id , Child Id]
		Iterator<String> it= windowIds.iterator();
		String ParentId=it.next();
		String ChildId=it.next();
		driver.switchTo().window(ChildId);
		String Email=driver.findElement(By.cssSelector(".im-para.red")).getText();
		String EmailId=Email.split("at")[1].split("with")[0];
		String emailid=EmailId.trim();
		System.out.println(emailid);
		driver.switchTo().window(ParentId);
		driver.findElement(By.id("username")).sendKeys(emailid);
		

	}

}
