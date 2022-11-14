package wsiiz;

public class Person {
    String name, surname;
    int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.surname = "Kowalski";
        this.age = age;
    }

    public Person() {
        this.name = "Jan";
        this.surname = "Kowalski";
        this.age = 20;
    }

    public void getPersonData() {
        System.out.println(name + " " + surname + ", age " + age);
    }
}
