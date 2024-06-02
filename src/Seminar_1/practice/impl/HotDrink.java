package Seminar_1.practice.impl;

import Seminar_1.practice.Product;

import java.time.LocalDate;

public class HotDrink extends Product {

    private String pack;


    public HotDrink(String name, double price, LocalDate releaseData, int temperatureOfDrink, float volume) {
        super(name, price, releaseData);
        this.temperatureOfDrink = temperatureOfDrink;
        this.pack = Package.PAPER_CUP.getMaterial();
        this.volume = volume;
    }



    @Override
    public String toString() {
        return "HotDrink{" + " name=" + name + '\t'+
                ", price=" + price + '\t'+
                ", pack='" + pack + '\t'+
                ", releaseData=" + releaseData + '\t'+
                ", temperatureOfDrink=" + temperatureOfDrink +'}'+'\n';
    }
}
