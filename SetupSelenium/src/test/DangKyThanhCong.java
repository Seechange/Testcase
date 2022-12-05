package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DangKyThanhCong {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://tinhocngoisao.com/");
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//body/div[@id='insPopupNewletter']/div[2]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Đăng nhập/Đăng ký')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/section[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys("Hồ");
		driver.findElement(By.xpath("//body/section[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")).sendKeys("Tú Tài");
		driver.findElement(By.xpath("//body/section[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/form[1]/div[3]/input[1]")).sendKeys("hotutai2002@gmail.com");
		driver.findElement(By.xpath("//body/section[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/form[1]/div[4]/input[1]")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='register-form-repassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='register-form-submit']")).click();
 }
}
