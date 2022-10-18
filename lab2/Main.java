import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void z1() {
        int n, a = 0, b = 10;
        double suma = 0, pkt, ile = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę studentów: ");
        n = scanner.nextInt();

        if(n > 0) {
            while(n > 0) {
                System.out.print("Podaj ilość pkt (0-10):");
                pkt = scanner.nextDouble();

                if(pkt >= a && pkt <= b) {
                    suma += pkt;
                    ile++;
                    n--;
                }
            }

            System.out.println("Ile: " + ile);
            System.out.println("Suma: " + suma);
            System.out.println("Średnia: " + (suma / ile));
        } else {
            System.out.println("Ilość studentów musi być liczbą > 0");
        }
    }

    public static double z2_wczytaj() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        return a;
    }

    public static void z2() {
        double sumaUjemne = 0, sumaDodatnie = 0, ileUjemnych = 0, n;
        for(int i = 1; i <= 10; i++) {
            System.out.print("Podaj " + i + " liczbę: ");
            n = z2_wczytaj();

            if(n < 0) {
                sumaUjemne += n;
                ileUjemnych++;
            } else {
                sumaDodatnie += n;
            }
        }

        System.out.println("Ujemnych: " + ileUjemnych);
        System.out.println("Suma dodatnich: " + sumaDodatnie);
        System.out.println("Suma ujemnych: " + sumaUjemne);
    }

    public static void z3() {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Podaj n: ");
        n = scanner.nextInt();

        int x, sumaParzyste = 0;
        for(int i = 1; i <= n; i++) {
            System.out.print(i + ": ");
            x = scanner.nextInt();

            if(x % 2 == 0) {
                sumaParzyste += x;
            }
        }

        System.out.println("Suma parzyste: " + sumaParzyste);
    }

    public static void z4() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int a = -10, b = 45, x, sumaParzystych = 0;

        System.out.print("Podaj n: ");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++) {
            x = rand.nextInt(b - a + 1) + a;
            System.out.println(i + ". " + x);
            if(x % 2 == 0) {
                sumaParzystych += x;
            }
        }

        System.out.println("Suma parzystych: " + sumaParzystych);
    }

    public static void z5() {
        String s;
        Scanner scanner = new Scanner(System.in);
        s = scanner.next();

        s.toLowerCase(Locale.ROOT);

        boolean palindrom = true;
        for(int i = 0; i < (s.length() / 2); i++) {
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
                palindrom = false;
                break;
            }
        }

        System.out.println(palindrom ? "Palindrom" : "Nie palindrom");
    }

    public static void main(String[] args) {
        System.out.println("=== Zadanie 1 (grupa lab) ===");
        z1();

        System.out.println("=== Zadanie 2 (10 liczb, suma) ===");
        z2();

        System.out.println("=== Zadanie 3 (ciąg parzystych) ===");
        z3();

        System.out.println("=== Zadanie 4 (losowanie, suma parzystych) ===");
        z4();

        System.out.println("=== Zadanie 5 (palindrom) ===");
        z5();

        System.out.println("======================");
        System.out.println("=== ZADANIA PART 2 ===");
        System.out.println("======================");

        System.out.println("=== Zadanie 1 (kwadratówka) ===");
        ObiektoweDwa.z1();

        System.out.println("=== Zadanie 2 (funkcje) ===");
        ObiektoweDwa.z2();

        System.out.println("=== Zadanie 3 (sort) ===");
        ObiektoweDwa.z3();

        System.out.println("=== Zadanie 4 (autobus) ===");
        ObiektoweDwa.z4();

        System.out.println("=== Zadanie 5 (samochód) ===");
        ObiektoweDwa.z5();

        System.out.println("=== Zadanie 6 (kalkulator) ===");
        ObiektoweDwa.z6();

    }
}
