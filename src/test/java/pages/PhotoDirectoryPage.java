 package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PhotoDirectoryPage {



   WebDriver driver;

   public PhotoDirectoryPage(WebDriver driver) {
       this.driver = driver;
   }

   By searchBox = By.id("wp-block-search__input-8");
   By images = By.tagName("img");

   public void searchPhoto(String name) {
       driver.findElement(searchBox).sendKeys(name);
       driver.findElement(searchBox).submit();
   }

   public boolean isImageDisplayed() {
       return driver.findElements(images).size() > 0;
   }
}