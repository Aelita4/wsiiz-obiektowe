import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int[] z1_losowanie(int a, int b) {
        Random rand = new Random();

        int n = 10;

        int[] tab = new int[n];

        for(int i = 0; i < n; i++) {
            tab[i] = rand.nextInt(b - a + 1) + a;
        }

        return tab;
    }

    public static void z1() {
        int suma = 0;

        int[] tab = z1_losowanie(10, 50);
        for (int j : tab) {
            suma += j;
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.println("Suma: " + suma);
        System.out.println("Średnia: " + (suma / 10));
    }

    public static void z2() {
        int[] parzystaIloscTab = {2, 3, 5, 7, 11, 13};
        int[] nieparzystaIloscTab = {42, 69, 120, 240, 303};

        for(int i = 0; i < parzystaIloscTab.length; i += 2) {
            System.out.println("Parzysta: " + parzystaIloscTab[i]);
            System.out.println("Nieparzysta: " + nieparzystaIloscTab[i]);
        }
    }

    public static void z3() {
        String[] tab = { "Stefan", "Andrzej", "Zdzichu" };

        for (String s : tab) {
            System.out.println(s.toUpperCase(Locale.ROOT));
        }
    }

    public static void z4() {
        final int size = 5;

        String[] tab = new String[size];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < size; i++) {
            System.out.print("Podaj " + (i + 1) + " słowo: ");
            tab[i] = scanner.next();
        }

        for(int i = (size - 1); i >= 0; i--) {
            for(int j = (tab[i].length() - 1); j >= 0; j--) {
                System.out.print(tab[i].charAt(j));
            }
            System.out.println();
        }
    }

    public static void z5() {
        int[] tab = { -15, -2, 0, 1, 10, 10, 20, 100 };
        int tmp;

        for(int i = 0; i < tab.length; i++) {
            for(int j = 0; j < i; j++) {
                if(tab[i] < tab[j]) {
                    tmp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = tmp;
                }
            }
        }

        for(int i = 0; i < tab.length; i++) {
            System.out.println((i + 1) + ". " + tab[i]);
        }
    }

    public static long z6_silnia(int n) {
        if(n == 0 || n == 1) return 1;
        return n * z6_silnia(n - 1);
    }

    public static void z6() {
        Scanner scanner = new Scanner(System.in);

        final int size = 5;
        int[] tab = new int[size];
        long[] res = new long[size];

        for(int i = 0; i < size; i++) {
            System.out.print("Podaj " + (i + 1) + " liczbę: ");
            tab[i] = scanner.nextInt();
            res[i] = z6_silnia(tab[i]);
        }

        for(int i = 0; i < size; i++) {
            System.out.println(tab[i] + "! = " + res[i]);
        }
    }

    public static void z7() {
        final int size = 4;
        String[] tab1 = { "Stefan", "Andrzej", "Zdzichu", "Eustachy" };
        String[] tab2 = { "Stefan", "Andrzej", "Zdzichu", "Eustachy" };

        for(int i = 0; i < size; i++) {
            if(!tab1[i].equals(tab2[i])) {
                System.out.println("Nie są równe na indeksie " + i);
                return;
            }
        }

        System.out.println("Są równe");
    }

    public static void main(String[] args) {
        System.out.println("=== Zadanie 1 (suma i średnia) ===");
        z1();

        System.out.println("=== Zadanie 2 (co drugi) ===");
        z2();

        System.out.println("=== Zadanie 3 (duże litery) ===");
        z3();

        System.out.println("=== Zadanie 4 (wspak) ===");
        z4();

        System.out.println("=== Zadanie 5 (sortowanie) ===");
        z5();

        System.out.println("=== Zadanie 6 (silnia) ===");
        z6();

        System.out.println("=== Zadanie 7 (porównywanie) ===");
        z7();
    }
}
