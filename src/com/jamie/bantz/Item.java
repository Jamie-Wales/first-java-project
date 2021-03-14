package com.jamie.bantz;

public class Item {
    // state of an instance of item we know this because they aren't static
    int price;
    int qty;
    String name;
    Category category;

    public Item(int price, int qty) {
        this.price = price;
         this.qty = qty;
    }

    public int getPrice(){
        return price * qty;
    }

    public void addItemToCart() {
        qty++;
    }

    public void removeItemFromCart(){
        qty--;
    }

    public int getQty(){
        return qty;
    }
}
