package qspp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./newdriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.work4skills.com/login");
		driver.findElement(By.id("EmailLogin")).sendKeys("satvik.sulibhavi@gmail.com");
		driver.findElement(By.id("PasswordLogin")).sendKeys("Vnurt@t");
		driver.findElement(By.id("inputCaptcha")).sendKeys("37821");
		driver.findElement(By.id("btnGo")).click();
	}

}
