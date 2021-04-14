package com.kodilla.testing2.facebook;

import com.kodilla.testing2.google.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FacebookTestingApp {
    public static final String XPATH_ACCEPT_COOKIES = "//div[contains(@class, \"_9o-r\")]/button[2]"; 
    public static final String XPATH_CREATE_ACCOUNT = "//div[contains(@class, \"_6ltg\")]/a[1]"; 
    public static final String XPATH_DAY =  "//*[@id='day']"; 
    public static final String XPATH_MONTH =  "//select[contains(@id, \"month\")]"; 
    public static final String XPATH_YEAR =  "//select[contains(@id, \"year\")]"; 

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com");

        WebElement acceptCookies = driver.findElement(By.xpath(XPATH_ACCEPT_COOKIES));
        acceptCookies.click();

        WebElement createAccount = driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT));
        createAccount.click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        while (!driver.findElement(By.xpath(XPATH_DAY)).isDisplayed());

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_DAY));
        Select selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(10);

        selectCombo = driver.findElement(By.xpath(XPATH_MONTH));
        selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(10);

        selectCombo = driver.findElement(By.xpath(XPATH_YEAR));
        selectBoard = new Select(selectCombo);
        selectBoard.selectByValue("1986");
    }
}
