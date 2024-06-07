package Seminar_2.practice2.impl;

import java.util.List;

public interface MarketBehaviour {

    void acceptToMarket(Actor actor);//абстактный метод позволяющий судить о том, что покупатель вошел в магазин

    void releaseFromMarket (List<Actor> actors); //абстактный метод позволяющий судить о том, что покупатель вышел из магазина

    void updates(List<Actor> actors, List<Product2> products); //обновление состяния, размер очереди, количество оставшейся продукции, скорее всего будет принимать список продуктов
}
