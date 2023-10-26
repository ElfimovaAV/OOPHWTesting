package seminar2;

public interface MarketBehaviour {
    void acceptToMarket(Human humans); //приход покупателей
    void releaseFromMarket (Human humans); //уход покупателей
    void update(); // обновление магазина
}
