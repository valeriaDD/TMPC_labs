package classes.bridge.abstractions;

import abstractclass.bridge.View;

public class Preview extends View {
    @Override
    public String generate() {
        return product.getTitle() + "\n Only for: " + product.getPrice();
    }
}
