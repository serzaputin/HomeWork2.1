package oop;

import oop.Car;
import oop.Human;

public class Main {
    public static void main(String[] args) {
        System.out.println("ООП - инкапсуляция. ДЗ");


        Human maksim = new Human("Максим", "Минск", "бренд-менеджер", 1988);
        System.out.println(maksim);

        Human anya = new Human("Аня", "Москва", "методистом образовательных программ", 1993);
        System.out.println(anya);

        Human katya = new Human("Катя", "Калининград", "продакт-менеджером", 1992);
        System.out.println(katya);

        Human artem = new Human("Артем", "Москва", "директором по развитию бизнеса", 1995);
        System.out.println(artem);

        System.out.println(" ");

        Car car1 = new Car("Lada", "Granta", 2015, "России", "желтого", 1.7);
        System.out.println(car1);

        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черного", 3.0);
        System.out.println(car2);

        Car car3 = new Car("BMW", "Z8", 2015, "Германии", "черного", 3.0);
        System.out.println(car3);

        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2018, "Южной Корее", "красного", 3.0);
        System.out.println(car4);

        Car car5 = new Car("Hyundai", "Avante", 2016, "Южной Корее", "оранжевого", 1.6);
        System.out.println(car5);
    }
}