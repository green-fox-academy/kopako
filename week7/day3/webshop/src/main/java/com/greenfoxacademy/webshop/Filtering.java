package com.greenfoxacademy.webshop;

import com.greenfoxacademy.webshop.pojo.ShopItem;

import java.util.List;

//It contains basic links for filtering:
public interface Filtering {

    //List only available
    List<ShopItem> available(List<ShopItem> items);

    //Order by the cheapest first
    List<ShopItem> cheapestFirst(List<ShopItem> items);

    //List only those what contList<ShopItem> items);

    List<ShopItem> containNike(List<ShopItem> items);

    //Show the average of the stock
    double average(List<ShopItem> items);

    //Show the most expensive available item's name
    List<ShopItem> expensiveFirst(List<ShopItem> items);

}
