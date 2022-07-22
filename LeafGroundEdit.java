package javaAssignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {

	public static void main(String[] args) {
		//Chrome Setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter email
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ranjini.1213@gmail.com");
		//Append text and press TAB key
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Hello", Keys.TAB);
		//Default text
		System.out.println(driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[3]/label")).getText());
		String attribute = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
		System.out.println(attribute);
		System.out.println("Is the value displayed: " +driver.findElement(By.xpath("//input[@value='TestLeaf']")).isDisplayed());
		//Clear the Text
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		//Edit field confirmation
		System.out.println("Is the edit field enabled: " +driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled());
		
	
		
	}
	

}
