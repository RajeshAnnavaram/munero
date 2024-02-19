package com.example.munero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.munero.model.CatalogueItem;
import com.example.munero.service.CatalogueService;
import com.example.munero.service.OrderService;
import com.example.munero.service.UserService;
@RestController
public class HomeController {

	    @Autowired
	    private UserService userService;

	    @Autowired
	    private CatalogueService catalogueService;

	    @Autowired
	    private OrderService orderService;

	    @PostMapping("/login")
	    public String login(@RequestParam String username, @RequestParam String password) {
	        if (userService.authenticate(username, password)) {
	            return "Login successful!";
	        } else {
	            return "Invalid username or password";
	        }
	    }

	    @GetMapping("/catalogue")
	    public List<CatalogueItem> getCatalogue() {
	        return catalogueService.getCatalogue();
	    }

	    @PostMapping("/order")
	    public double placeOrder(@RequestParam String itemName, @RequestParam int quantity) {
	        return orderService.placeOrder(itemName, quantity, catalogueService);
	    }
	}


