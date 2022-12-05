package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DangNhap {

	
	public static void main(String[] arg) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://tinhocngoisao.com/");
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//body/div[@id='insPopupNewletter']/div[2]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Đăng nhập/Đăng ký')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-form-username']")).sendKeys("hotutai2002@gmail.com");
		driver.findElement(By.xpath("//input[@id='login-form-password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='login-form-submit']")).click();
//		driver.quit();
	}
	}
	
