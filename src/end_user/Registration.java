package end_user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
//		String testEmail="tasneemmahmuod8769@gmail.com";
		
		System.setProperty("webdriver.chrome.driver", "C:\\my new drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.booking.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[1]/div[2]/div[5]/a")).click();
//		driver.findElement(By.id("username")).sendKeys(testEmail);
//	    driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("tasneemmahmuod8769@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("TASNeem98t5");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[2]/button")).click();
	}

}
