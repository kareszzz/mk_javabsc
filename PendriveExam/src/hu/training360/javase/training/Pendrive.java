package hu.training360.javase.training;

public class Pendrive {
    protected String name;
    protected int capacity;
    protected int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private Double pricePerCapacity() {

        return Double.valueOf(price / capacity);
    }

    public  boolean wichIsCheaper(Pendrive pdrv){

        return this.price < pdrv.price;
    }

    public  int compPriceCapacity(Pendrive pdrive2) {

        Double pricePerCapInit = pricePerCapacity();
        Double priceperCapAnother = pdrive2.pricePerCapacity();

        if(pricePerCapInit > priceperCapAnother)
            return 1;
        else if(pricePerCapInit < priceperCapAnother)
            return -1;

        return 0;
    }

    @Override
    public String toString() {

        String adatok = "Name: " + name + " Capacity: " + capacity + " Price: " + price;
        System.out.println("Adatok: " + adatok);

        return  adatok;

    }

    public void risePrice(int percentage) {
        Double ujAr = Double.valueOf(price) + Double.valueOf(price) * Double.valueOf(percentage) / 100;

        int newPrice = (int) Math.ceil(ujAr);

        this.price = newPrice;

        System.out.println("Az új ár: " + newPrice);
    }



}
