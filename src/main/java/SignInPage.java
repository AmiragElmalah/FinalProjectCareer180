import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private WebDriver driver;
    By Emailfield = By.xpath("//input[@type='email']");
    By Passwordfield = By.xpath("//input[@type='password']");
    By LogInButton = By.xpath("//button[@class='btn btn-primary']");
    public SignInPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void EnterEmail(String email)
    {
        driver.findElement(Emailfield).sendKeys(email);
    }
    public void EnterPassword(String password)
    {
        driver.findElement(Passwordfield).sendKeys(password);
    }
    public UserAccount ClickOnLogInButton()
    {
        driver.findElement(LogInButton).click();
        return new UserAccount(driver);
    }

}
