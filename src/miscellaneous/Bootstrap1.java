package miscellaneous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("http://seleniumpractise.blogspot.com/2016/11/handle-bootstrap-model-dialog-in.html");

		WebElement btn = driver.findElement(By.xpath("//button[text()='Click here to Login']"));

		btn.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()[contains(.,'Username')]]/input[@type='text']"))
				.sendKeys("aaye toh..");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()[contains(.,'Username')]]/input[@type='password']"))
				.sendKeys("maah rulez");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()[contains(.,'Username')]]/input[@type='submit']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Close']")).click();
		Thread.sleep(9000);

		driver.quit();

	}

}
