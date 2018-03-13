package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class DashboardPage {
    private EventFiringWebDriver driver;

            private By addCategoryBtn = By.id("page-header-desc-category-new_category");
            private By nameCategory = By.id("name_1");
            private By filterNameField = By.name("categoryFilter_name");
            private By searchFilterBtn = By.id ("submitFilterButtoncategory");

            public DashboardPage(EventFiringWebDriver driver) {
                this.driver = driver;
            }

           public void SaveCategoryBtn() {
               WebDriverWait wait = new WebDriverWait(driver, 10);
               WebElement saveBtn = driver.findElement(By.id("category_form_submit_btn"));
               Actions actions = new Actions(driver);
               actions.moveToElement(saveBtn).build().perform();
               saveBtn.click();
           }

       public void moveToOrdersItem() {
           WebDriverWait wait = new WebDriverWait(driver, 10);
           WebElement orderTableElement = driver.findElement(By.id("subtab-AdminCatalog"));
           Actions actions = new Actions(driver);
           actions.moveToElement(orderTableElement).build().perform();
           orderTableElement.findElements(By.cssSelector("li")).get(1).click();
       }

       public void addCategory(){
                driver.findElement(addCategoryBtn).click();
                driver.findElement(nameCategory).sendKeys("MyCar");

       }

       public void filterName(){
                driver.findElement(filterNameField).sendKeys("MyCar");
                driver.findElement(searchFilterBtn).click();

       }
}
