package shopomo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by VRINDA on 14/11/2016.
 */
public class ProductPage extends Basepage {

   // @FindAll ( "product-img") --> @FindAll for array is not working please suggest with the correct code

    @FindAll({@FindBy(className = "product-img" )})
    public List<WebElement> resultElements;

    @FindBy(css = ".colour-size-select>select")
    private WebElement selectsizedrpdwn;

        public void selectProduct() {
            System.out.println(resultElements.size());
            //WebElement productCountSize = resultElements.get(resultElements.size()-1);
            WebElement productCountSize = resultElements.get(2);
            productCountSize.click();

    }

    public void selectsize(String size) {
        WebElement sizedropdown = selectsizedrpdwn;
        Select sizeDropDownValue= new Select(sizedropdown);
        sizeDropDownValue.selectByVisibleText(size);
}

}
