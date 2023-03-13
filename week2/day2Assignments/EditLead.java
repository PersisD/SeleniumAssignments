 /*		http://leaftaps.com/opentaps/control/main
			
			* 1	Launch the browser
			* 2	Enter the username
			* 3	Enter the password
			* 4	Click Login
			* 5	Click crm/sfa link
			* 6	Click Leads link
			* 7	Click Find leads
			* 8	Enter first name
			* 9	Click Find leads button
			* 10 Click on first resulting lead
			* 11 Verify title of the page
			* 12 Click Edit
			* 13 Change the company name
			* 14 Click Update
			* 15 Confirm the changed name appears
			* 16 Close the browser (Do not log out)
*/


package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditLead {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click(); 
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("pharo");	
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	String title = driver.getTitle();
	System.out.println("The title of the page is: " +title);
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Group Software LTD");	
	driver.findElement(By.name("submitButton")).click();
	
	// Confirm the changed name appears -> company name
	String text = driver.findElement(By.xpath("//span[text()='Company Name']/following::span")).getText();

	if (text.contains("Group Software LTD")) {
		System.out.println("Company name has been updated.");
	} else {
		System.out.println("Company name has not changed.");
	}
	driver.close();
		
}
}
