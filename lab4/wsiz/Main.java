package wsiiz;

import wsiiz.geometry.*;
import wsiiz.students.StudentArray;

import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Zadanie L.1 (prostokąt) ===");
        wsiiz.Rectangle1 rect1 = new wsiiz.Rectangle1(3, 4);
        System.out.println("Rectangle W:" + rect1.width + " H:" + rect1.height);
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Circumference: " + rect1.getCircumference());
        System.out.println("Axis: " + rect1.getAxis());


        System.out.println("=== Zadanie L.2 (budynek) ===");
        wsiiz.Building b1 = new wsiiz.Building(LocalDate.of(1991, 4, 1), "wsiiz", 3);
        b1.displayBuildingData();


        System.out.println("=== Zadanie L.3 (gatunki) ===");
        wsiiz.Genre cat = new wsiiz.Genre("cat", "felis domestic", 20, 10, "Garfield");
        System.out.println(cat.getAll());
        System.out.println(cat.getFullName());
        System.out.println(cat.getChromosomes());

        wsiiz.Genre notDog = cat.clone();
        System.out.println(notDog.getAll());
        System.out.println(notDog.getFullName());
        System.out.println(notDog.getChromosomes());
        notDog.typeName = "dog";
        notDog.genreName = "dogus domesticus";
        notDog.desc = "Pluto";
        System.out.println(notDog.getAll());
        System.out.println(notDog.getFullName());
        System.out.println(notDog.getChromosomes());


        System.out.println("=== Zadanie K.1 (osoba) ===");
        wsiiz.PersonData.getPersonData();


        System.out.println("=== Zadanie K.2 (student) ===");
        wsiiz.Student s1 = new wsiiz.Student("Zdzichu", "Zdzichowski", 19, 12345, "IT", 2021);
        wsiiz.Student s2 = new wsiiz.Student("Eustachy", 21, 54321, "Cosmetics", 2019);
        wsiiz.Student s3 = new wsiiz.Student(11223, "Management", 2018);
        wsiiz.Student s4 = new wsiiz.Student("Andrzej", "Kula", 22, 32213, "Networking");

        s1.getStudentData();
        s2.getStudentData();
        s3.getStudentData();
        s4.getStudentData();


        System.out.println("=== Zadanie K.3 (wprowadź studenta) ===");
        wsiiz.GetStudentData.getStudentData();


        System.out.println("=== Zadanie K.4 (figury) ===");
        System.out.println("Circle");
        Circle circle = new Circle(4);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());

        System.out.println("Cone");
        Cone cone = new Cone(4, 2);
        System.out.println(cone.getArea());
        System.out.println(cone.getVolume());

        System.out.println("Cube");
        Cube cube = new Cube(4);
        System.out.println(cube.getArea());
        System.out.println(cube.getCircumference());

        System.out.println("Cuboid");
        Cuboid cuboid = new Cuboid(4, 5, 6);
        System.out.println(cuboid.getArea());
        System.out.println(cuboid.getVolume());

        System.out.println("Rectangle");
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getCircumference());

        System.out.println("Sphere");
        Sphere sphere = new Sphere(4);
        System.out.println(sphere.getArea());
        System.out.println(sphere.getVolume());

        System.out.println("Square");
        Square square = new Square(4);
        System.out.println(square.getArea());
        System.out.println(square.getCircumference());


        System.out.println("=== Zadanie K.4* (kalkulator geometryczny) ===");
        GeoCalculator.start();


        System.out.println("=== Zadanie K.5 (studenty w tablicy) ===");
        StudentArray sa = new StudentArray();
        sa.createStudent();
        sa.createStudent();
        sa.createStudent();
        sa.editStudent();
        sa.deleteStudent();
        sa.getStudent();
        System.out.println("Press Enter to get all students...");
        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sa.getAllStudents();
        sa.getStudentsBetween();
    }
}
