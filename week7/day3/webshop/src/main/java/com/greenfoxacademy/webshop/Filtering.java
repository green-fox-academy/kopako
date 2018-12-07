package com.greenfoxacademy.webshop;

import com.greenfoxacademy.webshop.pojo.ShopItem;

import java.util.List;

//It contains basic links for filtering:
public interface Filtering {

    //List only available
    List<ShopItem> available();

    //Order by the cheapest first
    List<ShopItem> cheapestFirst();

    //List only those what contain "nike" in the name or description
    List<ShopItem> containNike();

    //Show the average of the stock
    List<ShopItem> average();

    //Show the most expensive available item's name
    List<ShopItem> expensiveFirst();

}
