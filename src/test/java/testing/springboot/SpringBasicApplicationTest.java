package testing.springboot;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import testing.springboot.pages.CarsomeHomePage;


@SpringBootTest
//@ComponentScan({"testing.springboot.pages"})
public class SpringBasicApplicationTest {

    @Autowired
    WebDriver webDriver;

    @Autowired
    CarsomeHomePage carsomeHomePage;

    @Test
    void testSelectCarUnder100Mill(){
        webDriver.navigate().to("https://www.carsome.id/");
        carsomeHomePage.clickLinkUnder100Million();
        carsomeHomePage.clickTotalResult();
        carsomeHomePage.clickFilterTransmition();
        carsomeHomePage.clickAutomaticTransmition();
        carsomeHomePage.validateResultAutomaticTransmition();
    }
}
