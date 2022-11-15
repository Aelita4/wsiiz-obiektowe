import java.util.Scanner;

public class Samochod {
    String marka, model, nadwozie, kolor;
    int rokProdukcji, przebieg;

    public Samochod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Marka: ");
        marka = scanner.next();
        System.out.print("Model: ");
        model = scanner.next();
        System.out.print("Nadwozie: ");
        nadwozie = scanner.next();
        System.out.print("Kolor: ");
        kolor = scanner.next();
        System.out.print("Rok produkcji: ");
        rokProdukcji = scanner.nextInt();
        System.out.print("Przebieg: ");
        przebieg = scanner.nextInt();
        if(przebieg < 0) throw new IllegalArgumentException("Przebieg nie moze byc ujemny");
    }

    public Samochod(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    public void opis() {
        System.out.println("Samochod marki " + marka);
        System.out.println("Model " + model);
        System.out.println("Nadwozie " + nadwozie);
        System.out.println("Kolor " + kolor);
        System.out.println("Rok produkcji " + rokProdukcji);
        System.out.println("Przebieg " + przebieg);
        System.out.println();
    }
}
