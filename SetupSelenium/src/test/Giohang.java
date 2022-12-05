package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Giohang {
	WebDriver driver;


	@Before
	public void connect() {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
			driver.manage().window().maximize();
		driver.navigate().to("https://tinhocngoisao.com/");
//		driver.findElement(By.xpath("//span[contains(text(),'Đăng nhập/Đăng ký')]")).click();
//		driver.findElement(By.xpath("//input[@id='login-form-username']")).sendKeys("hotutai2002@gmail.com");
//		driver.findElement(By.xpath("//input[@id='login-form-password']")).sendKeys("123456");
//		driver.findElement(By.xpath("//button[@id='login-form-submit']")).click();
//		driver.findElement(By.xpath("//header/div[@id='headerPage']/div[1]/div[1]/div[1]/p[1]/a[1]/img[1]")).click();
	}
	@Test
	public void main() throws InterruptedException {
		driver.findElement(By.xpath("//body/section[1]/div[1]/section[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'MUA NGAY')]")).click();

		// nhap du lieu
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='billing_address_full_name']")).sendKeys("Vo Van Danh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='checkout_user_email']")).sendKeys("Vovandanh@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='billing_address_phone']")).sendKeys("0123456789");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='billing_address_address1']")).sendKeys("19 NVX GL");
		Thread.sleep(2000);
		Select droptinh = new Select(driver.findElement(By.id("customer_shipping_province")));
		Thread.sleep(2000);
		droptinh.selectByIndex(1);
		Thread.sleep(2000);
		Select drophuyen = new Select(driver.findElement(By.id("customer_shipping_district")));		
		Thread.sleep(2000);
		drophuyen.selectByIndex(6);
		Thread.sleep(2000);
		Select dropxa = new Select(driver.findElement(By.id("customer_shipping_ward")));	
		Thread.sleep(2000);
		dropxa.selectByIndex(1);
		Thread.sleep(2500);
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[2]/div[2]/div[2]/div[2]/form[1]/button[1]")).click();
		
	}
	
//	@After
//	public void closeBrowser() {
//		driver.quit();
//	}
	
}
