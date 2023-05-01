package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//complete
@Test
public class Watchlist_Items_Test {
    WebDriver driver;
    public void test() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        WatchList_Items obj = new WatchList_Items(driver);
        driver.get("https://www.ebay.com/signin/");
        driver.manage().window().maximize();
        Thread.sleep(50000);
        obj.login("sharmaboymanjeet123@gmail.com","qpalzm@1MM");
        obj.addcarts();
        obj.selectGreen();
        obj.selectLength();
    }
}