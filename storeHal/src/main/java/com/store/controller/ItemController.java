package com.store.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.store.dto.Item;
import com.store.service.OrderService;
@Controller
public class ItemController {
@Autowired
private OrderService orderService;
   @RequestMapping(value = "/items", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
   @ResponseBody
   public Collection<Resource<Item>> getAllItems() {
      Collection<Item> items = orderService.getAllItems();
      List<Resource<Item>> resources = new ArrayList<>();
      for (Item item : items) {
         resources.add(getItemResource(item));
      }
      return resources;
   }
   @RequestMapping(value = "/item/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
   @ResponseBody
   public Resource<Item> getItem(@PathVariable(value = "id") String id) {
      Item item = orderService.getItem(id);
      return getItemResource(item);
   }
   
   private Resource<Item> getItemResource(Item item) {
      Resource<Item> resource = new Resource<Item>(item);
      // Link to Item
      resource.add(linkTo(methodOn(ItemController.class).getItem(item.getId())).withSelfRel());
      // Link to Company
      resource.add(linkTo(methodOn(CompanyController.class).getCompany(item.getCompany().getId())).withRel("company"));
      // Option to purchase Item
      if (item.getStockLevel() > 0) {
          resource.add(linkTo(methodOn(ItemController.class).purchaseItem(item.getId())).withRel("item.purchase"));
      }
      return resource;
   }
   
   @RequestMapping(value = "/item/purchase/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
   @ResponseBody
   public Resource<Item> purchaseItem(@PathVariable(value = "id") String id) {
	   Item item = orderService.getItem(id);
	   item.setStockLevel(item.getStockLevel() - 1);
      Resource<Item> resource = new Resource<Item>(item);
      resource.add(linkTo(methodOn(ItemController.class).getItem(id)).withSelfRel());
      return resource;
   }
}
