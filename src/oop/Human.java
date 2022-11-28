package oop;

public class Human {

    //Task1.1-1.2

    public String name;
    public String town;
    public String jobTitle;
    public int yearOfBirth;

    Human(String name, String town, String jobTitle, int yearOfBirth) {
        if (name == null || name.equals("")) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null || town.equals("")) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle == null || jobTitle.equals("")) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + " Я из города " + town + " Я родился(-лась) в "
                + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }
}