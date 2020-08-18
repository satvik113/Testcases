package qspp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignupForVnurt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./newdriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.work4skills.com/signUp");
		Thread.sleep(2000);
		driver.findElement(By.id("EmailLogin")).sendKeys("satvik.sulibhavi@gmail.com");
		driver.findElement(By.id("PasswordLogin")).sendKeys("Vnurt@t");
		driver.findElement(By.id("FirstName")).sendKeys("satvik");
		driver.findElement(By.id("LastName")).sendKeys("ms");
		driver.findElement(By.id("account_mobile")).sendKeys("77575775755");
		driver.findElement(By.id("UserTypeSignUp")).sendKeys("abd");
		driver.findElement(By.id("referralCode")).sendKeys("34567");
		driver.findElement(By.id("inputCaptcha")).sendKeys("2345");
		driver.findElement(By.id("btnSignUpServer")).click();
		driver.close();
	}

}
