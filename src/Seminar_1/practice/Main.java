//Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
//        Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//        Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct
//        (int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
//        В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
//        Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

//*******************

/* Если я правильно понял, перегрузка Overloading выполняется в одном и том же классе просто с другими параметрами или
 * с другим их количеством. Так как ни volume, ни temperature напитка в родительском классе Product не было, и как затащить их
 * от наследника в super class VendingMashine для дальнейшего их использования в перегрузке метода getProduct я не представлял -
 * я добавил эти поля в родительский класс  */

package Seminar_1.practice;

import Seminar_1.practice.impl.BottleOfWater;
import Seminar_1.practice.impl.HotDrink;
import Seminar_1.practice.impl.HotDrinksVendingMachine;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product bottel_1 = new BottleOfWater("Родники", 55, LocalDate.of(2024,05,01));
//        Product bottel_2 = new BottleOfWater("Увинская", 65, LocalDate.of(2024, 04, 10),
//                true, Package.PLASTIC.getMaterial(), 1.5F);
//
        VendingMachine vm = new VendingMachine();
        VendingMachine hvm = new HotDrinksVendingMachine();

        HotDrink hotDrink_1 = new HotDrink("COFFEE", 80, LocalDate.now(), 75, 0.25F);
        Product hotDrink_2 = new HotDrink("LATTE", 100, LocalDate.now(), 60, 0.33F);
        Product hotDrink_3 = new HotDrink("BLACKTEA", 60, LocalDate.now(), 80, 0.25F);

        hvm.addProducts(List.of(hotDrink_1,hotDrink_1,hotDrink_2,hotDrink_3));

        System.out.println(hvm.getProduct("COFFEE", 0.25F, 75));

        System.out.println(hvm.getProducts());









    }
}
