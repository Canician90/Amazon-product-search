package ffref;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class Dv {
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.diriver", "C:\\Selenium\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco F1");
		Thread.sleep(1000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Nillkin")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("POCO")).click();
		Thread.sleep(1000);
		driver.navigate().to("https://www.edureka.co/");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.quit();	
		
		
		
		
		}
		
}

	
		
	

		