package com.store.dto;

/**
 * Item (available to purchase - hence 'stockLevel' attribute).
 *
 */
public class Item {
   private final String id;
   private final String name;
   private final Company company;
   private int stockLevel;
   public Item(final String id, final String name, final Company company, int stockLevel) {
      this.id = id;
      this.name = name;
      this.company = company;
      this.stockLevel = stockLevel;
   }
   public String getId() {
       return id;
   }
   public String getName() {
       return name;
   }
   public Company getCompany() {
      return company;
   }
   public int getStockLevel() {
      return stockLevel;
   }
   public void setStockLevel(int stockLevel) {
      this.stockLevel = stockLevel;
   }
}
