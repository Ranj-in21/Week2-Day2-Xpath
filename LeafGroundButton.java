package javaAssignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {


	public static void main(String[] args) {
		
		//Chrome Setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Load Home Page
		driver.findElement(By.xpath("//button[@id='home']")).click();
		
		System.out.println("Home Page: " +driver.getTitle());
		//Play with Buttons
		driver.findElement(By.xpath("(//li[@class='col-lg-3 col-md-3 col-sm-3'])[2]//child::a")).click();
		
		System.out.println("Location of x: " +driver.findElement(By.id("position")).getLocation().getX());
		System.out.println("Location of y: " +driver.findElement(By.id("position")).getLocation().getY());
		
		System.out.println("Color: " +driver.findElement(By.id("color")).getCssValue("background-color"));
		System.out.println("Size: " +driver.findElement(By.id("size")).getSize());
		
		

	}

}
