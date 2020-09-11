package hu.training360.javase.training;

import java.security.KeyStore;
import java.util.List;

public class Pendrives {

    public Pendrive best(List<Pendrive> pendrives) {
        Pendrive min = pendrives.get(0);
        for (int i = 0; i < pendrives.size(); i++) {
            if (min.compPriceCapacity(pendrives.get(i)) == 1) {
                min = pendrives.get(i);
            }
        }
        return min;
    }

    public Pendrive cheapest(List<Pendrive> pendrives) {
        Pendrive minim = pendrives.get(0);
        for (int i = 0; i < pendrives.size(); i++) {
            if (pendrives.get(i).wichIsCheaper(minim)) {
                minim = pendrives.get(i);
            }
        }

        return minim;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity) {
        for (Pendrive p : pendrives) {
            if (p.getCapacity() == capacity) {
                p.risePrice(percent);
            }
        }
    }


}
