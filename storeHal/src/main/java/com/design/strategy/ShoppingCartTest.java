package com.design.strategy;

public class ShoppingCartTest {

	public static void main(String[] args) {
		Item item1=new Item("item1",100);
		Item item2=new Item("item2",50);
		
		ShoppingCart cart= new ShoppingCart();
		cart.addItem(item1);
		cart.addItem(item2);
		
		//pay by credit card
		cart.pay(new CreditCardStrategy("Chandan","12345","cvv1","02/02/2022"));
		
		//pay by paypal
		cart.pay(new PaypalStrategy("magnetic.chandan@gmail.com","12345"));

	}

}
