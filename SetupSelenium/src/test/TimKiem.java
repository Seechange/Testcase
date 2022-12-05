package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimKiem {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://tinhocngoisao.com/");
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='inputSearchAuto']"));
		searchBox.sendKeys("Laptop");
		driver.findElement(By.xpath("//header/div[@id='headerPage']/div[1]/div[1]/div[2]/div[1]/form[1]/button[1]")).click();
		
}
}
