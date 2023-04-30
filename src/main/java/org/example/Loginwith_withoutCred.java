package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginwith_withoutCred
{

    public WebDriver driver;
    @FindBy(xpath = "//button[@id='signin-continue-btn']")
    public WebElement loginbutton1;
    public Loginwith_withoutCred(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clik()
    {
        loginbutton1.click();
    }

}

