package properties;


import org.openqa.selenium.remote.BrowserType;

public class Properties {
    private static final String DEFAULT_BASE_ADMIN_URL = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
    private static final String DEFAULT_BROWSER = BrowserType.CHROME;

    public static String getBaseAdminUrl() {
        return System.getProperty(EnviromentVariables.BASE_ADMIN_URL.toString(), DEFAULT_BASE_ADMIN_URL);
    }

    public static String getBrowser(){
        return System.getProperty(EnviromentVariables.BROWSER.toString(), DEFAULT_BROWSER);

    }
}

