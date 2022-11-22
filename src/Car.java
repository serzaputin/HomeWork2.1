public class Car {

    //Task3

    String brand;
    String model;
    String engineVolume;
    String color;
    String country;
    int year;

    public void Car() {
        System.out.println("Автомобиль " + brand + model + ", " + year + " год выпуска, сборка в " + country + ", "
                + color + " цвета, объем двигателя " + engineVolume);
    }
}