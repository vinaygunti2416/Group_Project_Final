package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Add_Cart_phone {
    public WebDriver driver;

    @FindBy(id = "userid")
    public WebElement usernameInput;

    @FindBy(xpath = "//button[@id='signin-continue-btn']")
    public WebElement loginbutton1;

    @FindBy(id = "pass")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@id='sgnBt']")
    public WebElement loginButton2;


    //Search box
    @FindBy(xpath = "//input[@id='gh-ac']")
    public WebElement searchbox;

    @FindBy(xpath = "//input[@id='gh-btn']")
    public WebElement searchbutton;

    @FindBy(xpath = "//li[@id='item2d8468f0e6']//div[@class='s-item__image-wrapper image-treatment']")
    public WebElement itemss;


    //itemsssssss
    @FindBy(xpath = "//select[@id='x-msku__select-box-1000']")
    public WebElement capacity;


    @FindBy(xpath = "//select[@id='x-msku__select-box-1001']")
    public WebElement colour;





    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    public WebElement Addkart;




    public Add_Cart_phone(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password) throws InterruptedException {
        Thread.sleep(20000);
        usernameInput.sendKeys(username);
        Thread.sleep(3000);
        loginbutton1.click();
        Thread.sleep(30000);
        passwordInput.sendKeys(password);
        Thread.sleep(2000);
        loginButton2.click();
        Thread.sleep(90000);

    }

    public void addcarts() throws InterruptedException {
        Thread.sleep(2000);
        searchbox.sendKeys("mobiles");
        Thread.sleep(2000);
        searchbutton.click();
        Thread.sleep(2000);

        //Scroll down
        Thread.sleep(20000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        Thread.sleep(20000);
        js.executeScript("window.scroll(0,500)");
        Thread.sleep(8000);
        itemss.click();
        Thread.sleep(50000);

        String currentHandle = driver.getWindowHandle();
        Thread.sleep(1000);
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(currentHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        Thread.sleep(1000);
        JavascriptExecutor jis=(JavascriptExecutor)driver;
        Thread.sleep(20000);
        jis.executeScript("window.scroll(0,300)");
        Thread.sleep(2000);
    }

    public void selectcapacity() throws InterruptedException {
        Thread.sleep(20000);
        Select select = new Select(capacity);
        Thread.sleep(10000);
        select.selectByValue("0");
        Thread.sleep(1000);
    }

    public void selectcolor() throws InterruptedException {
        Thread.sleep(2000);
        Select lengthSelect = new Select(colour);
        Thread.sleep(2000);
        lengthSelect.selectByValue("6");
        Thread.sleep(9000);
        Addkart.click();
        Thread.sleep(5000);
    }

}