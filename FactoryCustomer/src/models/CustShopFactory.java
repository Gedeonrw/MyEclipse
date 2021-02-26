package models;

public class CustShopFactory {
	public static Customer createCustomer(String name) {
		return new Customer(name);
	}
	public static Item createItem(String name) {
		return new Item(name);
	}
}
