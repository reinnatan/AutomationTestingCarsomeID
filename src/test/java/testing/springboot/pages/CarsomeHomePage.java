package testing.springboot.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Lazy
@Component
public class CarsomeHomePage {

    @Lazy
    @Autowired
    WebDriver webDriver;

    @PostConstruct
    public void CarsomeHomePage(){
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(how = How.LINK_TEXT, using = "Di bawah Rp 100,00 jt")
    protected WebElement linkCarUnder100Million;

    @FindBy(how = How.CLASS_NAME, using = "list-card__header__total")
    protected WebElement totalResult;

    @FindBy(how =How.CLASS_NAME, using = "filter__btn-list__transmission")
    protected WebElement filterTransmition;

    @FindBy(how = How.XPATH, xpath = "//button[contains(text(), 'Otomatis')]")
    protected WebElement buttonAutomaticTransmition;

    public void clickLinkUnder100Million(){
        System.out.println("Click Link Car Under 100 Million");
        linkCarUnder100Million.click();
    }

    public void clickTotalResult(){
        System.out.println("Assertion result searching");
        int result = Integer.parseInt(totalResult.getText().replaceAll(" Hasil", ""));
        Assert.assertTrue(result > 0);
    }

    public void clickFilterTransmition(){
        System.out.println("Click filter by button transmition");
        filterTransmition.click();
    }

    public void clickAutomaticTransmition(){
        System.out.println("Click Automatic transmition");
        buttonAutomaticTransmition.click();
    }

    public void validateResultAutomaticTransmition(){
        System.out.println("Result car under 100 Mill, automatic transmition");
        int result = Integer.parseInt(totalResult.getText().replaceAll(" Hasil", ""));
        Assert.assertTrue(result == 4);
    }
}
