package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//complete
@Test
public class Loginwith_CredTest
{
    WebDriver driver;
    public void test() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Loginwith_Credential obj = new Loginwith_Credential(driver);
        driver.get("https://www.ebay.com/signin/");
        driver.manage().window().maximize();
        Thread.sleep(10000);
        obj.login("sharmaboymanjeet123@gmail.com","qpalzm@1MM");


    }
}

//d98e125b:g:I0IAAOSwATNeabZk&amdata=enc%3AAQAIAAAA4O%2BSsu0%2FYGgqK1Eq%2Bl3w%2FgpxrvrWcRPnE77ptRRRrBZjTN9ViCxXLXe4xZpZ7mJ1S1l02lAqft2pPvBKZzewbvM9N%2FtmkF7ns7jlnjZ4Jjtv8kz8PtpXIRqDz2MhBGmz4du47MguWuyTn4HeDhM%2B%2BPa5FbHa5xcCMbsZ5ynUCY%2B5K5DHHyTd1VVcHUayExO9X08fIsO1macXdPCC73LIbH6LH8qgP8836abYhfEI2CxycRmcF2HmJT%2F8atbwnS8pO9kNv2EHA5tIaCVIfA5aZfKMLMtbcF0Pu6rdeNd3LPg5%7Ctkp%3ABk9SR4r73aH4YQ