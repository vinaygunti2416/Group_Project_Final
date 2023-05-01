package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Loginwith_Incorrectcred_Test
{
    WebDriver driver;
    public void test() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Loginwith_IncorrectCred obj = new Loginwith_IncorrectCred(driver);
        Thread.sleep(1000);
        driver.get("https://www.ebay.com/signin/");
        driver.manage().window().maximize();
        Thread.sleep(20000);
        obj.login("wfwhfb@gmail.com","wdniwd");

    }
}