package utilities;

import org.testng.annotations.Test;

public class test extends DriverSetup{
    @Test
    public  void test1() throws InterruptedException{
        getDriver().get("https://www.google.com");
        Thread.sleep(2000);

    }
}
