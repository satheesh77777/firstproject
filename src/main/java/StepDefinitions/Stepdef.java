package StepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;

public class Stepdef {
    private WebDriver driver;

    @Given("I navigate to webBrowser")
    public void i_navigate_to_web() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();

    }
    @When("I navigate to facebook home page")
    public void i_navigate_to_facebook_home_page() {


        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("facebook");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Adjust the timeout as needed

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")));

        element.click();
    }
    @Then("I Click on Login or sign Up")
    public void I_Click_on_Login_or_sign_Up(){
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
    }
    @When("I Enters Username and password")
    public void I_Enters_Username_and_password(){
        WebElement button = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        button.clear();
        button.sendKeys("edigasatheesh12@gmail.com");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
        password.clear();
        password.sendKeys("9550380603@dD");

    }
    @Then("I Click login button")
    public void I_Click_login_button(){
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login")));
        driver.findElement(By.name("login")).click();

    }
    @And("I close the browser")
    public void I_close_the_browser(){
        driver.close();
    }

    @When("I navigate to flipkart")
    public void i_navigate_to_flipkart() {
        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("flipkart");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Adjust the timeout as needed

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")));

        element.click();
    }
    @Then("I Click on Login")
    public void i_click_on_login() {
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/table/tbody/tr[4]/td/div/div/div/h3/a")).click();

    }
    @Then("I enters mobile number")
    public void i_enters_mobile_number() {
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input")).sendKeys("9014811077");

    }
    @Then("I Click Request otp")
    public void i_click_request_otp() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Adjust the timeout as needed

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[3]/button")));

        element.click();

//       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[3]/button")).clear();
    }



}
