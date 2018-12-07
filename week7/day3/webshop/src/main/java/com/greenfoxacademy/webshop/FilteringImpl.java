package com.greenfoxacademy.webshop;

import com.greenfoxacademy.webshop.pojo.ShopItem;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class FilteringImpl implements Filtering {
    List<ShopItem> items;

    public FilteringImpl() {
    }

    public FilteringImpl(List<ShopItem> items) {
        this.items = items;
    }

    public List<ShopItem> getItems() {
        return items;
    }

    public void setItems(List<ShopItem> items) {
        this.items = items;
    }

    @Override
    public List<ShopItem> available() {
        return items.stream()
                .filter(a -> a.getQuantityOfStock()>0)
                .collect(toList());
    }

    @Override
    public List<ShopItem> cheapestFirst() {
        return items.stream()
                .sorted(Comparator.comparing(o->o.getPrice()))
                .collect(toList());
    }

    @Override
    public List<ShopItem> containNike() {
        return items.stream()
                .filter(a->a.getDescription().contains("nike"))
                .collect(toList());
    }

    @Override
    public List<ShopItem> average() {
//        TODO: what is average?
        return null;
    }

    @Override
    public List<ShopItem> expensiveFirst() {

        return items.stream()
                .sorted((a,b)-> (int) ((b.getPrice()-a.getPrice())*100))
                .collect(toList());
    }

    @Override
    public String toString() {
        return "FilteringImpl{" +
                "items=" + items +
                '}';
    }
}
