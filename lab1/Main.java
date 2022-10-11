import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String z1_imie() {
        return "Mikołaj";
    }

    public static int z1_wiek() {
        return 20;
    }

    public static void z1() {
        System.out.println(z1_imie() + ", " + z1_wiek());
    }

    public static void z2(int a, int b) {
        System.out.println("Suma: " + (a + b));
        System.out.println("Różnica: " + (a - b));
        System.out.println("Iloczyn: " + (a * b));
    }

    public static boolean z3(int a) {
        return a % 2 == 0;
    }

    public static boolean z4(int a) {
        return (a % 5 == 0) && (a % 3 == 0);
    }

    public static double z5(int a) {
        return Math.pow(a, 3);
    }

    public static double z6(int a) {
        return Math.sqrt(a);
    }

    public static boolean z7(int a, int b, int c) {
        return (
            a + b > c && // warunek trójkąta
            a + c > b &&
            b + c > a && ( // warunek trójkąta prostokątnego VVV
                Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) ||
                Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2) ||
                Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)
            )
        );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Zadanie 1 (imię, wiek) ===");
        z1();

        System.out.println("=== Zadanie 2 (suma, różnica, iloczyn) ===");
        System.out.print("Podaj 1 liczbę: ");
        int z2_a = scanner.nextInt();
        System.out.print("Podaj 2 liczbę: ");
        int z2_b = scanner.nextInt();
        z2(z2_a, z2_b);

        System.out.println("=== Zadanie 3 (czy parzysta) ===");
        System.out.print("Podaj liczbę: ");
        int z3_a = scanner.nextInt();
        System.out.println(z3(z3_a) ? "Parzysta" : "Nieparzysta");

        System.out.println("=== Zadanie 4 (czy podzielna przez 3 i 5) ===");
        System.out.print("Podaj liczbę: ");
        int z4_a = scanner.nextInt();
        System.out.println(z4(z4_a) ? "Podzielna przez 3 i przez 5" : "Niepodzielna przez 3 i przez 5");

        System.out.println("=== Zadanie 5 (do 3 potęgi) ===");
        System.out.print("Podaj liczbę: ");
        int z5_a = scanner.nextInt();
        System.out.println(z5(z5_a));

        System.out.println("=== Zadanie 6 (pierwiastek kwadratowy) ===");
        System.out.print("Podaj liczbę: ");
        int z6_a = scanner.nextInt();
        System.out.println(z6(z6_a));

        System.out.println("=== Zadanie 7 (trójkąt prostokątny) ===");
        System.out.print("Podaj przedział od: ");
        int z7_x = scanner.nextInt();
        System.out.print("Do: ");
        int z7_y = scanner.nextInt();
        int z7_diff = z7_y - z7_x;
        Random rand = new Random();
        int z7_a = rand.nextInt(z7_x + 1) + z7_diff;
        System.out.println("a = " + z7_a);
        int z7_b = rand.nextInt(z7_x + 1) + z7_diff;
        System.out.println("b = " + z7_b);
        int z7_c = rand.nextInt(z7_x + 1) + z7_diff;
        System.out.println("c = " + z7_c);
        System.out.println(z7(z7_a, z7_b, z7_c) ? "Można zbudować trójkąt prostokątny" : "Nie można zbudować trójkątu prostokątnego");
    }
}
