package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DangNhapTB {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://tinhocngoisao.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Đăng nhập/Đăng ký')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-form-username']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='login-form-password']")).sendKeys("");
		driver.findElement(By.xpath("//button[@id='login-form-submit']")).click();
		
	}
}
