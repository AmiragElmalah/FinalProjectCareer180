import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases
{
    private WebDriver driver ;
    HomePage homePage;
    RegistrationPage registrationPage;
    SignInPage signInPage;

    @BeforeTest
    public void setup()
    {
        driver = new ChromeDriver();
        driver.get("https://career-180.com/en/home");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    /*   @Test
    public void myAccount()
    {
        registrationPage = homePage.ClickOnJoinAsLearnerButton();
        registrationPage.enterFirstName("Reem");
        registrationPage.enterLastName("Mousa");
        registrationPage.ChooseGender("Female");
        registrationPage.enterPhoneNumber("018787644598739");
        registrationPage.ChooseCountry("Egypt");
        registrationPage.enterEmail("reemmousa5fh4fg47@gmail.com");
        registrationPage.enterPassword("123456Reem");
        //علشان ينزل لاخر الشاشة
        registrationPage.ScrollDown();
        registrationPage.ClickOnRegisterButton();
    }*/


    @Test
    public void myAccount1()
    {
        signInPage = homePage.ClickOnMyAccount();
        signInPage.EnterEmail("reemmousa5fh4fg47@gmail.com");
        signInPage.EnterPassword("123456Reem");
        signInPage.ClickOnLogInButton();
    }


    @AfterTest
    public void Close()
    {
        driver.quit();
    }








}
