package seminar1;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{
    private final List<HotDrink> hotdrinks;

    public HotDrinkVendingMachine(List<HotDrink> hotdrinks) {
        this.hotdrinks = hotdrinks;
    }

    @Override
    public Cappuchino getCappuchino (String name, int temperature){
        for (HotDrink hotdrink: hotdrinks) {
            if (hotdrink instanceof Cappuchino){
                Cappuchino cap = ((Cappuchino)hotdrink);
                if (cap.name.equals(name) && cap.getTemperature() == temperature)
                    return cap;
            }
        }
        return null;
    }

    @Override
    public Latte getLatte (String name, int temperature){
        for (HotDrink hotdrink: hotdrinks) {
            if (hotdrink instanceof Latte){
                Latte cap = ((Latte)hotdrink);
                if (cap.name.equals(name) && cap.getTemperature() == temperature)
                    return cap;
            }
        }
        return null;
    }
}
