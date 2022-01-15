package org.example;

import org.openqa.selenium.By;

//create home page class for all actions in homepage for testing requirements
public class HomePage extends Utils
{
    By _clickOnNewsComment = By.xpath("//div[@class='master-wrapper-page']/div[3]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[2]/div[3]/a[1]");
    By _clickOnRegisterButton = By.linkText("Register");
    By _clickOnElementElectronics = By.linkText("Electronics");
    public void clickOnTheRegister(){
    clickOnElement(_clickOnRegisterButton);

    }
    public void clickOnTheNewsComment(){
    clickOnElement(_clickOnNewsComment);

    }
    public void clickOnElementComputers(){
        clickOnElement(By.linkText("Computers"));
    }

    public void clickOnElementElectronics(){
        clickOnElement(_clickOnElementElectronics);
    }

}
