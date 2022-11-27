package classes.decorator;

import Interfaces.Bridge.Product;
import abstractclass.decorator.DessertToppingDecorator;

public class Caramel extends DessertToppingDecorator {
    private final String price = "15";
    private final String title = "caramel";

    public Caramel(Product dessert) {
        super(dessert);
    }

    public String getPrice() {
        return String.valueOf(Integer.parseInt(dessert.getPrice()) + Integer.parseInt(this.price));
    }

    public String getProductsList() {
        return dessert.getProductsList() + ", " + this.title;
    }
}
