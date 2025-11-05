package RunstepsPack;

import java.time.Duration;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Runstepbystep {
	public static WebDriver driver;
	
	@FindBy(xpath = "//a[@id = 'nav_automobile']")WebElement nav;
	 @FindBy(xpath = "//option[@value = 'Audi']")WebElement make;
	 @FindBy(xpath = "//input[@id = 'engineperformance']")WebElement E;
	 @FindBy(xpath = "//input[@id = 'dateofmanufacture']")WebElement D;
	 @FindBy(xpath= "//option[@value = '4']")WebElement seats;
	 @FindBy(xpath = "//option[@value = 'Petrol']")WebElement fuel;
	 @FindBy(xpath = "//input[@id = 'listprice']")WebElement P;
	 @FindBy(xpath = "//input[@id = 'licenseplatenumber']")WebElement L;
	 @FindBy(xpath = "//input[@id = 'annualmileage']")WebElement M;
	 @FindBy(xpath = "//button[@id ='nextenterinsurantdata']")WebElement N;
	 @FindBy(xpath = " //input[@id = 'firstname']")WebElement F;
	 @FindBy(xpath = " //input[@id = 'lastname']")WebElement S;
	 @FindBy(xpath = " //input[@id = 'birthdate']")WebElement B;
	 @FindBy(xpath ="//input[@id= 'gendermale']")WebElement gender;
     @FindBy(xpath = "//option[@value = 'India']")WebElement country;
	 @FindBy(xpath = " //input[@id = 'streetaddress']")WebElement A;
	 @FindBy(xpath = " //input[@id = 'zipcode']")WebElement Z;
	 @FindBy(xpath = " //input[@id = 'city']")WebElement C;
	 @FindBy(xpath = "//option[@value = 'Employee']")WebElement oc;
	 @FindBy(xpath = "//input[@value = 'Speeding']")WebElement h;
	 @FindBy(xpath = "//button[@id = 'nextenterproductdata']")WebElement p;
	 @FindBy(xpath = "//input[@id = 'startdate']")WebElement startdate;
	 @FindBy(xpath = "//option[@value = '3000000']")WebElement sum;
	 @FindBy(xpath = "//option[@value = 'Bonus 3']")WebElement rate;
	 @FindBy(xpath = "//option[@value = 'Full Coverage']")WebElement dam;
	 @FindBy(xpath = "//input[@id= 'EuroProtection']")WebElement product;
	 @FindBy(xpath = "//option[@value = 'Yes']")WebElement car;
	 @FindBy(xpath = "//button[@id = 'nextselectpriceoption']")WebElement W;
	 @FindBy(xpath = "//input[@id= 'selectgold']")WebElement gold;
	 @FindBy(xpath = "//button[@id = 'nextsendquote']")WebElement q;
	 @FindBy(xpath = "//input[@id = 'email']")WebElement Eg;
	 @FindBy(xpath = "//input[@id = 'username']")WebElement U;
	 @FindBy(xpath = "//input[@id = 'password']")WebElement y;
	 @FindBy(xpath = "//input[@id = 'confirmpassword']")WebElement o;
	 @FindBy(xpath = "//button[@id = 'sendemail']")WebElement e;
	 
@Given("enter the application url")
public void enter_the_application_url() {
	System.setProperty("webdriver.chrome.driver", "D:\\QA Engineering\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://sampleapp.tricentis.com/101/app.php");
    
}
@Then("check the title of homepage")
public void check_the_title_of_homepage() {
	System.out.println("The Home page Title is : "+driver.getTitle());
   
}
@Then("click on  Automobile Insurance")
public void click_on_automobile_insurance() {
	Runstepbystep s =  PageFactory.initElements(driver, Runstepbystep.class);
	 PageFactory.initElements(driver,this);
	 nav.click();
}
@Then("enter Vehicle data")
public void enter_vehicle_data() {
	
	 make.click();
	E.sendKeys("1200");
	D.sendKeys("01/01/2020");
	seats.click();
	fuel.click();
	P.sendKeys("50000");
	L.sendKeys("AB123CD");
	M.sendKeys("10000");
   N.click();  
}
@Then("enter insurance data")
public void enter_insurance_data() {
	  
	  F.sendKeys("John");
	  S.sendKeys("Deo");
	  B.sendKeys("01/01/1990");
	  
	  ((JavascriptExecutor)driver).executeScript("arguments[0].click()",gender);
 
	  country.click();
      A.sendKeys("Temple street");
	  Z.sendKeys("600001");
	  C.sendKeys("Chennai");
	  oc.click();
	  ((JavascriptExecutor)driver).executeScript("arguments[0].click()",h); 
	  p.click();
	  
}
@Then("enter product data")
public void enter_product_data() {
	PageFactory.initElements(driver,this);
	  startdate.sendKeys("11/01/2026");
	  sum.click();
	  rate.click();
	  dam.click();
	  ((JavascriptExecutor)driver).executeScript("arguments[0].click()",product);
	  car.click();	  
	W.click();
}

@Then("select price option")
public void select_price_option() {
	
	((JavascriptExecutor)driver).executeScript("arguments[0].click()",gold);
	 ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 2600)");
	 ((JavascriptExecutor)driver).executeScript("arguments[0].click()",q);
}
@Then("Enter personal info")
public void enter_personal_info() {
	  
	  Eg.sendKeys("john@gmail.com");
		U.sendKeys("johndeo");
		y.sendKeys("Test@123");
		o.sendKeys("Test@123");
		 e.click();
}



}
