package Employees;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmployeesList {
    protected WebDriver driver;
    protected WebDriverWait wait;
    private String empLink = "//*[@id='ctl00_ctl00_ctl00_MasterBody_SubMasterBody_ContentPlaceHolder_gridView']/tbody/tr[$s]/td[1]/a";
    private String shiftStatus = "//a[contains(@id,'lnkShift')]";

    public EmployeesList(WebDriver driver)
    {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public boolean hasShiftStatus()
    {
        By lShiftStatus = By.xpath(shiftStatus);
        return driver.findElement(lShiftStatus).isDisplayed();
    }

}
