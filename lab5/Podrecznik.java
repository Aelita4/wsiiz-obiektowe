public class Podrecznik extends Ksiazka {
    String przedmiot;
    int rocznik;

    public Podrecznik(String isbn, String tytul, String autor, int rokWydania, String przedmiot, int rocznik) {
        super(isbn, tytul, autor, rokWydania);
        this.przedmiot = przedmiot;
        this.rocznik = rocznik;
    }

    public void opis() {
        super.opis();
        System.out.println("Przedmiot " + przedmiot + " dla rocznika " + rocznik);
    }
}
