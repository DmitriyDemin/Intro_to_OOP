package Seminar_2.practice2;

import Seminar_1.practice.Product;
import Seminar_2.practice2.impl.Actor;
import Seminar_2.practice2.impl.MarketBehaviour;
import Seminar_2.practice2.impl.Product2;
import Seminar_2.practice2.impl.QueueBehaviour;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {

    private List<Actor> actors = new ArrayList<Actor>();
    private List<Product2> products = new ArrayList<Product2>();
    private List<Actor> queue = new ArrayList<Actor>();

    public List<Actor> getActor(){
        return actors;
    }
    public List<Product2> getProduct(){
        return products;

    }
    public void AddProducts(Product2 product){
        products.add(product);
    }

    public void autoAddProducts() {
        if (products.size() == 0) {
            products.addAll(List.of(new Product2("coffee"), new Product2("coffee")));
        }
    }

    @Override
    public void acceptToMarket(Actor actor) {
        actors.add(actor);
        System.out.println("В магазин вошел" + " " + actor.getName());
        takeInQueue(actor);
    }
    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + " " + "встал в очередь");
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (!actor.isTakeOrder()) {//если не сделал заказ
                actor.setMakeOrder(true);//значит готов сделать заказ и делает его
                System.out.println(actor.getName() + " " + "сделал заказ");
            }
        }
        giveOrders();
    }

    @Override
    public void giveOrders() {
        for(Actor actor: queue){
            if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " " + " получил свой заказ");
                products.remove(0);
                autoAddProducts();
            }
            updates(actors, products);
        }
        releaseFromQueue();
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> receivedActors = new ArrayList<>();
        for(Actor actor: queue){
            if(actor.isTakeOrder()){
                receivedActors.add(actor);
                System.out.println(actor.getName() + " " + " вышел из очереди");
            }
        }
        releaseFromMarket(receivedActors);

    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        List<Actor> actors2 = new ArrayList<Actor>();
        actors2.addAll(actors);
        for(Actor actor: actors){
        System.out.println(actor.getName() + " " + "вышел из магазина" );
            actors2.remove(0);
            updates(actors2, products);
        }

    }

    @Override
    public void updates(List<Actor> actors, List<Product2> products) {
        System.out.println("для продажи доступно: " + products.size() + " " + (products.get(0)).getName());
        System.out.println("в магазине находится: " + actors.size() + " " + "чел");
    }

}
