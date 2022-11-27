package classes.decorator;

import Interfaces.Bridge.Product;
import abstractclass.decorator.DessertToppingDecorator;

public class Chocolate extends DessertToppingDecorator {
    private final String price = "10";
    private final String title = "chocolate";

    public Chocolate(Product dessert) {
        super(dessert);

        System.out.println("Adding chocolate");
    }


    public String getPrice() {
        return String.valueOf(Integer.parseInt(dessert.getPrice()) + Integer.parseInt(this.price));
    }

    public String getProductsList() {
        return dessert.getProductsList() + ", " + this.title;
    }

}
