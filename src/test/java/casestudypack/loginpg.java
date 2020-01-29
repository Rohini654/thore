package casestudypack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginpg {
	public static WebDriver c;
	@Given("^user open TestMeApp$")
	public void useropenTestmeApp2 () {
		System.setProperty("webdriver.chrome.driver", "C:\\thore upamanyu\\Drivers\\chromedriver.exe");
		c=new ChromeDriver();
		c.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		c.manage().window().maximize();
		c.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	}
	
	@When("^user click signin$")
	public void userclicksignin() {
		c.findElement(By.xpath("//a[@href='login.htm']")).click();
	}
	@And("^user enter credinatials as$")
	public void userentercredinatialsas(DataTable dt)
	{
		List<String> cred=dt.asList(String.class);
		c.findElement(By.id("userName")).sendKeys(cred.get(0));
		c.findElement(By.id("password")).sendKeys(cred.get(1));
	}
	@Then("^user click login$")
	public void userclicklogin() {
		
		c.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}
		
	}


