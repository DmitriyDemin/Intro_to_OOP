package Seminar_2.practice2;

import Seminar_2.practice2.impl.Actor;

public class Human extends Actor {
    public Human(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setMakeOrder(boolean fag) {
        this.isMakeOrder = fag;

    }
    @Override
    public void setTakeOrder(boolean fag) {
        this.isTakeOrder = fag;

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
