package Seminar_1.practice;

import java.time.LocalDate;

public class Product {

    protected String name;
    protected double price;
    protected LocalDate releaseData;
    protected float volume;
    protected int temperatureOfDrink;

    public Product(String name, double price, LocalDate releaseData) {
        this.name = name;
        this.price = price;
        this.releaseData = releaseData;
    }
    public Product() {

    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getReleaseData() {
        return releaseData;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float getVolume() {
        return volume;
    }

    public int getTemperatureOfDrink() {
        return temperatureOfDrink;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseData=" + releaseData +
                '}';
    }
}
