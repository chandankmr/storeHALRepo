package com.store.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.store.dto.Company;
import com.store.dto.Item;
import com.store.service.OrderService;
@Controller
public class CompanyController {
@Autowired
private OrderService orderService;
   @RequestMapping(value = "/company/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
   @ResponseBody
   public Resource<Item> getCompany(@PathVariable(value = "id") String id) {
	   Company company = orderService.getCompany(id);
      Resource<Item> resource = new Resource(company);
      resource.add(linkTo(methodOn(CompanyController.class).getCompany(id)).withSelfRel());
      return resource;
   }
}
