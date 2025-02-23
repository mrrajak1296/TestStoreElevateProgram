package elevateProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AutomationTestStore1 {
		WebDriver driver =new ChromeDriver();
		@BeforeClass
		public void Url() {
		driver.get("https://automationteststore.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		@Test(priority=1)
		public void Search() {
			driver.findElement(By.xpath("//input[@id='filter_keyword']")).sendKeys("Shirt");
			driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
			driver.findElement(By.xpath("//div[@id='maincontainer']//div[2]//div[2]//a[1]//img[1]")).click();
			
		} 
		@Test(priority=2)
		public void AddToCart() {
			driver.findElement(By.xpath("//a[normalize-space()='Add to Cart']")).click();
			driver.findElement(By.xpath("//a[@id='cart_checkout1']")).click();
			
		}
		@Test(priority=3)
		public void Login() {
			driver.findElement(By.xpath("//a[normalize-space()='Login or register']")).click();
			driver.findElement(By.xpath("//input[@id='loginFrm_loginname']")).sendKeys("Maa123");
			driver.findElement(By.xpath("//input[@id='loginFrm_password']")).sendKeys("Mani@12345");
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			
		}

}
