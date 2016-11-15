package shopomo.com;

import Utils.AutomationConstant;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by VRINDA on 14/11/2016.
 */
public class MyStepdefs {
    HomePage hp = new HomePage();
    ProductPage pp = new ProductPage();

    @Given("^User is in the homepage$")
    public void userIsInTheHomepage() {

            String currentUrlText = hp.currenturl();
            Assert.assertEquals(AutomationConstant.URL, currentUrlText);
        }

        @When("^User search for products \"([^\"]*)\"$")
        public void userSearchForProducts (String product){

            hp.searchProduct(product);

        }


    @Then("^User should be able to see the list of searched product \"([^\"]*)\"$")
    public void userShouldBeAbleToSeeTheListOfSearchedProduct(String product)  {

        String searchProduct = hp.searchProductList();
        Assert.assertEquals(product,searchProduct);
    }



    @When("^User selects the desire product$")
    public void userSelectsTheDesireProduct()  {

        pp.selectProduct();

    }

    @And("^User selects the \"([^\"]*)\"$")
    public void userSelectsThe(String size)  {

        pp.selectsize(size);




    }
}
