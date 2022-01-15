package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils{
    By _clickOnCameraAndPhotos = By.linkText("Camera & photo");

    public void clickOnCameraAndPhoto(){
        clickOnElement(_clickOnCameraAndPhotos);
    }
}
