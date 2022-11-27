package abstractclass.decorator;

import Interfaces.Bridge.Product;

public abstract class DessertToppingDecorator implements Product {
    protected Product dessert;

    public DessertToppingDecorator(Product dessert) {
        this.dessert = dessert;
    }

    public String getTitle() {
        return dessert.getTitle();
    }

    public String getPrice() {
        return dessert.getPrice();
    }

    public String getProductsList() {
        return dessert.getProductsList();
    }

    public String getImgUrl() {
        return dessert.getImgUrl();
    }
}
