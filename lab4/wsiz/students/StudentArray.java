package wsiiz.students;

import wsiiz.Student;

import java.util.Scanner;

public class StudentArray {
    Student[] students = new Student[100];
    boolean[] initialized = new boolean[100];
    private Scanner scanner = new Scanner(System.in);

    public StudentArray() {
        for (int i = 0; i < 100; i++) {
            students[i] = new Student("", "", 0, 0, "", 0);
            initialized[i] = false;
        }
    }

    public void createStudent() {
        System.out.print("Adding new student\nInput index number (0-99): ");
        int index = scanner.nextInt();
        if(index < 0 || index > 99) throw new IllegalArgumentException("Value must be between 0-99");

        if(!initialized[index]) {
            initialized[index] = true;
            modifyStudent(index);
        }
        else System.out.println("Student already exists at index " + index + ", can't create");
    }

    public void editStudent() {
        System.out.print("Editing student\nInput index number (0-99): ");
        int index = scanner.nextInt();
        if(index < 0 || index > 99) throw new IllegalArgumentException("Value must be between 0-99");

        if(initialized[index]) modifyStudent(index);
        else System.out.println("Student doesn't exist at index " + index + ", can't modify");
    }

    private void modifyStudent(int index) {
        String name, surname, specialty;
        int age, indexNumber, collegeYear;

        System.out.print("Input new name: ");
        name = scanner.next();
        System.out.print("Input new surname: ");
        surname = scanner.next();
        System.out.print("Input new age: ");
        age = scanner.nextInt();
        System.out.print("Input new index number: ");
        indexNumber = scanner.nextInt();
        System.out.print("Input new specialty: ");
        specialty = scanner.next();
        System.out.print("Input new college year: ");
        collegeYear = scanner.nextInt();

        students[index] = new Student(name, surname, age, indexNumber, specialty, collegeYear);
    }

    public void deleteStudent() {
        System.out.print("Deleting student\nInput index number (0-99): ");
        int index = scanner.nextInt();
        if(index < 0 || index > 99) throw new IllegalArgumentException("Value must be between 0-99");

        if(initialized[index]) {
            students[index] = new Student("", "", 0, 0, "", 0);
            initialized[index] = false;
        } else System.out.println("Student doesn't exist");
    }

    public void getStudent() {
        System.out.print("Getting student\nInput index number (0-99): ");
        int index = scanner.nextInt();
        if(index < 0 || index > 99) throw new IllegalArgumentException("Value must be between 0-99");

        if(initialized[index]) obtainStudent(index);
        else System.out.println("Student doesn't exist");
    }

    public void getAllStudents() {
        for(int i = 0; i < 100; i++) obtainStudent(i);
    }

    public void getStudentsBetween() {
        System.out.print("Gettings students between\nInput first index number (0-99): ");
        int indexOne = scanner.nextInt();
        if(indexOne < 0 || indexOne > 99) throw new IllegalArgumentException("Value must be between 0-99");
        System.out.print("Input second index number (" + (indexOne + 1) + "-99): ");
        int indexTwo = scanner.nextInt();
        if(indexTwo < indexOne || indexTwo > 99) throw new IllegalArgumentException("Value must be between " + (indexOne + 1) + "-99");

        for(int i = indexOne; i <= indexTwo; i++) obtainStudent(i);
    }

    private void obtainStudent(int index) {
        System.out.print("Info for student " + index + ": ");
        students[index].getStudentData();
    }
}
