package seminar2;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Борис");
        /*human.setMakeOrder();
        human.setTakeOrder();
        human.isMakeOrder();
        System.out.println(human.isMakeOrder());
        human.isTakeOrder();
        System.out.println(human.isTakeOrder());*/

        Market market = new Market();
        market.acceptToMarket(human);
        market.takeQueue(human);
        market.takeOrders();
        market.update();
        market.giveOrders();
        market.releaseFromQueue(human);
        market.releaseFromMarket(human);

    }
}
