import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class f1StepDef {

    WebDriver driver ;
    @Given("^User opens the seek site$")
    public void user_opens_the_browser() {
        System.setProperty("webdriver.chrome.driver","C:/tryhard/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.seek.com.au/");
    }

    @When("^User clicks on login$")
    public void user_clicks_login(){

        driver.findElement(By.xpath("//a[@mode ='signin']")).click();

    }

    @And("^Inputs \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_closes_the_browser(String loginId, String pwd) {

        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id= 'email']"))) ;

        driver.findElement(By.xpath("//input[@id= 'email']")).sendKeys(loginId);
        driver.findElement(By.xpath("//input[@id= 'password']")).sendKeys(pwd);
        driver.findElement(By.xpath("//button[@type= 'submit']")).click();
    }

    @Then("^User should be able to login successfully$")
    public void user_login_success(){

        String actualUrl = "https://www.seek.com.au/sign-in?returnUrl=%2F";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

        driver.close();
    }


}
