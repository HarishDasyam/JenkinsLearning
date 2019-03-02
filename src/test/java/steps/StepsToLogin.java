package steps;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsToLogin
{
	public WebDriver driver;
	@Given("Open chrome browser")
	public void openBrowser()
	{
		System.out.println("LB");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@And("maximize the browser")
	public void maxBrowser()
	{
		driver.manage().window().maximize();
	}
	@And("Enter the url")
	public void enterUrl()
	{
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@And("Set the timeouts")
	public void timeout()
		{
		driver.manage().timeouts().implicitlyWait(38,TimeUnit.SECONDS);
		}
	@And("Enter the username")
	public void enterUsername()
	{
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	}
	@And("Enter the password")
	public void enterPassword()
	{
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	@When("Click on Login button")
	public void clicLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Verify login is success")
	public void verifySuccess()
	{
		System.out.println("ONN");
	}
	
	
	@Given("Verify homepage is shown")
	public void verifyHomepageIsShown() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home Page");
	}

	@When("click on CRMSFA link")
	public void clickOnCRMSFALink() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
	}

	@Then("Verify if My home page shows")
	public void verifyIfMyHomePageShows() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("My Home Page is shown");
	}

	@Then("click on Create Lead")
	public void clickOnCreateLead(){
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.partialLinkText("Create Lead")).click();
	}

	@Then("Enter company name")
	public void enterCompanyName() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ONN");
	}

	@Then("Enter First name")
	public void enterFirstName() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Balaji");
	}

	@Then("Enter last name")
	public void enterLastName() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("H");
	}

	@When("click on Create Lead button")
	public void clickOnCreateLeadButton() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("smallSubmit")).click();
	}

	@Then("verify lead is success")
	public void verifyLeadIsSuccess() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Create Lead is success");
	}
	
	@Then("verify lead is fail")
	public void verifyLeadIsFail() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Create Lead is fail");
	}
	
	@Before
	public void beforeMethod(Scenario sc)
	{
		System.out.println(sc.getName()+" "+sc.getId());
		System.out.println(sc.getStatus()+" "+sc.isFailed());
	}
	@After
	public void afterMethod(Scenario sc)
	{
	System.out.println(sc.getStatus()+" "+sc.isFailed());
	driver.close();
	}	
}