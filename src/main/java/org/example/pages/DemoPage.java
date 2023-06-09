package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoPage {
    private WebDriver driver;
    private WebDriverWait w;

    private By SearchBox = By.name("q");
    private By Search = By.name("btnK");
    private By Selenium = By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div/div/div[1]/a/h3");
    private By Apple = By.xpath("//*[@id='rso']/div[1]/div/div/div/div[1]/div/a/h3");
    private By Banana = By.xpath("//*[@id='rso']/div[1]/div/div/div/div[1]/div/a/h3");
    private By Orange = By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div/div/div[1]/div/a/h3");

    public DemoPage(WebDriver driver) {this.driver = driver;}

    public void enterSearchText(String Text){
        driver.findElement(SearchBox).sendKeys(Text);
    }
    public void clickSearch() throws InterruptedException {
        w = new WebDriverWait(driver, Duration.ofSeconds(20));
        w.until(ExpectedConditions.elementToBeClickable(Search)).click();
        Thread.sleep(3000);
    }
    public void clickSelenium(){
        w = new WebDriverWait(driver, Duration.ofSeconds(20));
        w.until(ExpectedConditions.elementToBeClickable(Selenium)).click();
    }
    public String validatePageTitle(){
        return driver.getTitle();
    }
    public void clickOnFruitWikipediaLink(String fruit){
        if(fruit.equalsIgnoreCase("Apple Fruit")){
            w = new WebDriverWait(driver, Duration.ofSeconds(20));
            w.until(ExpectedConditions.elementToBeClickable(Apple)).click();
        } else if (fruit.equalsIgnoreCase("Banana Fruit")){
            w = new WebDriverWait(driver, Duration.ofSeconds(20));
            w.until(ExpectedConditions.elementToBeClickable(Banana)).click();
        } else if (fruit.equalsIgnoreCase("Orange Fruit")){
            w = new WebDriverWait(driver, Duration.ofSeconds(20));
            w.until(ExpectedConditions.elementToBeClickable(Orange)).click();
        }
    }
    public String validateTheWikipediaPageTitle(){
        return driver.getTitle();
    }
}
