package Assessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOpputunity {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		// ChromeDriver driver=new ChromeDriver();

		driver.get("https://qeagle-dev-ed.my.salesforce.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Tuna@123");
		driver.findElement(By.id("Login")).click();

		try {
			TimeUnit.SECONDS.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//ul[@class='slds-global-actions']//child::li[3]")).click();
		driver.findElement(By.xpath("//ul[@class='scrollable']//child::li[5]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Creta eoppotunity
		driver.findElement(findXP("Opportunity Name")).sendKeys("New Oppurtunity");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Input Account
		driver.findElement(
				By.xpath("//div[contains(@class, 'cuf-content scrollable')]//input[contains(@role, 'combobox')]"))
				.click();

		driver.findElement(
				By.xpath("//div[contains(@class, 'cuf-content scrollable')]//input[contains(@role, 'combobox')]"))
				.sendKeys("RAm");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//div[contains(@class, 'listContent')]//li[1]//a")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[text()='Close Date']//parent::label//following-sibling::div//input")).clear();
		driver.findElement(By.xpath("//*[text()='Close Date']//parent::label//following-sibling::div//input"))
				.sendKeys("7/18/2022");

		driver.findElement(By.xpath("//div[contains(@class, 'cuf-content scrollable')]//a[contains(@class, 'select')]"))
				.click();

		driver.findElement(By.xpath("//div[contains(@class, 'select-options')]//li//a[@title='Prospecting']")).click();

		driver.findElement(findXP("Amount")).sendKeys("100");
		driver.findElement(findXP("Next Step")).sendKeys("Step 1");

		driver.findElement(By.xpath(
				"//div[contains(@class, 'slds-grid bottomBar')]//*[text()='Save']//parent::button[contains(@class, 'slds-button')]"))
				.click();

	}

	public static By findXP(String label) {
		return By.xpath("//*[text()='" + label + "']//parent::label//following-sibling::input");
	}

}