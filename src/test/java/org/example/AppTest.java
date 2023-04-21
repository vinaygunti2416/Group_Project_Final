package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest {

    public WebDriver driver;

    @BeforeClass
    public void setUp() throws  InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        Thread.sleep(10000);
    }

    @Test
    public void testDropdown() throws InterruptedException {
        WebElement dropdown = driver.findElement(By.id("dropdowm-menu-1"));
        Select select = new Select(dropdown);

        select.selectByVisibleText("Python");
        Thread.sleep(4000);
        select.selectByVisibleText("TestNG");
        Thread.sleep(4000);
        select.selectByVisibleText("JavaScript");
        Thread.sleep(3000);


    }

    @Test
    public void testCheckboxes() throws InterruptedException {
        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("input[value='option-2']")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("input[value='option-3']")).click();

    }

    @Test
    public void testRadioButtons()  throws InterruptedException
    {
        driver.findElement(By.cssSelector("input[value='yellow']")).click();
        Thread.sleep(2000);
    }
//
//@AfterClass
//    public void closing()
//    {
//        driver.close();
//    }

}
