package driver;

import constants.FrameworkConstants;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public final class Driver {

    protected Driver() {
    }

    public static void init() {
        if (Objects.isNull(DriverManager.getDriver())) {
            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
            DriverManager.setDriver(new ChromeDriver());
            DriverManager.getDriver().manage().window().maximize();
//            DriverManager.getDriver().get("https://wallethub.com/join/light");
            DriverManager.getDriver().get("https://wallethub.com/profile/13732055i");
        }
    }

    public static void quit() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().close();
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
