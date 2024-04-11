package jrJava.accessModifiers_3_groceryStore;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GroceryStore store = new GroceryStore();
		
		//double price = store.priceOfApple;
		//int inventory = store.appleInventory;
		
		double price = store.getPriceOfApple();
		
		store.placeOrder();
		
	}

}
