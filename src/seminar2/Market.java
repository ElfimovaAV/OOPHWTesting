package seminar2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Market implements MarketBehaviour, QueueBehaviour {
    List<Human> humans = new ArrayList<>();
    Queue<Actor> actors = new ArrayDeque();
    @Override
    public void acceptToMarket(Human humans) {
        System.out.println(humans.getName() + " пришел в магазин");
    }

    @Override
    public void releaseFromMarket(Human humans) {
        System.out.println(humans.getName() + " ушел из магазина");
    }

    @Override
    public void update() {
        System.out.println("Проверка и обработка заказов...");
    }

    @Override
    public void takeQueue(Human humans) {
        this.actors.add(humans);
        System.out.println(humans.getName() + " занял очередь");
    }

    @Override
    public void takeOrders() {
        System.out.println(this.actors.peek().getName() + " сделал заказ");
        this.actors.peek().setMakeOrder();
    }

    @Override
    public void giveOrders() {
        System.out.println(this.actors.peek().getName() + " забрал заказ");
        this.actors.peek().setTakeOrder();
    }

    @Override
    public void releaseFromQueue(Human humans) {
        this.actors.remove(humans);
        System.out.println(humans.getName() + " ушел из очереди");
    }
}
