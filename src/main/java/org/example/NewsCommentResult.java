package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;

//create class news comment result for assert purpose
public class NewsCommentResult extends Utils{

    public void userShouldBeAbleToAddNewsComment(){
        String actualResult = getTextFromElement(By.xpath("//div[@class='result']"));
        String expectedResult = "News comment is successfully added.";
        //verifying the actual requirement and check if test case is pass or fail
        Assert.assertTrue(actualResult.equals(expectedResult),"News comment is not added.");
    }

    }

