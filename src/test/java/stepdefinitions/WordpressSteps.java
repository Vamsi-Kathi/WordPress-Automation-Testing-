package stepdefinitions;

import base.BaseClass;
import pages.*;
import io.cucumber.java.en.*;
import org.testng.Assert;


public class WordpressSteps extends BaseClass {

   HomePage home;
   DownloadPage download;
   PhotoDirectoryPage photo;

   @Given("User launches WordPress site")
   public void launch_site() {
       setup();
       home = new HomePage(driver);
       download = new DownloadPage(driver);
       photo = new PhotoDirectoryPage(driver);
   }

   @Then("Verify the title of the page")
   public void verify_title() {
       String actualTitle = driver.getTitle();
       Assert.assertTrue(actualTitle.contains("WordPress"));
   }

   @When("User mouse over Download and click Get WordPress")
   public void click_download() {
       home.mouseOverDownload();
       home.clickGetWordpress();
   }

   @Then("Verify Get WordPress text")
   public void verify_text() {
       Assert.assertEquals(download.getHeadingText(), "Get WordPress");
   }

   @When("User click Community and Photo Directory")
   public void click_photo_directory() {
       home.clickCommunity();
       home.clickPhotoDirectory();
   }

   @And("User search for any photo")
   public void search_photo() {
       photo.searchPhoto("nature");
   }

   @Then("Verify pictures are displayed")
   public void verify_images() {
       Assert.assertTrue(photo.isImageDisplayed());
       tearDown();
   }
}
