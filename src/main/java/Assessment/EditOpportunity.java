package Assessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
//cntrl+shift+O

public class EditOpportunity {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Tuna@123");
		driver.findElement(By.id("Login")).click();
//driver.findElement(By.className("slds-r5")).click();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30,30));
//Title of the webpage is "Software Testing Material - A site for Software Testers"
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='slds-global-actions']//child::li[3]")));
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(
				By.xpath("//img[@src ='https://qeagle-dev-ed.my.salesforce.com/logos/Salesforce/SalesCloud/logo.png']"))
				.click();

//driver.findElement(By.xpath("//a[@href='/lightning/o/Opportunity/home']")).click();
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement element2 = driver.findElement(By.xpath(
				"html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[2]/a/span"));
		driver.executeScript("arguments[0].click();", element2);

		/*
		 * WebElement elem3 =
		 * driver.findElement(By.xpath("//a[@title='Oppo to be deleted']"));
		 * driver.executeScript("agruments[0].click()",elem3);
		 */

		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}

//driver.findElement(By.xpath("//a[@title='Oppo to be deleted']")).click();
		WebElement element = driver.findElement(By.xpath("//a[@title='xyz']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement element5 = driver
				.findElement(By.xpath("//ul[@class='slds-button-group-list']//child::lightning-primitive-icon"));
//driver.executeScript("arguments[0].click();", element5);
		Actions action1 = new Actions(driver);
		action1.moveToElement(element5).click().perform();
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement element6 = driver.findElement(By.xpath("//a[@name='Edit']"));
//driver.executeScript("arguments[0].click();", element5);
		Actions action2 = new Actions(driver);
		action2.moveToElement(element6).click().perform();
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * WebElement element7 = driver.findElement(By.xpath(
		 * "(//lightning-base-combobox[@class='slds-combobox_container']//child::button)[3]"
		 * )); //driver.executeScript("arguments[0].click();", element5); Actions
		 * action3 = new Actions(driver);
		 * action3.moveToElement(element7).click().perform();
		 * 
		 * try{ TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * //Select se = new Select(driver.findElement(By.xpath(
		 * "(//lightning-base-combobox[@class='slds-combobox_container']//child::button)[3]"
		 * )));
		 * 
		 * //*[@id="combobox-button-410"]/span/text() /* WebElement elem4 =
		 * driver.findElement(By.xpath(
		 * "//lightning-base-combobox[@class='slds-combobox_container']//child::button)[3]"
		 * ));
		 * 
		 * Select sel = new Select(elem4); // driver.executeScript("arguments[0].;",
		 * elem4); // Actions action3 = new Actions(driver);
		 * sel.selectByVisibleText("prospecting"); sel.selectByIndex(1);
		 */
//se.selectByVisibleText("prospecting");
// se.selectByValue("Needs Analysis");
// se.selectByIndex(6);

		WebElement element8 = driver.findElement(By.xpath("//input[@name='Name']"));
//driver.executeScript("arguments[0].click();", element5);
		Actions action5 = new Actions(driver);
		action5.moveToElement(element8).click().perform();
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement element9 = driver.findElement(By.xpath("//input[@name='Amount']"));
//driver.executeScript("arguments[0].click();", element5);
		Actions action6 = new Actions(driver);
		action6.moveToElement(element9).click().perform();

		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
