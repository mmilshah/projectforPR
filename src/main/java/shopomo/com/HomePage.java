package shopomo.com;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by VRINDA on 14/11/2016.
 */
public class HomePage extends Basepage {

    @FindBy(id = "txtSearch")
    private WebElement searchbox;

    @FindBy(className = "go")
    private WebElement searchbutton;

    @FindBy(className = "search-term")
    private WebElement searchList;

    public String currenturl() {
        return driver.getCurrentUrl();

    }

    public void searchProduct(String product) {

        searchbox.sendKeys(product);
        searchbutton.click();



    }

    public String  searchProductList() {
        return searchList.getText();


    }
}
