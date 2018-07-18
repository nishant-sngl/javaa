package site;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EdgeTest_Nishant {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://edgetest.teamwork.com/#/dashboard/welcome";
		String id = "automation@edgenetworks.in";
		String pswd = "test1234";
		
		System.setProperty("webdriver.chrome.driver", "/home/nishant/git/javaa/chromedriverLinux");
		driver = new ChromeDriver();
		System.out.println("firefox driver object created");
		
		WebDriverWait wait = new WebDriverWait(driver, 100);
		System.out.println("explicit wait object created");
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("implicit wait object created");
		
		driver.get(url);
		System.out.println("navigated to URL");
		
		driver.manage().window().maximize();
		System.out.println("window maximised");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("nameoremail"))));
		driver.findElement(By.id("nameoremail")).sendKeys(id);
		driver.findElement(By.id("passwordfield")).sendKeys(pswd);
		driver.findElement(By.id("passwordfield")).submit();
		System.out.println("User logged in");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='box1']/i"))));
		driver.findElement(By.xpath("//*[@id='box1']/i")).click();
		System.out.println("popup closed");
		
		WebElement projectTab = driver.findElement(By.xpath("//a[@href='#projects' and contains(@class,'header')]")); 
		clickJS(projectTab);
		System.out.println("Clicked on project tab");
		
		driver.findElement(By.xpath("//button[@data-click='OnClickAddProject']")).click();
		System.out.println("clicked on add project");
		
		driver.findElement(By.xpath(".//*[@id='newProjectName']")).sendKeys("interview_1");
		
		driver.findElement(By.xpath(".//*[@id='newProjectName']")).submit();
		System.out.println("project created");
		
		WebElement addTask = driver.findElement(By.xpath("//button[contains(@class,'add-task')]"));
		clickJS(addTask);
		System.out.println("clicked on add task");
		
		driver.findElement(By.xpath("//input[@class='tt-input']")).sendKeys("abc1");
		driver.findElement(By.xpath("//button[@class='ladda-button btn btn-success']")).click();
		System.out.println("Task created");
	}
	
	public static void clickJS(WebElement ele){
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
		return;
	}
	
}
