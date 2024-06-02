package Seminar_1.practice.impl;

import Seminar_1.practice.Product;

import java.time.LocalDate;

public class BottleOfWater extends Product {
    private float volume;
    private String pack;
    private boolean IsSpark;


    public BottleOfWater(String name, double price, LocalDate releaseData) {
        super(name, price, releaseData);
        this.IsSpark = false;
        this.volume = 1;
        this.pack = Package.PLASTIC.getMaterial();
    }
    public BottleOfWater(String name, double price, LocalDate releaseData, boolean spark, String pack, float volume) {
        super(name, price, releaseData);
        this.IsSpark = false;
        this.volume = volume;
        this.pack = pack;
    }


    public float getVolume() {
        return volume;
    }

    public String getPack() {
        return pack;
    }

    public boolean isSpark() {
        return IsSpark;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseData=" + releaseData +
                "volume=" + volume +
                ", pack='" + pack + '\'' +
                ", IsSpark=" + IsSpark +
                '}';
    }
}
