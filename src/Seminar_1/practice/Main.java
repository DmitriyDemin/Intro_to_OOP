//Задача 1 - Абстракция
//Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы
//initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)


package Seminar_1.practice;

import Seminar_1.practice.impl.BottleOfWater;
import Seminar_1.practice.impl.Package;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product bottel_1 = new BottleOfWater("Родники", 55, LocalDate.of(2024,05,01));
        Product bottel_2 = new BottleOfWater("Увинская", 65, LocalDate.of(2024, 04, 10),
                true, Package.PLASTIC.getMaterial(), 1.5F);

        VendingMachine vm = new VendingMachine();

        System.out.println(vm.getProducts());
        vm.addProducts(List.of(bottel_1,bottel_1,bottel_1,bottel_2,bottel_2));
        System.out.println(vm.getProducts());
        vm.getProduct("Родники");
        System.out.println(vm.getProducts());




    }
}
