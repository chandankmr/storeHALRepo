package com.store.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

import com.store.dto.Company;
import com.store.dto.Item;
/**
 * Hard coded simulation of a Service + Data Access Layer.
 */
@Service
public class OrderService {
   private Map<String, Company> companies;
   private Map<String, Item> items;
   /**
    * Constructor populates the 'database' (i.e. Maps) of Artists and Items.
    */
   public OrderService() {
      companies = new HashMap<>();
      items = new HashMap<>();
      
      Company wockhardt = new Company("wockhardt", "Wockhardt");
      Company cipla = new Company("cipla", "Cipla");
      
      companies.put(wockhardt.getId(), wockhardt);
      companies.put(cipla.getId(), cipla);
      
      Item item1 = new Item("1", "Albendazole", wockhardt, 20);
      Item item2 = new Item("2", "Tinidazole", wockhardt, 34);
      Item item3 = new Item("3", "Omni Gel", cipla, 18);
      Item item4 = new Item("4", "Cipcal Syrup", cipla, 67);
      
      items.put(item1.getId(), item1);
      items.put(item2.getId(), item2);
      items.put(item3.getId(), item3);
      items.put(item4.getId(), item4);
   }
   
   public Collection<Item> getAllItems() {
      return items.values();
   }
   public Item getItem(final String id) {
      return items.get(id);
   }
   public Company getCompany(final String id) {
      return companies.get(id);
   }
}
