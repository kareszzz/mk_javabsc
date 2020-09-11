package hu.training360.javase.training;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Product product = new Product("tesztTermek", BigDecimal.valueOf(1), 2);
        System.out.println(product.getName());
        System.out.println(product.getNumberOfDecimals());
        System.out.println(product.getUnitWeight());
        System.out.println(product.totalWeight(2));

        PackedProduct boxedProd = new PackedProduct("csomagoltTesztTermek", BigDecimal.valueOf(2), 2);
        System.out.println(boxedProd.getName());
        System.out.println(boxedProd.getNumberOfDecimals());
        System.out.println(boxedProd.getUnitWeight());
        System.out.println(boxedProd.totalWeight(2));
    }
}
