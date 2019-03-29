package com.sspart.Seleniumclas;

import org.testng.Assert;

import com.sspart.pages.Home;
import com.sspart.pages.Product;
import com.sspart.pages.ProductSearch;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class ProductSearchStepDef {

	Home home = new Home();
	ProductSearch productsearch = new ProductSearch();
	Product product = new Product();
	static String productname = " ";
	
	@Then("^I will navigate to amazon home Page$")
	public void i_will_navigate_to_amazon_home_Page() throws Throwable {
	    
	    home.navigatetoHome();
	    
	}

	@Then("^I will search a product \"([^\"]*)\"$")
	public void i_will_search_a_product(String productquery) throws Throwable {
		
		home.searchProduct(productquery);
	    
	}

	@Then("^I will verify whether \"([^\"]*)\" is available or not and select it$")
	public void i_will_verify_whether_is_available_or_not_and_select_it(String productname) throws Throwable {
	    
		Assert.assertTrue(productsearch.verifyProductSearchResult(productname));
	    productsearch.selectProduct(productname);
	    product.switchToProduct(productname);
	    this.productname = productname;
	}

	@Then("^I will print the product price$")
	public void i_will_print_the_product_price() throws Throwable {
	    product.printPrice();
	    product.switchBack(productname);
		
	}
}
