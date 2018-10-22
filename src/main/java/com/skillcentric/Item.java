package com.skillcentric;

// Prototype
public abstract class Item implements Cloneable {

    private String title;
    private double price;

    @Override
    public Item clone() {

        Item clonedItem = null;
        try {

            //use default object clone.
            clonedItem = (Item) super.clone();

            //specialised clone
            clonedItem.setPrice(price);
            clonedItem.setTitle(title);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clonedItem;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
