package ProfileEmployee;

import Employees.SignIn;
import Employees.EmployeeProfile;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class EditPersonalInfo {
    protected WebDriver driver;
    protected SignIn signIn;
    protected EmployeeProfile employeeProfile;

    @Before
    public void beforeClass()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        ((RemoteWebDriver) driver).setLogLevel(Level.FINEST);
        driver.manage().window().maximize();
        signIn = new SignIn(driver);
        employeeProfile = new EmployeeProfile(driver);
    }

    @Test
    public void EditingPersonalInfo()
    {
        signIn.login();
        signIn.setUserName();
        signIn.setPassword();
        signIn.setSubmit();
        employeeProfile.setEditPersonInfo();
    }


}
