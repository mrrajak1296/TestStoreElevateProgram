package elevateProgram;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AutomationtestStore {
		WebDriver driver =new ChromeDriver();
		@BeforeClass
		public void Url() {
		driver.get("https://automationteststore.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		// Register Your Personal Details
		@Test(priority = 1)
		public void Register () {
		driver.findElement(By.xpath("//a[normalize-space()='Login or register']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		driver.findElement(By.xpath("//input[@id='AccountFrm_firstname']")).sendKeys("Anil");
		driver.findElement(By.xpath("//input[@id='AccountFrm_lastname']")).sendKeys("Rajak");
		driver.findElement(By.xpath("//input[@id='AccountFrm_email']")).sendKeys("abcd123@gmail.com");
		driver.findElement(By.xpath("//input[@id='AccountFrm_telephone']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@id='AccountFrm_fax']")).sendKeys("AP1234");
		}
		//Your Address
		@Test(priority=2)
		public void yourAddress() {
		driver.findElement(By.cssSelector("#AccountFrm_company")).sendKeys("Masai");
		driver.findElement(By.xpath("//input[@id='AccountFrm_address_1']")).sendKeys("bhopal madhya pradesh");
		driver.findElement(By.cssSelector("#AccountFrm_address_2")).sendKeys("bhopal madhya pradesh");
		driver.findElement(By.xpath("//input[@id='AccountFrm_city']")).sendKeys("bhopal");
		
		WebElement coun = driver.findElement(By.xpath("//select[@id='AccountFrm_country_id']"));
		Select place = new Select(coun);
		place.selectByVisibleText("India");
		
		WebElement cou = driver.findElement(By.xpath("//select[@id='AccountFrm_zone_id']"));
		Select pla = new Select(cou);
		pla.selectByVisibleText("Madhya Pradesh");		
		driver.findElement(By.xpath("//input[@id='AccountFrm_postcode']")).sendKeys("462001");
		}
		//Login Details
		@Test(priority=3)
		public void Logindetails() {

		driver.findElement(By.xpath("//input[@id='AccountFrm_loginname']")).sendKeys("Maa123");
		driver.findElement(By.xpath("//input[@id='AccountFrm_password']")).sendKeys("Mani@12345");
		driver.findElement(By.xpath("//input[@id='AccountFrm_confirm']")).sendKeys("Mani@12345");
		driver.findElement(By.xpath("//input[@id='AccountFrm_agree']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
	}
		

}
