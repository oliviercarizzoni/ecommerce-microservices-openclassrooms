package com.ecommerce.microcommerce.service;

import com.ecommerce.microcommerce.model.Product;

import java.util.*;

public class ProductService {

    public static Map<String, Integer> calculateMargin(List<Product> produits) {

        Map<String, Integer> margeProduits = new LinkedHashMap<>();

        for (Product produit : produits) {
            margeProduits.put(produit.toString(),
                    produit.getPrix() - produit.getPrixAchat());
        }

        return margeProduits;
    }
}
