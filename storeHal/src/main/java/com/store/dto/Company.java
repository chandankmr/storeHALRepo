package com.store.dto;
/**
 * Manufacturer
 *
 */
public class Company {
   private final String id;
   private final String name;
   public Company(final String id, final String name) {
      this.id = id;
      this.name = name;
   }
   public String getId() {
      return id;
   }
   public String getName() {
      return name;
   }
}
