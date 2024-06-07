//Реализовать класс Market и все методы, которые он обязан реализовывать.
//Методы из интерфейса QueueBehaviour, имитируют работу очереди, MarketBehaviour – помещает и удаляет человека из очереди,
//метод update – обновляет состояние магазина (принимает и отдаёт заказы)

package Seminar_2.practice2;

import Seminar_2.practice2.impl.Actor;
import Seminar_2.practice2.impl.Product2;

import java.util.List;

public class MarketMain {
    public static void main(String[] args) {

        Market coffeeShop = new Market();
        coffeeShop.AddProducts(new Product2("coffee"));
        coffeeShop.updates(coffeeShop.getActor(), coffeeShop.getProduct());
        Human human1 = new Human("Sergey");
        Human human2 = new Human("Alexey");
        Human human3 = new Human("Maxim");
        Human human4 = new Human("Ivan");

        coffeeShop.acceptToMarket(human1);
        coffeeShop.acceptToMarket(human2);
        coffeeShop.acceptToMarket(human4);
        coffeeShop.acceptToMarket(human3);

        coffeeShop.takeOrders();

    }
}
