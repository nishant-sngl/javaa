package site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Goi {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//chromedriverLinux");
		d.get("http://www.goibibo.com/");
		d.findElement(By.xpath(".//*[@id='get_sign_in']")).click();
		d.switchTo().frame("authiframe");
		d.findElement(By.xpath(".//*[@id='authMobile']")).sendKeys("9999999999");
		//d.quit();
		//test
		
	}
	
}
