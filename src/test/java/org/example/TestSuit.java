package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestSuit extends BaseTest{
    HomePage homePg = new HomePage();
    RegistrationPage registrationPg = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    NewsCommentPage detailPage = new NewsCommentPage();
    NewsCommentResult newsCommentResult = new NewsCommentResult();
    ComputersPage computersPage = new ComputersPage();
    DesktopResult desktopResult = new DesktopResult();
    ReferProductToFriendResultPage referProductToFriendResultPage = new ReferProductToFriendResultPage();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();




    @Test
    public void userShouldBeAbleToRegisterSuccessfully(){
        homePg.clickOnTheRegister();
        registrationPg.userEntersRegistrationDetails();
        registrationPg.clickOnRegisterButton();
        registrationResultPage.verifyUserRegisterSuccessfully();



    }
    @Test
    public void userShouldBeAbleToAddTheCommentSuccessfully(){
       homePg.clickOnTheNewsComment();
       detailPage.userShouldBeAbleToAddCommentSuccessfully();
       newsCommentResult.userShouldBeAbleToAddNewsComment();
    }


    @Test
    public void verifyUserShouldBeAbleToNavigateToDesktopPage(){
    homePg.clickOnElementComputers();
    computersPage.clickOnTheDesktopButton();
    desktopResult.clickOnDesktop();
    desktopResult.verifyUserNavigatesToDeskTopPage();
    }


    @Test
    public void verifyUserShouldReferAProductToAFriend(){
         userShouldBeAbleToRegisterSuccessfully();
         verifyUserShouldBeAbleToNavigateToDesktopPage();
        desktopResult.clickOnBuildYourOwnComputer();
        buildYourOwnComputer.verifyUserIsOnBuildYourOwncomputerPage();
        buildYourOwnComputer.clickOnEmailFriend();
        emailAFriendPage.detailsToAddForReferProduct();
        emailAFriendPage.clickOnEmailButton();
        referProductToFriendResultPage.userShouldBeAbleToSendEmailToFriendSuccessfully();

    }
}
