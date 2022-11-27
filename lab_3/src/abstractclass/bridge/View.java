package abstractclass.bridge;

import Interfaces.Bridge.Product;

public abstract class View {
    protected Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public abstract String generate();
}
