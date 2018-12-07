package com.greenfoxacademy.webshop;

import com.greenfoxacademy.webshop.pojo.ShopItem;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FilteringImpl implements Filtering {

    public FilteringImpl() {
    }



    @Override
    public List<ShopItem> available(List<ShopItem> items) {
        return items.stream()
                .filter(a -> a.getQuantityOfStock()>0)
                .collect(toList());
    }

    @Override
    public List<ShopItem> cheapestFirst(List<ShopItem> items) {
        return items.stream()
                .sorted(Comparator.comparing(ShopItem::getPrice))
                .collect(toList());
    }

    @Override
    public List<ShopItem> containNike(List<ShopItem> items) {
        return items.stream()
                .filter(a->a.getDescription().toLowerCase().contains("nike"))
                .collect(toList());
    }

    @Override
    public double average(List<ShopItem> items) {
        return items.stream()
                .mapToDouble(ShopItem::getQuantityOfStock).sum()/items.size();
    }

    @Override
    public List<ShopItem> expensiveFirst(List<ShopItem> items) {

        return items.stream()
                .sorted((a,b)-> (int) ((b.getPrice()-a.getPrice())*100))
                .collect(toList());
    }
}
