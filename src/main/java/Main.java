import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Main {
     public static void main(String[] args) {
         WebDriver driver = initChromeDriver();
         driver.get("http://clients.qatestlab.com/login");
        Thread();
             WebElement login = driver.findElement(By.name("loginv2"));
             login.sendKeys("0960500871");
             WebElement password = driver.findElement(By.name("passwordv2"));
             password.sendKeys("348294josbone");
             driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div/div/div[2]/form/div/div[3]/button")).click();//loginButton
         Thread();
              driver.findElement(By.xpath("//*[@id=\"am-navbar-collapse\"]/ul[1]/li/a")).click();//MyProfile
         Thread();
              driver.findElement(By.linkText("Мой профиль")).click();
         Thread();
              driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/nav[1]/div/a[1]")).click();//right-slidebar
         Thread();
               driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/nav[2]/div/div[2]/ul/li[2]/a")).click(); //FAQ
               driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/nav[1]/div/a[1]")).click();//right-slidebar
         Thread();
                driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/nav[1]/div/div[1]/a[2]")).click();//logo
         Actions actions = new Actions(driver);
         Thread();
                 actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/div[1]/ul/li[2]/a/span"))).build().perform();//MyCourses
                 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/div[1]/ul/li[2]/ul/li[2]/div/div[1]/ul/li[2]/a")).click();//Ending courses
         Thread();
                   driver.findElement(By.xpath("//*[@id=\"am-navbar-collapse\"]/ul[1]/li/a")).click();
                   driver.findElement(By.linkText("Выйти")).click();

                   driver.quit();

     }

public static void Thread () {
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
     public static WebDriver initChromeDriver(){
         System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/drivers/chromedriver.exe");
         ChromeOptions options = new ChromeOptions();
         options.addArguments("--start-maximized");
         return new ChromeDriver(options);

     }
}
