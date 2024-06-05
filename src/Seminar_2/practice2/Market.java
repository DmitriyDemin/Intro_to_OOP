package Seminar_2.practice2;

import Seminar_2.practice2.impl.Actor;
import Seminar_2.practice2.impl.MarketBehaviour;
import Seminar_2.practice2.impl.QueueBehaviour;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {

    private List<Actor> actors = new ArrayList<Actor>();


    @Override
    public void acceptToMarket(Actor actor) {
        actors.add(actor);

    }
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        actors.remove(0);

    }
    @Override
    public void updates() {


    }
    @Override
    public void takeInQueue(Actor actor) {

    }
    @Override
    public void takeOrders() {

    }
    @Override
    public void giveOrders() {

    }
    @Override
    public void releaseFromQueue() {

    }
}
