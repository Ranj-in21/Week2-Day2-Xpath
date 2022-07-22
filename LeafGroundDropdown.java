package javaAssignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropdown {

	public static void main(String[] args) {
		
		//Chrome setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//By Index
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select id = new Select(dropdown1);
		id.selectByIndex(1);
		//By Text
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select text = new Select(dropdown2);
		text.selectByVisibleText("Selenium");
		//By Value
		WebElement dropdown3 = driver.findElement(By.xpath("//select[@id='dropdown3']"));
		Select value = new Select(dropdown3);
		value.selectByValue("1");
		//Send keys
		driver.findElement(By.xpath("(//div[@class='example'])[5]//child::select")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER,Keys.ENTER);
		//Select options
		driver.findElement(By.xpath("((//div[@class='example'])[6]//child::option)[2]")).click();
		
		
		
		
	}

}
