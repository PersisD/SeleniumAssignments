/*	FaceBook:
================================ */
// Step 1: Download and set the path 
// Step 2: Launch the chromebrowser
// Step 3: Load the URL https://en-gb.facebook.com/
// Step 4: Maximize the window
// Step 5: Add implicit wait
// Step 6: Click on Create New Account button
// Step 7: Enter the first name
// Step 8: Enter the last name
// Step 9: Enter the mobile number
// Step 10: Enter the password
// Step 11: Handle all the three drop downs
// Step 12: Select the radio button "Female" 
            

package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Maclynn");
		driver.findElement(By.name("lastname")).sendKeys("Ziannah");
		driver.findElement(By.name("reg_email__")).sendKeys("9123456789");
		driver.findElement(By.id("password_step_input")).sendKeys("test@fb.com");
		WebElement elebirthdaydate = driver.findElement(By.name("birthday_day"));
		Select dd = new Select(elebirthdaydate);
		dd.selectByVisibleText("13");
		WebElement elebirthdaymonth = driver.findElement(By.name("birthday_month"));
		Select dd2 = new Select(elebirthdaymonth);
		dd2.selectByVisibleText("May");
		WebElement elebirthdayyear = driver.findElement(By.name("birthday_year"));
		Select dd3 = new Select(elebirthdayyear);
		dd3.selectByVisibleText("2000");
		driver.findElement(By.xpath("//input[@value='1']")).click();
						
		
	}

}
