package Employees;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmployeeProfile {
    private String editPersonInfoLink = "//a[contains(@id,'PersonalInformation_GridHeader_lnkEdit')]";
    private String editContactInfo = "//a[contains(@id,'ContactInformation_GridHeader_lnkEdit')]";
    private String employmentInfo = "//a[contains(@id,'EmploymentInformation_GridHeader_lnkEdit')]";
    private String emergencyInfo = "//a[contains(@id,'EmergencyInfo_GridHeader_lnkEdit')]";
    protected WebDriver driver;
    protected WebDriverWait wait;

    public EmployeeProfile(WebDriver driver)
    {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void setEditPersonInfo()
    {
        By lEditPersonalInfoLink = By.xpath(editPersonInfoLink);
        driver.findElement(lEditPersonalInfoLink).click();
    }
    public void setEditContactInfo()
    {
        By lEditContactInfo = By.xpath(editContactInfo);
        driver.findElement(lEditContactInfo).click();
    }
    public void setEmploymentInfo()
    {
        By lEditEmploymentInfo = By.xpath(employmentInfo);
        driver.findElement(lEditEmploymentInfo).click();
    }
    public void setEmergencyInfo()
    {
        By lEditEmergeencyInfo = By.xpath(emergencyInfo);
        driver.findElement(lEditEmergeencyInfo).click();
    }

}
