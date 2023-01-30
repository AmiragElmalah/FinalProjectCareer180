import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage
{
    private WebDriver driver;
    By MyAccountButton = By.xpath("//div//button[@data-bs-toggle='modal']");
    By CreateAccountButton =By.xpath("//div//p//a[@href='javascript:void(0)']");
    By JoinAsLearner = By.xpath("//div//div//div//div//a[@href='https://career-180.com/en/auth/register/user' ]");
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }


    public SignInPage ClickOnMyAccount()
    {
        driver.findElement(MyAccountButton).click();
        return new SignInPage(driver);
    }

/*
    public RegistrationPage ClickOnJoinAsLearnerButton()
    {
        driver.findElement(MyAccountButton).click();
        driver.findElement(CreateAccountButton).click();
        driver.findElement(JoinAsLearner).click();
        return new RegistrationPage(driver);
    }*/

}
