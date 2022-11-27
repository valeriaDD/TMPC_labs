package classes.bridge.implementations;

import Interfaces.Bridge.Product;

public class Drink implements Product {
    private final String title;
    private final String price;
    private final String description;
    private final String imgUrl;

    public Drink(String title, String price, String description, String imgUrl) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.imgUrl = imgUrl;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getPrice() {
        return this.price;
    }

    @Override
    public String getProductsList() {
        return this.description;
    }

    @Override
    public String getImgUrl() {
        return this.imgUrl;
    }
}
