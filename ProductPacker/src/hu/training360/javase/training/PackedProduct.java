package hu.training360.javase.training;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PackedProduct extends Product {

    private int packingUnit;
    private BigDecimal weightOfBox;


    public PackedProduct(String name, BigDecimal unitWeight) {
        super(name, unitWeight);
    }

    public PackedProduct(String name, BigDecimal unitWeight, int numberOfDecimals) {
        super(name, unitWeight, numberOfDecimals);
    }

    @Override
    public BigDecimal totalWeight(int pieces) {
        int boxesNum = 0; //metódus változó

        if(pieces % packingUnit == 0){
            boxesNum = pieces / packingUnit;
        }
        else {
            boxesNum = pieces / packingUnit + 1;
        }

        BigDecimal tw = super.totalWeight(pieces);
        BigDecimal boxNum= (BigDecimal.valueOf(boxesNum)) ;

        return tw.add(boxNum).setScale(getNumberOfDecimals(), RoundingMode.HALF_UP);

    }
}
