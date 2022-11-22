import java.lang.invoke.StringConcatException;

public class Car {

    //Task3

    String brand;
    String model;
    String engineVolume;
    String color;
    String country;
    int year;

    Car(String brand, String model, int year, String country, String color, String engineVolume){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    public void Car() {
        System.out.println("Автомобиль " + brand + " " + model + ", " + year + " год выпуска, сборка в " + country + ", "
                + color + " цвета, объем двигателя " + engineVolume);
    }
}