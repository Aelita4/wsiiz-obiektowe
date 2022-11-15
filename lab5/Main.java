public class Main {
    public static void main(String[] args) {
        System.out.println("=== Zadanie 1 (punkty) ===");
        Punkt p1 = new Punkt();
        Punkt p2 = new Punkt(2, 3);
        Punkt p3 = new Punkt(Math.PI, Math.E);

        System.out.println(p1.getX() + ", " + p1.getY());
        p1.setX(10);
        p1.setY(20);
        System.out.println(p1.getX() + ", " + p1.getY());

        p2.opis();
        p2.zeruj();
        p2.opis();

        p3.opis();
        p3.przesun(2, -1);
        p3.opis();

        Figura f1 = new Figura();
        Figura f2 = new Figura(p3);
        Figura f3 = new Figura("czarny");

        System.out.println(f1.opis());
        System.out.println(f3.getKolor());

        Prostokat pr1 = new Prostokat(4, 6.5);
        System.out.println(pr1.getPowierzchnia());

        Trojkat t1 = new Trojkat(3.5, 6);
        System.out.println(t1.podst + ", " + t1.wys);

        System.out.println(pr1.opis());
        pr1.przesun(3, 5);
        System.out.println(pr1.opis());

        Kwadrat k1 = new Kwadrat(4);

        System.out.println(k1.opis());
        System.out.println(pr1.opis());
        System.out.println(t1.opis());
        System.out.println(f1.opis());

        Okrag o1 = new Okrag(p3, 5);

        System.out.println(o1.opis());


        System.out.println("=== Zadanie 2 (samochody) ===");
        SamochodOsobowy s1 = new SamochodOsobowy();
        Samochod s2 = new Samochod();
        Samochod citroen = new Samochod("Citroen", "C2", "E477F56BA1", "srebrny", 2004, 245000);

        s1.opis();
        s2.opis();
        citroen.opis();


        System.out.println("=== Zadanie 3 (kompozycja) ===");
        Ksiegarnia ks = new Ksiegarnia();
        ks.addKlient("Stefan", "Stefanowski");
        Klient k = new Klient("Zdzichu", "Zdzichowski");
        ks.addKlient(k);

        Ksiazka ks1 = new Ksiazka("9780786222728", "Harry Potter and the Philosopher's Stone", "J. K. Rowling", 1997);
        Powiesc ks2 = new Powiesc("9780545229937", "The Hunger Games", "Suzanne Collins", 2009, "fantastyka");
        Podrecznik ks3 = new Podrecznik("1234567890123", "Wczoraj i dzis", "Stefan Zdzichowski", 2012, "historia", 2023);

        ks.addKsiazka(ks1);
        ks.addKsiazka(ks2);
        ks.addKsiazka(ks3);

        ks.getKsiazki();
        ks.getKlienci();
    }
}
