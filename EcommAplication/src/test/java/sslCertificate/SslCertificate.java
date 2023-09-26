package sslCertificate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SslCertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co= new ChromeOptions();
		co.setAcceptInsecureCerts(true);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://expired.badssl.com/");
	System.out.println(	driver.getTitle());

	}

}
