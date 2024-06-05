package Seminar_2.practice2.impl;

import java.util.List;

public interface MarketBehaviour {

    /**
     *
     * абстактный метод позволяющий судить о том, что покупатель вошел в магазин
     */
    void acceptToMarket(Actor actor);//входит в магазин

    /**
     *
     * абстактный метод позволяющий судить о том, что покупатель вышел из магазина
     */
    void releaseFromMarket (List<Actor> actors); //выходит из магазина

    /**
     *
     */
    void updates(); //обновление состяния

}
