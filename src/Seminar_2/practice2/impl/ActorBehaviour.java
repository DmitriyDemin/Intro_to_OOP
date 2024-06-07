package Seminar_2.practice2.impl;

public interface ActorBehaviour {


    void setMakeOrder(boolean flag);//устанавливает готовность сделать заказ
    void setTakeOrder(boolean flag);//устанавливает состояние сделанного заказа
    boolean isMakeOrder();//готов сделать заказ
    boolean isTakeOrder();//сделал заказ

}
