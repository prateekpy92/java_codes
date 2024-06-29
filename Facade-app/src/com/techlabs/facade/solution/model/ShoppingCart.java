package com.techlabs.facade.solution.model;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<IItems> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public ShoppingCart(List<IItems> items) {
        this.cartItems = new ArrayList<>(items);
    }

    public void addItemToCart(IItems item) {
        cartItems.add(item);
    }

    public void addItemsToCart(List<IItems> items) {
        cartItems.addAll(items);
    }

    public List<IItems> getCartItems() {
        return cartItems;
    }

    public double getCartPrice() {
        double total = 0;
        for (IItems item : cartItems) {
            total += item.getItemPrice();
        }
        return total;
    }

    public void displayCart() {
        System.out.println("Item Name\tPrice");
        for (IItems item : cartItems) {
            System.out.println(item.getItemName() + "\t" + item.getItemPrice());
        }
        System.out.println("Total\t" + getCartPrice());
    }
}
