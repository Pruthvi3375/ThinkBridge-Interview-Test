package QuestionNo2Ans;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class testQuestionNo2Ans {
	
WebDriver driver;
	
	//Open Browser.
	@BeforeClass
	public void browserInitialization() {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://jt-dev.azurewebsites.net/#/SignUp");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
	
	//Close Browser.
	@AfterClass
	public void quitBrowser() {
		driver.quit();
	}
	
	
	@Test
	public void verifyingSignUpLanguageDropdown() {
		
	WebElement dropDown = driver.findElement(By.xpath("//div[@id = 'language']"));
	dropDown.click();
	
	WebElement English = driver.findElement(By.xpath("//div[text()='English']"));
	String text = English.getText();
	Assert.assertEquals(text, "English");
	
	WebElement Dutch = driver.findElement(By.xpath("//div[text()='Dutch']"));
	String text2 = Dutch.getText();
	Assert.assertEquals(text2, "Dutch");
	}
	
	@Test
	public void verifyingSignUpUserName() {
	WebElement uname = driver.findElement(By.xpath("//input[@id = 'name']"));
	uname.sendKeys("pruthviraj");
	}
	
	@Test
	public void verifyingSignUpOrgName() {
	WebElement orgName = driver.findElement(By.xpath("//input[@id = 'orgName']"));
	orgName.sendKeys("pruthviraj");
	}
	
	@Test
	public void verifyingSignUpEmail() {
	WebElement email = driver.findElement(By.xpath("//input[@id = 'singUpEmail']"));
	email.sendKeys("Demo@gmail.com");
	}
	
	@Test
	public void verifyingSignUpCheckBox() {
	WebElement checkbox = driver.findElement(By.xpath("//span[@class ='black-color ng-binding']"));
	checkbox.click();
	}
	
	@Test
	public void verifyingSignUpSignupBtn() {
	WebElement signupBtn = driver.findElement(By.xpath("//div[@class ='form-group custom-form-group']"));
	signupBtn.click();
	}
	
//	Further script can be used to validate the email.
//	@Test
//	public void verifyingGmailUrl() {
//	driver.get("https://mail.google.com/");
//	}
//	@Test
//	public void verifyingGmailEmailID() {
//	WebElement emailId = driver.findElement(By.xpath("//input[@type = 'email']"));
//	emailId.sendKeys("Demo@gmail.com");
//	}
//	
//	@Test
//	public void verifyingGmailNextBtn() {
//	WebElement nextBtn = driver.findElement(By.xpath("//button[@class= 'VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qfvgSe qIypjc TrZEUc lw1w4b']"));
//	nextBtn.click();
//	}
//	
//	@Test
//	public void verifyingGmailPassword() {
//	WebElement password = driver.findElement(By.xpath("//input[@type = 'password']"));
//	password.sendKeys("Password");
//	}
//	
//	@Test
//	public void verifyingGmailNextBtn2() {
//	WebElement next_Btn = driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qfvgSe qIypjc TrZEUc lw1w4b']"));
//	next_Btn.click();
//	
//	
//	@Test
//	public void verifyingGmailSearchBar() {
//	WebElement searchBar = driver.findElement(By.xpath("//input[@aria-label='Search mail']"));
//	searchBar.sendKeys("jabatalks");
//	}
//	
//	@Test
//	public void verifyingGmailSearchBtn() {
//	WebElement searchBtn = driver.findElement(By.xpath("//button[@aria-label='Search mail']"));
//	searchBtn.click();
//	}
//	
//	@Test
//	public void verifyingGmailSelectMail() {
//	WebElement select = driver.findElement(By.xpath("//tr[@draggable='false']"));
//	select.click();
//	}
//	
//	@Test
//	public void verifyingGmailConfirmAcccount() {
//	WebElement confirmYourAccount = driver.findElement(By.xpath("//a[text()='Confirm your account']"));
//	confirmYourAccount.click();
//	}
//	}

}
