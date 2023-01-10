package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GoogleSearchforHomeWork {

    private WebDriver driver;

    public GoogleSearchforHomeWork(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(name="q")
    private WebElement searchghw;
    public void searchForhw (String keyhw){
        searchghw.sendKeys(keyhw);
    }
    public void searchEnter(){
        searchghw.sendKeys(Keys.ENTER);
    }
}
