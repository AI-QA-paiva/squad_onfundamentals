package org.fundamentosjava.fundamentos2.tema4Strategy;

import java.util.ArrayList;
import java.util.List;

public class InsertingProducts {

    private final List<Product> productsList = new ArrayList<>();

    public InsertingProducts() {
        Product uvShirt = new Product("Camiseta UV", "Camiseta UV com proteção solar", 79.90);
        Product beachTrunks = new Product("Sunga", "Sunga de lycra estampada forrada", 39.90);
        Product childBikini = new Product("Biquíni Infantil", "Biquíni infantil estampado", 49.90);
        Product childSwimsuit = new Product("Maiô Infantil", "Maiô infantil com proteção UV", 59.90);

        productsList.add(uvShirt);
        productsList.add(beachTrunks);
        productsList.add(childBikini);
        productsList.add(childSwimsuit);
    }

    public List<Product> getProductsList() {
        return productsList;
    }


}
