package shopomo.com;

import Utils.BrowserFactoryManager;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by VRINDA on 14/11/2016.
 */
public class Basepage extends BrowserFactoryManager
{
    Basepage(){
        PageFactory.initElements(driver, this);// to initialise the page factory and looks for all the elements in particular page

    }
}
