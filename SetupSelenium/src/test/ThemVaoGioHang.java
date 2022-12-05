package test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThemVaoGioHang {
	WebDriver driver;

	@Before
	public void connect() {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
			driver.manage().window().maximize();
		driver.navigate().to("https://tinhocngoisao.com/");
	}
	
	@Test
	public void main() throws InterruptedException {
		Thread.sleep(2000);
		// Lay san pham them vao gio hang
		driver.findElement(By.xpath("//body/section[1]/div[1]/section[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//body/section[1]/div[1]/section[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[4]")).click();

		driver.findElement(By.xpath("//b[contains(text(),'Giỏ hàng')]")).click();
		Thread.sleep(2000);
		// tang so luong 
		//driver.findElement(By.xpath("//body/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/input[1]")).click();
		//driver.findElement(By.xpath("//body/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/input[1]")).sendKeys("3");
		
		// xoa san pham
		driver.findElement(By.xpath("//body/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]")).click();
	}
	
	
//	@After
//	public void closeBrowser() {
//		driver.quit();
//	}
}
