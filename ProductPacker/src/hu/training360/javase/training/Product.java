package hu.training360.javase.training;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {

    private String name;

    private BigDecimal unitWeight;

    private int numberOfDecimals;

    public Product(String name, BigDecimal unitWeight) {

        this(name, unitWeight, 2);
    }

    public Product(String name, BigDecimal unitWeight, int numberOfDecimals) {

        this.name = name;
        this.unitWeight = unitWeight;
        this.numberOfDecimals = numberOfDecimals;
    }

    public BigDecimal totalWeight(int pieces) {

        BigDecimal totalW = unitWeight.multiply(new BigDecimal(String.valueOf((pieces)))).setScale(numberOfDecimals, RoundingMode.HALF_UP);

        return totalW;
    }


    public String getName() {

        return name;
    }

    public BigDecimal getUnitWeight() {
        return unitWeight;
    }

    public int getNumberOfDecimals() {
        return numberOfDecimals;
    }


}
