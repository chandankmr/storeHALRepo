package com.design.strategy;

public class Item {
String itemId;
int price;
public Item(String itemId, int price) {
	//super();
	this.itemId = itemId;
	this.price = price;
}
public String getItemId() {
	return itemId;
}
public int getPrice() {
	return price;
}


}
