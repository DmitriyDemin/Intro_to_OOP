package Seminar_2.practice2.impl;

public class Product2 {

    public String name;
    public float volume;
    public float price;

    public Product2(String name) {
        this.name = name;
        this.volume = 0.33F;
        this.price = 130F;

    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  "name=" + name + '\t'+
                ", price=" + price +" руб"+'\t'+
                ", pack=" + volume + '\t'+'\n';
    }
}
