package wsiiz;

public class Student extends Person {
    int indexNumber;
    String specialty;
    int collegeYear;

    public Student(String name, String surname, int age, int indexNumber, String specialty, int collegeYear) {
        super(name, surname, age);
        this.indexNumber = indexNumber;
        this.specialty = specialty;
        this.collegeYear = collegeYear;
    }

    public Student(String name, int age, int indexNumber, String specialty, int collegeYear) {
        super(name, age);
        this.indexNumber = indexNumber;
        this.specialty = specialty;
        this.collegeYear = collegeYear;
    }

    public Student(int indexNumber, String specialty, int collegeYear) {
        super();
        this.indexNumber = indexNumber;
        this.specialty = specialty;
        this.collegeYear = collegeYear;
    }

    public Student(String name, String surname, int age, int indexNumber, String specialty) {
        super(name, surname, age);
        this.indexNumber = indexNumber;
        this.specialty = specialty;
        this.collegeYear = 2022;
    }

    public void getStudentData() {
        this.getPersonData();
        System.out.println("Student at " + specialty + ", index no. " + indexNumber + ", studying since " + collegeYear);
    }
}
