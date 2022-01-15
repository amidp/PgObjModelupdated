package org.example;
import org.openqa.selenium.By;

//create new class newscomment page for news comeent requirement
public class NewsCommentPage extends HomePage{
        //create object for relevant actions
        By _titleType = By.id("AddNewComment_CommentTitle");
        By _commentType =By.id("AddNewComment_CommentText");
        By _clickOnNewComment = By.xpath("//div[@class='buttons']/button");

        public void userShouldBeAbleToAddCommentSuccessfully(){
            typeText(_titleType,"This is new comment.");
            typeText(_commentType,"This website is very useful.");
            clickOnElement(_clickOnNewComment);


        }



 }


