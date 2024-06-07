package Seminar_2.practice2.impl;

public abstract class Actor implements ActorBehaviour {

    protected String name;
    protected boolean isMakeOrder;//состояние "готов сделать заказ"
    protected boolean isTakeOrder;//состояние "сделал заказ"

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();


}
