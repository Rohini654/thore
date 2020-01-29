package casestudypack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.sun.tools.javac.util.List;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefination {
	public static WebDriver c;
	@Given("^user open Testme App$")
	public void useropenTestmeApp1 () {
		System.setProperty("webdriver.chrome.driver", "C:\\thore upamanyu\\Drivers\\chromedriver.exe");
		c=new ChromeDriver();
		c.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		c.manage().window().maximize();
		c.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	}
	@And("^user click singup$")
	public void userclicksingup() {
		c.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
	}
	@And("^enter user name as \"([^\"]*)\"$")
	public void enterusername(String uname)  {
		c.findElement(By.name("userName")).sendKeys(uname);
		
	}
	@And("^enter first name as \"([^\"]*)\"$")
	public void enterfirstname(String fname) {
		c.findElement(By.name("firstName")).sendKeys(fname);
		
	}
	@And("^enter last name as \"([^\"]*)\"$")
	public void enterlastname (String lname) {
		c.findElement(By.name("lastName")).sendKeys(lname);
	}
	
	
	@And("^enter password as \"([^\"]*)\"$")
	public void enterpassword(String password) {
		c.findElement(By.name("password")).sendKeys(password);
		
	}
	
	@And("^enter confirm password as \"([^\"]*)\"$")
	public void enterconfirmpassword(String cpass) {
		c.findElement(By.id("pass_confirmation")).sendKeys(cpass);
		
	}
	
	@And("^user select gender as \"([^\"]*)\"$")
	public void WebElementgender(String gender) {
		if(gender.equalsIgnoreCase("Male")) {
			c.findElement(By.xpath("//input[@value='Male']")).click();
		}
		else if(gender.equalsIgnoreCase("Female")){
			c.findElement(By.xpath("//inpit[@value='Female']")).click();
		}
		//List<WebElement>allRadioButtons=c.findElements(By.id("gender"));
	//	allRadioButtons.get(0).click();
		
	}
	
	@And("^enter email  as \"([^\"]*)\"$")
	public void enteremail(String Eml) {
		c.findElement(By.id("emailAddress")).sendKeys(Eml);
		
	}
	
	@And("^enter mobile Number as \"([^\"]*)\"$")
	public void entermobileNumber(String Num) {
		c.findElement(By.id("mobileNumber")).sendKeys(Num);
		
	}
	
	@And("^enter DOB as \"([^\"]*)\"$")
	public void enterDOB(String dob) {
		c.findElement(By.id("dob")).sendKeys(dob);
		
	}
	
	@And("^enter address as \"([^\"]*)\"$")
	public void enteraddress (String address) {
		c.findElement(By.id("address")).sendKeys(address);	
	}
	
	@And("^enter security question as \"([^\"]*)\"$")
	public void entersecurityquestion (String question) {
		
	WebElement dropdown=c.findElement(By.name("securityQuestion"));
	Select s=new Select(dropdown);
	c.findElement(By.id("securityQuestion")).sendKeys(question);
	}
	
	@And("^enter answer as \"([^\"]*)\"$")
	public void  enteransweras (String ans) {
		c.findElement(By.name("answer")).sendKeys(ans);
		
	}
	
	@Then("^user click on Register$")
	public void userclickonRegister() {
		c.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();

	}
	}
