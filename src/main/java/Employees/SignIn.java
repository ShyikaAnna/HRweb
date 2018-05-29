package Employees;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignIn {
    private String userName = "user_name";
    private String password = "password";
    private String submit = "btnSubmit";
    protected WebDriver driver;
    protected WebDriverWait wait;


    public SignIn (WebDriver driver)
    {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }
    public void login()
    {
        driver.navigate().to("https://redwerk.hrweb.com/account/login.aspx");
        wait.until(presenceOfElementLocated(By.id("user_name")));

    }

    public void setUserName()
    {
        By lUserName = By.id(userName);
        driver.findElement(lUserName).sendKeys("kanvalyariya@gmail.com");
    }

    public void setPassword()
    {
        By lPassword = By.id(password);
        driver.findElement(lPassword).sendKeys("Foxtrot4");
    }

    public void setSubmit()
    {
        By lSubmit = By.id(submit);
        driver.findElement(lSubmit).click();
    }






}
