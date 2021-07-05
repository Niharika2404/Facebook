package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Base {

    @FindBy(id = "email")
    WebElement EmailAddress;

    @FindBy(id = "pass")
    WebElement Password;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")
    WebElement Login;

    public Login (WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    public void login() throws InterruptedException {

        EmailAddress.sendKeys("niharikagarnaik@gmail.com");
        Password.sendKeys("Niharikang@24");
        Login.click();

        Thread.sleep(5000);
    }
}
