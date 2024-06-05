package Seminar_2.practice2.impl;

public interface QueueBehaviour {

    void takeInQueue(Actor actor);
    void takeOrders(); //сделать заказ
    void giveOrders(); // забрать заказ
    void releaseFromQueue(); //выйти из очереди
}
