package wsiiz.geometry;

import java.util.Scanner;

public class GeoCalculator {
    public static void start() {
        int choice;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Circle");
        System.out.println("2. Cone");
        System.out.println("3. Cube");
        System.out.println("4. Cuboid");
        System.out.println("5. Rectangle");
        System.out.println("6. Sphere");
        System.out.println("7. Square");

        while(true) {
            choice = scanner.nextInt();
            if(choice >= 1 && choice <= 7) break;
        }

        switch(choice) {
            case 1: // Circle
                int circleRadius;
                System.out.print("Input radius: ");
                circleRadius = scanner.nextInt();
                Circle circle = new Circle(circleRadius);
                System.out.println("Area: " + circle.getArea());
                System.out.println("Circumference: " + circle.getCircumference());
                break;
            case 2: // Cone
                int coneHeight, coneRadius;
                System.out.print("Input height: ");
                coneHeight = scanner.nextInt();
                System.out.print("Input radius: ");
                coneRadius = scanner.nextInt();
                Cone cone = new Cone(coneHeight, coneRadius);
                System.out.println("Area: " + cone.getArea());
                System.out.println("Volume: " + cone.getVolume());
                break;
            case 3: // Cube
                int cubeEdge;
                System.out.print("Input edge: ");
                cubeEdge = scanner.nextInt();
                Cube cube = new Cube(cubeEdge);
                System.out.println("Area: " + cube.getArea());
                System.out.println("Circumference: " + cube.getCircumference());
                break;
            case 4: // Cuboid
                int cuboidEdgeA, cuboidEdgeB, cuboidEdgeC;
                System.out.print("Input edge A: ");
                cuboidEdgeA = scanner.nextInt();
                System.out.print("Input edge B: ");
                cuboidEdgeB = scanner.nextInt();
                System.out.print("Input edge C: ");
                cuboidEdgeC = scanner.nextInt();
                Cuboid cuboid = new Cuboid(cuboidEdgeA, cuboidEdgeB, cuboidEdgeC);
                System.out.println("Area: " + cuboid.getArea());
                System.out.println("Volume: " + cuboid.getVolume());
                break;
            case 5: // Rectangle
                int rectangleEdgeA, rectangleEdgeB;
                System.out.print("Input edge A: ");
                rectangleEdgeA = scanner.nextInt();
                System.out.print("Input edge B: ");
                rectangleEdgeB = scanner.nextInt();
                Rectangle rectangle = new Rectangle(rectangleEdgeA, rectangleEdgeB);
                System.out.println("Area: " + rectangle.getArea());
                System.out.println("Circumference: " + rectangle.getCircumference());
                break;
            case 6: // Sphere
                int sphereRadius;
                System.out.print("Input radius: ");
                sphereRadius = scanner.nextInt();
                Sphere sphere = new Sphere(sphereRadius);
                System.out.println("Area: " + sphere.getArea());
                System.out.println("Volume: " + sphere.getVolume());
                break;
            case 7: // Square
                int squareEdge;
                System.out.print("Input edge: ");
                squareEdge = scanner.nextInt();
                Square square = new Square(squareEdge);
                System.out.println("Area: " + square.getArea());
                System.out.println("Circumference: " + square.getCircumference());
                break;
            default:
                System.out.println("Unknown figure");
        }
    }
}
