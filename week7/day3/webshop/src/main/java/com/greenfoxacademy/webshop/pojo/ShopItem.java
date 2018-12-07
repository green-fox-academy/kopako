package com.greenfoxacademy.webshop.pojo;

import java.util.Objects;

public class ShopItem {
    private String name;
    private String description;
    private long price;
    private int quantityOfStock;

    public ShopItem() {
    }

    public ShopItem(String name, String description, long price, int quantityOfStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getQuantityOfStock() {
        return quantityOfStock;
    }

    public void setQuantityOfStock(int quantityOfStock) {
        this.quantityOfStock = quantityOfStock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopItem shopItem = (ShopItem) o;
        return price == shopItem.price &&
                quantityOfStock == shopItem.quantityOfStock &&
                Objects.equals(name, shopItem.name) &&
                Objects.equals(description, shopItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, price, quantityOfStock);
    }

    @Override
    public String toString() {
        return "ShopItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantityOfStock=" + quantityOfStock +
                '}';
    }
}
