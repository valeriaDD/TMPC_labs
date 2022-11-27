package classes.adapter;

import Interfaces.Adapter.DeliveryServiceAdapter;
import Interfaces.Bridge.Product;
import Services.GlovoDeliveryService;

import java.util.ArrayList;


public class DeliveryService implements DeliveryServiceAdapter {
    GlovoDeliveryService glovo = new GlovoDeliveryService();

    @Override
    public void placeOrder(ArrayList<Product> products) {
        ArrayList<String> productsToString = new ArrayList<>();

        products.forEach(product -> {
            productsToString.add(product.getTitle());
        });

        glovo.placeOrder(productsToString, "18:00");
    }
}
