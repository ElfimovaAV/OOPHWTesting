package seminar1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrink cappuchino1 = new Cappuchino("Cappuchino", 50, 50);
        HotDrink cappuchino2 = new Cappuchino("Cappuchino with sugar", 55, 50);
        HotDrink cappuchino3 = new Cappuchino("Cappuchino with double sugar", 60, 29);
        HotDrink latte1 = new Latte("Latte", 100, 55);
        HotDrink latte2 = new Latte("Latte with sugar", 105, 54);
        HotDrink latte3 = new Latte("Latte with vanilla", 120, 40);

        List<HotDrink> hotDrinkList= new ArrayList<>();
        hotDrinkList.add(cappuchino1);
        hotDrinkList.add(cappuchino2);
        hotDrinkList.add(cappuchino3);
        hotDrinkList.add(latte1);
        hotDrinkList.add(latte2);
        hotDrinkList.add(latte3);

        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine(hotDrinkList);

        Cappuchino capRes = vendingMachine.getCappuchino("Cappuchino with sugar", 50);
        if (capRes != null){
            System.out.println("You bought: ");
            System.out.println(capRes.displayInfo());
        }
        else {
            System.out.println("There is no such cappuchino in the vending machine.");
        }

        Latte latRes = vendingMachine.getLatte("Latte with vanilla", 40);
        if (latRes  != null){
            System.out.println("You bought: ");
            System.out.println(latRes .displayInfo());
        }
        else {
            System.out.println("There is no such latte in the vending machine.");
        }

        Cappuchino capRes1 = vendingMachine.getCappuchino("Cappuchino with sugar", 45);
        if (capRes1 != null){
            System.out.println("You bought: ");
            System.out.println(capRes1.displayInfo());
        }
        else {
            System.out.println("There is no such cappuchino in the vending machine.");
        }
    }
}