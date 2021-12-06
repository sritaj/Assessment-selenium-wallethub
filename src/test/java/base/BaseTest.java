package base;

import driver.Driver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setup() {
        Driver.init();
    }

//    @AfterMethod
//    public void teardown(){
//        Driver.quit();
//    }
}
