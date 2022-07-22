package javaAssignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundImages {

	public static void main(String[] args) {
		
		//Chrome Setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Home Page
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[1]//child::img")).click();
		//Broken Image
		driver.findElement(By.xpath("(//li[@class='col-lg-3 col-md-3 col-sm-3'])[4]//child::a")).click();
		System.out.println("Am I broken Image? " +driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[2]//child::img")).isDisplayed());
		//Home Page
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[3]//child::img")).click();
		
		
		
		
		
		
		
		
		
		

	}

}
