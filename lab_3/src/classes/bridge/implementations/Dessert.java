package classes.bridge.implementations;

import Interfaces.Bridge.Product;

public class Dessert implements Product {

    private final String title;
    private final String price;
    private final String productList;
    private final String imgUrl;

    public Dessert(String title, String price, String productList, String imgUrl) {
        this.title = title;
        this.price = price;
        this.productList = productList;
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
        return this.productList;
    }

    @Override
    public String getImgUrl() {
        return this.imgUrl;
    }
}
