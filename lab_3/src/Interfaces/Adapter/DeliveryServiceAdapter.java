package Interfaces.Adapter;

import Interfaces.Bridge.Product;

import java.util.ArrayList;

public interface DeliveryServiceAdapter {
    public void placeOrder(ArrayList<Product> products);
}
