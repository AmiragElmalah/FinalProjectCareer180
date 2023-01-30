import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class RegistrationPage
{
    private WebDriver driver;
    By FirstName = By.xpath("(//div[@class='row'] /div /input[@type='text'])[1]");
    By LastName = By.xpath("(//div[@class='row'] /div /input[@type='text'])[2]");
    By PhoneNumber = By.xpath("(//div[@class='row'] /div /input[@type='text'])[3]");
    By Email = By.xpath("(//div[@class='row'] /div /input[@type='email'])");
    By Password =By.xpath("(//div[@class='row'] /div /input[@type='password'])");
    By Gender = By.xpath("(//div[@class='row'] /div /select[@class='form-control form-select'])[1]");
    By Country = By.xpath("(//div[@class='row'] /div /select[@class='form-control form-select'])[2]");
    By RegisterButton = By.xpath("//button[@class='btn btn-primary']");
    By SignInLink = By.xpath("//a[@href='https://career-180.com/en/auth/login']");

    Select select;
    public RegistrationPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public  void ScrollDown()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",driver.findElement(SignInLink));
    }
    public void enterFirstName(String firstName)
    {
        driver.findElement(FirstName).sendKeys(firstName);
    }
    public void enterLastName(String lastName)
    {
        driver.findElement(LastName).sendKeys(lastName);
    }
    public void enterPhoneNumber(String phone)
    {
        driver.findElement(PhoneNumber).sendKeys(phone);
    }
    public void enterEmail(String email)
    {
        driver.findElement(Email).sendKeys(email);
    }
    public void enterPassword(String password)
    {
        driver.findElement(Password).sendKeys(password);
    }
    public void ChooseGender(String gender)
    {
        select = new Select(driver.findElement(Gender));
        select.selectByVisibleText(gender);
    }
    public void ChooseCountry(String country)
    {
        select = new Select(driver.findElement(Country));
        select.selectByVisibleText(country);
    }

    public MYProfilePage ClickOnRegisterButton()
    {
        driver.findElement(RegisterButton).click();
        return new MYProfilePage(driver);
    }

}
