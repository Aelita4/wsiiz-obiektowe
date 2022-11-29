import transport.*;
import zwierzeta.Ryba;
import zwierzeta.Wieloryb;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Zadanie 1 (transport) ===");
        Hugokopter h = new Hugokopter();
        h.lec();
        Lodz l = new Lodz();
        l.plyn();
        Samolot a = new Samolot();
        a.lec();
        Statek s = new Statek();
        s.plyn();


        System.out.println("=== Zadanie 2 (zwierzeta) ===");
        Wieloryb w = new Wieloryb();
        System.out.println(w.gatunek);
        w.wynurz();
        w.zanurz();
        w.jedz();
        w.plyn();
        w.wydalaj();


        System.out.println("=== Zadanie 3 (sqrt exception) ===");
        float f1;
        try {
            f1 = scanner.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Input is not a float");
            return;
        }
        if(f1 < 0) throw new IllegalArgumentException("Bledna wartosc pierwiastka");
        System.out.println(Math.sqrt(f1));


        System.out.println("=== Zadanie 4 (silnia exception) ===");
        int x = scanner.nextInt();
        try {
            if (x < 0) throw new BlednaWartoscDlaSilniException("Silnia nie moze byc liczona z wartosci <0");
        } catch(BlednaWartoscDlaSilniException e) {
            System.out.println("Bledna wartosc silnii");
        }
        
        int result = 1;
        
        for(int i = 2; i <= x; i++) {
            wynik *= i;   
        }
        
        System.out.println(wynik);


        System.out.println("=== Zadanie 5 (adres exception) ===");
        String ulica = scanner.next();
        int numerDomu = scanner.nextInt();
        String kodPocztowy = scanner.next();
        String miasto = scanner.next();
        try {
            Adres a = new Adres(ulica, numerDomu, kodPocztowy, miasto);
        } catch(NieprawidlowyAdresException e) {
            System.out.println(e.getMessage());
        }
    }
}
