/*
 	http://leaftaps.com/opentaps/control/main
 
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Email
		9	Enter Email
		10	Click find leads button
		11	Capture name of First Resulting lead
		12	Click First Resulting lead
		13	Click Duplicate Lead
		14	Verify the title as 'Duplicate Lead'
		15	Click Create Lead
		16	Confirm the duplicated lead name is same as captured name
		17	Close the browser (Do not log out)
		
 */

package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click(); 
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);	
		//Capture name of First Resulting lead
		String name = driver.findElement(By.linkText("Geetha")).getText();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		//Verify the title as 'Duplicate Lead'
		String title = driver.findElement(By.xpath("//div[text()='Duplicate Lead']")).getText();
		
		if (title.equals("Duplicate Lead")) {
			System.out.println("The title is 'Duplicate Lead'.");
		} else {
			System.out.println("The title is not Duplicate Lead");
		}
		driver.findElement(By.name("submitButton")).click();
		
		//Confirm the duplicated lead name is same as captured name
		String duplicatename = driver.findElement(By.xpath("//span[text()='Geetha']")).getText();
		if (name.equals(duplicatename)) {
			System.out.println("The Lead is Duplicated.");
		} else {
			System.out.println("Its not Duplicate lead");
		}
		driver.close();
	}

}
