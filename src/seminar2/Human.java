package seminar2;

public class Human extends Actor implements ActorBehaviour {
    @Override
    String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setMakeOrder() {
        isMakeOrder = true;
        System.out.println("Заказ принят");
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
        System.out.println("Заказ выдан");
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}
