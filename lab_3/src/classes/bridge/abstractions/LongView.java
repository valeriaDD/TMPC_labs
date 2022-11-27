package classes.bridge.abstractions;

import abstractclass.bridge.View;

public class LongView extends View {
    @Override
    public String generate() {
        return product.getTitle() + "\n" + product.getProductsList() + "\n Price: " + product.getPrice() ;
    }
}
