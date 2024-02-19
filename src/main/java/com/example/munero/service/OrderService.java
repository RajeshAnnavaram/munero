package com.example.munero.service;

import org.springframework.stereotype.Service;
import com.example.munero.model.CatalogueItem;

@Service
public class OrderService {
    public double placeOrder(String itemName, int quantity, CatalogueService catalogueService) {
        CatalogueItem item = catalogueService.getItemByName(itemName);
        if (item == null) {
            throw new IllegalArgumentException("Invalid item name");
        }
        return item.getPrice() * quantity;
    }
}
