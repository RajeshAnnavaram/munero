package com.example.munero.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.munero.model.CatalogueItem;

@Service
public class CatalogueService {
    private List<CatalogueItem> catalogue = new ArrayList<>();

    public CatalogueService() {
        // Initialize some catalogue items
        catalogue.add(new CatalogueItem("Item1", 10.0));
        catalogue.add(new CatalogueItem("Item2", 20.0));
        catalogue.add(new CatalogueItem("Item3", 30.0));
    }

    public List<CatalogueItem> getCatalogue() {
        return catalogue;
    }

    public CatalogueItem getItemByName(String name) {
        return catalogue.stream()
                       .filter(item -> item.getName().equals(name))
                       .findFirst()
                       .orElse(null);
    }
}
