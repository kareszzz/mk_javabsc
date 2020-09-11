package hu.training360.javase.training;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pendrive pd = new Pendrive("A-data", 64,13200);//jo draga
        Pendrive pd2 = new Pendrive("Kingston", 64,15600);

        System.out.println(pd.toString());

        pd.risePrice(10);

        System.out.println("Emelt áron: " + pd.toString());

        List<Pendrive> plist = new ArrayList<>();
        plist.add(pd);
        plist.add(pd2);

        Pendrives pdrvs = new Pendrives();
        Pendrive olcsobbprdv = pdrvs.cheapest(plist);
        olcsobbprdv.toString();
    }
}
