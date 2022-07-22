package javaAssignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundCheckbox {

	public static void main(String[] args) {
		
		//Chrome setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Select Languages
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
		//Checkbox verification
		System.out.println("Is Selenium checked? " +driver.findElement(By.xpath("(//div[@class='example'])[2]//child::input")).isSelected());
		//Deselect
		driver.findElement(By.xpath("((//div[@class='example'])[3]//child::input)[2]")).click();
		//Select all
		driver.findElement(By.xpath("((//div[@class='example'])[4]//child::input)[1]")).click();
		driver.findElement(By.xpath("((//div[@class='example'])[4]//child::input)[2]")).click();
		driver.findElement(By.xpath("((//div[@class='example'])[4]//child::input)[3]")).click();
		driver.findElement(By.xpath("((//div[@class='example'])[4]//child::input)[4]")).click();
		driver.findElement(By.xpath("((//div[@class='example'])[4]//child::input)[5]")).click();
		driver.findElement(By.xpath("((//div[@class='example'])[4]//child::input)[6]")).click();
		
		
		
		
	}

}
