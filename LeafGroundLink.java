package javaAssignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundLink {

	public static void main(String[] args) {
		
		//Chrome Setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Go to Home page
		driver.findElement(By.linkText("Go to Home Page")).click();
		//Without click
		driver.findElement(By.xpath("(//li[@class='col-lg-3 col-md-3 col-sm-3'])[3]//child::a")).click();
		System.out.println("Where am I? "+driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		//Broken Link
		System.out.println("Broken link: " +driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href"));
		System.out.println("Verify am I broken? " +driver.findElement(By.linkText("Verify am I broken?")).isDisplayed());
		//Home Page
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
		driver.findElement(By.xpath("(//li[@class='col-lg-3 col-md-3 col-sm-3'])[3]//child::a")).click();
		 
		
		

		
		
		
		
		
		
		
	}

}
