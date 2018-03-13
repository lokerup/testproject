
import org.openqa.selenium.support.events.EventFiringWebDriver;
import pages.DashboardPage;
import pages.LoginPage;

public class Main extends  BaseTest{

    public static void main(String[] args) throws InterruptedException {

        EventFiringWebDriver driver = getConfiguredDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.fillEmailInput();
        loginPage.fillPassInput();
        loginPage.clickLoginBtn();

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.moveToOrdersItem();
        dashboardPage.addCategory();
        dashboardPage.SaveCategoryBtn();
        dashboardPage.filterName();

        quiteDriver(driver);
    }
}

