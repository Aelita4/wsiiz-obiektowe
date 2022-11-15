import java.util.Scanner;

public class SamochodOsobowy extends Samochod {
    double waga, pojemnoscSilnika;
    int iloscOsob;

    public SamochodOsobowy() {
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Waga: ");
        waga = scanner.nextDouble();
        if(waga < 2 || waga > 4.5) throw new IllegalArgumentException("Waga musi byc w przedziale 2-4.5");
        System.out.print("Pojemnosc silnika: ");
        pojemnoscSilnika = scanner.nextDouble();
        if(pojemnoscSilnika < 0.8 || pojemnoscSilnika > 3) throw new IllegalArgumentException("Pojemnosc silnika musi byc w przedziale 0.8-3.0");
        System.out.print("Ilosc osob: ");
        iloscOsob = scanner.nextInt();
    }

    public void opis() {
        System.out.println("Samochod osobowy marki " + marka);
        System.out.println("Model " + model);
        System.out.println("Nadwozie " + nadwozie);
        System.out.println("Kolor " + kolor);
        System.out.println("Rok produkcji " + rokProdukcji);
        System.out.println("Przebieg " + przebieg);
        System.out.println("Waga " + waga + " t");
        System.out.println("Pojemnosc silnika " + pojemnoscSilnika + " cc");
        System.out.println("Ilosc osob " + iloscOsob);
        System.out.println();
    }
}
