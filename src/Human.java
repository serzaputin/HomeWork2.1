public class Human {

    //Task1.1-1.2

    String name;
    String town;
    String jobTitle;
    int yearOfBirth;

    Human(String name) {
        this.name = name;
    }

    void Human() {
        System.out.println("Привет! Меня зовут " + name + " Я из города " + town + " Я родился(-лась) в "
                + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
}