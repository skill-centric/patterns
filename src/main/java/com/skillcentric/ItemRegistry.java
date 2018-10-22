package com.skillcentric;

import java.util.HashMap;
import java.util.Map;

public class ItemRegistry {

    private Map<String, Item> cache = new HashMap<>();

    public ItemRegistry() {

        loadCache();
    }

    public Item getBasicItem(String type) {

        return cache.get(type).clone();
    }

    private void loadCache() {

        Book book = new Book();
        book.setTitle("Design Patterns");
        book.setPrice(20.00);
        cache.put("Book", book);

        CD cd = new CD();
        cd.setTitle("Various");
        cd.setPrice(10.00);
        cache.put("CD", cd);
    }
}