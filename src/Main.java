public class Main {
    public static void main(String[] args) {
        System.out.println("ООП - Введение. ДЗ");

        //Task1-2

        Human maksim = new Human("Максим","Минск",1988,"бренд-менеджером" );
        maksim.Human();

        Human anya = new Human("Аня","Москва",1993,"методистом образовательных программ");
        anya.Human();

        Human katya = new Human("Катя","Калининград",1992,"продакт-менеджером");
        katya.Human();

        Human artem = new Human("Артем","Москва",1995,"директором по развитию бизнеса");
        artem.Human();
        System.out.println(" ");

        //Task3
        Car car1 = new Car("Lada","Granta",2015,"России","желтого","1.7 л");
        car1.Car();

        Car car2 = new Car("Audi","A8 50 L TDI quattro",2020,"Германии","черного","3,0 л");
        car2.Car();

        Car car3 = new Car("BMW","Z8",2015,"Германии","черного","3,0 л");
        car3.Car();

        Car car4 = new Car("Kia","Sportage 4-го поколения",2018,"Южной Корее","красного","2,4 л");
        car4.Car();

        Car car5 =new Car("Hyundai","Avante",2016,"Южной Корее","оранжевого","1,6 л");
        car5.Car();

    }
}