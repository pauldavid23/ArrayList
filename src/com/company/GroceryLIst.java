package com.company;

import java.util.ArrayList;

public class GroceryLIst {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printOutGrocery() {
        System.out.println("The items are: " + groceryList.size() + " in your shopping cart.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyItems (int position, String newItem) {
        groceryList.set(position,newItem);
        System.out.println("Grocery item" + (position+1) + " has been modified!");
    }

    public void removeGroceryItem (int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }
}
