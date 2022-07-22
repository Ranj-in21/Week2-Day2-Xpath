package javaAssignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Ranjini",Keys.TAB);
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Rajendran",Keys.TAB);
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//a[text()='12972']")).click();
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		if(title.equals(title1)) {
			System.out.println("Title is same");
		}else 
			System.out.println("Title is not same");
		

driver.findElement(By.xpath("//a[text()='Edit']")).click();
				
driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("TestLeaf New");
driver.findElement(By.xpath("//input[@value='Update']")).click();		
		
	}

}
