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

public class Add2Cart {
	public static WebDriver c;
	@Given("^user open TestMeapp3$")
	public void useropenTestMeapp3 () {
		System.setProperty("webdriver.chrome.driver", "C:\\thore upamanyu\\Drivers\\chromedriver.exe");
		c=new ChromeDriver();
		c.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		c.manage().window().maximize();
		c.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	}
	
	@When("^user click signin1$")
	public void userclicksignin1() {
		c.findElement(By.xpath("//a[@href='login.htm']")).click();
	}
	@And("^user enter credinatial as$")
	public void userentercredinatialas(DataTable dt)
	{
		List<String> cred=dt.asList(String.class);
		c.findElement(By.id("userName")).sendKeys(cred.get(0));
		c.findElement(By.id("password")).sendKeys(cred.get(1));
	}
	@Then("^user click login1$")
	public void userclicklogin1() {
		
		c.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}
	
	@And("^search product$")
	public void searchproduct(DataTable dt1) 
	{
		List<String> item=dt1.asList(String.class);
		c.findElement(By.name("products")).sendKeys(item.get(0));
		//c.findElement(By.xpath("//*[@id='myInputautocomplete-list']/div")).click();
	}
	@And("^click on find Details button$")
	public void clickonfindDetailsbutton() {
		c.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		
	}
	
	@Then("^clicks on add to cart$")
	public void clicksonaddtocart() {
		c.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

}
