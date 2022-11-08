import geometry.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Zadanie L.1 (prostokąt) ===");
        Rectangle1 rect1 = new Rectangle1(3, 4);
        System.out.println("Rectangle W:" + rect1.width + " H:" + rect1.height);
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Circumference: " + rect1.getCircumference());
        System.out.println("Axis: " + rect1.getAxis());


        System.out.println("=== Zadanie L.2 (budynek) ===");
        Building b1 = new Building(LocalDate.of(1991, 4, 1), "wsiz", 3);
        b1.displayBuildingData();


        System.out.println("=== Zadanie L.3 (gatunki) ===");
        Genre cat = new Genre("cat", "felis domestic", 20, 10, "Garfield");
        System.out.println(cat.getAll());
        System.out.println(cat.getFullName());
        System.out.println(cat.getChromosomes());

        Genre notDog = cat.clone();
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
        PersonData.getPersonData();


        System.out.println("=== Zadanie K.2 (student) ===");
        Student s1 = new Student("Zdzichu", "Zdzichowski", 19, 12345, "IT", 2021);
        Student s2 = new Student("Eustachy", 21, 54321, "Cosmetics", 2019);
        Student s3 = new Student(11223, "Management", 2018);
        Student s4 = new Student("Andrzej", "Kula", 22, 32213, "Networking");

        s1.getStudentData();
        s2.getStudentData();
        s3.getStudentData();
        s4.getStudentData();


        System.out.println("=== Zadanie K.3 (wprowadź studenta) ===");
        GetStudentData.getStudentData();


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


    }
}
