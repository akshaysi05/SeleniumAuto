package windowhandles;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrokenLinks {

	public static  void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		
	
		for(WebElement link:links) {
			String url= link.getAttribute("href");
			
			HttpURLConnection conn=  (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responsecode= conn.getResponseCode();
			System.out.println(responsecode);
			if(responsecode>400) {
				System.out.println("The Link With text : "+link.getText()+": is broken with code :"+ responsecode);
				Assert.assertTrue(false);
			}

			
		}
	

	}

}
