package javaAssignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;


import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		
				//Chrome setup
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				//Launch URL
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Enter the username and password
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
				driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
				//Click CRM/SFA link
				driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
				//Click Leads link
				driver.findElement(By.xpath("//a[text()='Leads']")).click();
				//Click Find leads
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				//Click Phone		
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
				//Enter Phone Number
				driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9444324036");
				//Click Find Leads
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				//Lead ID of first resulting lead
				driver.findElement(By.xpath("//a[text()='14389']")).click();
				//Delete Lead ID
				driver.findElement(By.xpath("//a[text()='Delete']")).click();
				//Click Find Leads
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				//Search Lead ID
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys("14389");	
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				System.out.println("No records to display");
				
				
				
				
				
				
				
			
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		
	}

}
