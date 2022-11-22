public class Main {
    public static void main(String[] args) {
        System.out.println("ООП - Введение. ДЗ");

        //Task1-2

        Human maksim = new Human();
        maksim.name = "Максим";
        maksim.town = "Минск";
        maksim.yearOfBirth = 1988;
        maksim.jobTitle = "бренд-менеджером";
        maksim.Human();

        Human anya = new Human();
        anya.name = "Аня";
        anya.town = "Москва";
        anya.yearOfBirth = 1993;
        anya.jobTitle = "методистом образовательных программ";
        anya.Human();

        Human katya = new Human();
        katya.name = "Катя";
        katya.town = "Калининград";
        katya.yearOfBirth = 1992;
        katya.jobTitle = "продакт-менеджером";
        katya.Human();

        Human artem = new Human();
        artem.name = "Артем";
        artem.town = "Москва";
        artem.yearOfBirth = 1995;
        artem.jobTitle = "директором по развитию бизнеса";
        artem.Human();
        System.out.println(" ");

        //Task3
        Car car1 = new Car();
        car1.brand = "Lada";
        car1.model = "Granta";
        car1.engineVolume = "1.7 л";
        car1.color = "желтого";
        car1.country = "России";
        car1.year = 2015;
        car1.Car();

        Car car2 = new Car();
        car2.brand = "Audi";
        car2.model = "A8 50 L TDI quattro";
        car2.engineVolume = "3,0 л";
        car2.color = "черного";
        car2.country = "Германии";
        car2.year = 2020;
        car2.Car();

        Car car3 = new Car();
        car3.brand = "BMW";
        car3.model = "Z8";
        car3.engineVolume = "3,0 л";
        car3.color = "черного";
        car3.country = "Германии";
        car3.year = 2015;
        car3.Car();

        Car car4 = new Car();
        car4.brand = "Kia";
        car4.model = "Sportage 4-го поколения";
        car4.engineVolume = "2,4 л";
        car4.color = "красного";
        car4.country = "Южной Корее";
        car4.year = 2018;
        car4.Car();

        Car car5 =new Car();
        car5.brand = "Hyundai";
        car5.model = "Avante";
        car5.engineVolume = "1,6 л";
        car5.color = "оранжевого";
        car5.country = "Южной Корее";
        car5.year = 2016;
        car5.Car();
    }
}