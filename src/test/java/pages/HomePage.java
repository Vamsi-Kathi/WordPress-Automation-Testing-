package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class HomePage {


   WebDriver driver;

   public HomePage(WebDriver driver) {
       this.driver = driver;
   }
       
   By downloadExtend = By.linkText("Extend");
   By getWordpress = By.linkText("Get WordPress");
   By community = By.linkText("Community");
   By photoDirectory = By.linkText("Photo Directory");

   public void mouseOverDownload() {
       Actions act = new Actions(driver);
       act.moveToElement(driver.findElement(downloadExtend)).perform();
   }

   public void clickGetWordpress() {
       driver.findElement(getWordpress).click();
   }

   public void clickCommunity() {
       driver.findElement(community).click();
   }

   public void clickPhotoDirectory() {
       driver.findElement(photoDirectory).click();
   }
}