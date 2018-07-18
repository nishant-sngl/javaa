package site;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Whatfix_Nishant {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://whatfix.com/quickolabs.com/#!flows/how-to-import-google-analytics-solution-of-whatfix/8174f470-9df9-11e3-8178-386077c653fe/";
		
		WebDriver driver = new FirefoxDriver();
		System.out.println("firefox driver object created");
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		System.out.println("explicit wait object created");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("implicit wait object created");
		
		driver.get(url);
		System.out.println("navigated to URL");
		
		driver.manage().window().maximize();
		System.out.println("window maximised");
		
		driver.findElement(By.xpath("//*[@id='_widget_wfx_']//a[text()='Self Help']")).click();
		System.out.println("clicked on SELF HELP");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='Get Started with Whatfix']"));				
		driver.switchTo().frame(frame);
		System.out.println("switching to frame");
		
		driver.findElement(By.xpath("//*[@target='_self' and @flexrow='0']")).click();
		System.out.println("clicked on 1st text option");

		driver.switchTo().defaultContent();
		System.out.println("coming back to main window");
		
		driver.findElement(By.id("wfx-dashboard-content-embed")).click();
		System.out.println("click on Embed");
		
		driver.findElement(By.id("wfx-dashboard-content-embed-slideshow")).click();
		System.out.println("click on slideshow");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@data-wfx-attr='wfx-tooltip-popover']//*[@id='wfx-tooltip-next']"))));
		driver.findElement(By.xpath("//*[@data-wfx-attr='wfx-tooltip-popover']//*[@id='wfx-tooltip-next']")).click();
		System.out.println("clicked on NEXT");
		
		System.out.println("CLOSING");
		driver.quit();
	}
}
