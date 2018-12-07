package com.greenfoxacademy.webshop.pojo;

import java.util.ArrayList;
import java.util.List;

//Singleton
public class ItemsSingleton {

    private static List<ShopItem> INSTANCE;

    private ItemsSingleton() {
    }

    public static List<ShopItem> getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ArrayList<ShopItem>();
        }

        return INSTANCE;
    }

    public void addItem(ShopItem shopItem) {
        if (shopItem != null) {
            INSTANCE.add(shopItem);
        }
    }
}

