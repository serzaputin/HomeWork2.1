package oop;

public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public String country;
    public int year;

    Car(String brand, String model, int year, String country, String color, double engineVolume) {
        if (brand == null || brand.equals("")) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.equals("")) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.equals("")) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (color == null || color.equals("")) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    @Override
    public String toString() {
        return "Автомобиль " + brand + " " + model + ", " + year + " год выпуска, сборка в "
                + country + ", " + color + " цвета, объем двигателя " + engineVolume + " л";
    }
}
