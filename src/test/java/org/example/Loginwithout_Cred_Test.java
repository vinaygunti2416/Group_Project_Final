package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginwithout_Cred_Test
{
    WebDriver driver;
    @Test
    public void Test() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Loginwith_withoutCred obj = new Loginwith_withoutCred(driver);
        driver.get("https://www.ebay.com/signin/");
        driver.manage().window().maximize();
        Thread.sleep(10000);
        obj.clik();

    }
}