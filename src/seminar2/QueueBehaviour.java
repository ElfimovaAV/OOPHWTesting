package seminar2;

public interface QueueBehaviour {
    void takeQueue(Human humans); // помещение в очередь
    void takeOrders(); // принятие заказа
    void giveOrders(); // отдача заказа
    void releaseFromQueue(Human humans); // освобождение из очереди
}
