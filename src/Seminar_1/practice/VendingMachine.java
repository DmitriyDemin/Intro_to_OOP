package Seminar_1.practice;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }
    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProducts(List<Product> products){
        this.products.addAll(products);

    }

    public Product getProduct(String name){
        for (Product product: products){
            if (product.getName().equals(name)){
                Product result = product;
                products.remove(product);
                return result;
            }
        }
//        throw new RuntimeException("No such product: " + name);
        System.out.println("No such product: " + name);
        return null;
    }

}
