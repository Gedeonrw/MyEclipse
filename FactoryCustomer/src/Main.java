

import models.*;

public class Main {

	public static void main(String[] args) {
		
		//Create new customer
		Customer cust = CustShopFactory.createCustomer("Bob");
		cust.getCart().addItem(CustShopFactory.createItem("Shoe"));
		cust.getCart().addItem(CustShopFactory.createItem("other"));
		
		
		System.out.println(cust.getCart().getItems());
		
		//Cannot create Customer or ShoppingCart directly from Main
		//Customer c = new Customer("Bob") //compiler error
		//ShoppingCart s = new ShoppingCart();  //compiler error
		

	}

}
