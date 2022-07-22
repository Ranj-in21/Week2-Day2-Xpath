package javaAssignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ranjini");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rajendran");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9444324036");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("infinity1213");
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select daydrop = new Select(day);
		daydrop.selectByIndex(20);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select monthdrop = new Select(month);
		monthdrop.selectByIndex(3);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select yeardrop = new Select(year);
		yeardrop.selectByValue("1990");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
