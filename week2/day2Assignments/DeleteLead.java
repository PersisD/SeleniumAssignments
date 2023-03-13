/*		http://leaftaps.com/opentaps/control/main
		 
		Delete Lead:
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Phone
		9	Enter phone number
		10	Click find leads button
		11	Capture lead ID of First Resulting lead
		12	Click First Resulting lead
		13	Click Delete
		14	Click Find leads
		15	Enter captured lead ID
		16	Click find leads button
		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		18	Close the browser (Do not log out)
*/

package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {
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
	driver.findElement(By.xpath("//span[text()='Phone']")).click();	
	driver.findElement(By.name("phoneNumber")).sendKeys("99");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	
	Thread.sleep(3000);
	String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText(); 	//16110
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	driver.findElement(By.linkText("Delete")).click();
	
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.name("id")).sendKeys(leadID);	
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	
	// Verify message "No records to display" in the Lead List.
	String message = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
	if (message.equals("No records to display")) {
		System.out.println("Deleted Successfully");
	} else {
		System.out.println("Not Deleted");
	}
	
	driver.close();
		
}
}

