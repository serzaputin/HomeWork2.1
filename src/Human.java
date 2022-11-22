public class Human {

    //Task1-2

    String name;
    String town;
    String jobTitle;
    int yearOfBirth;

    Human(String name, String town, int yearOfBirth, String jobTitle) {
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;
        this.yearOfBirth = yearOfBirth;
    }

    void Human() {
        System.out.println("Привет! Меня зовут " + name + " Я из города " + town + " Я родилась(лся) в " + yearOfBirth
                + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
}