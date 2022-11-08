package geometry;

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
            case 1:

        }
    }
}
