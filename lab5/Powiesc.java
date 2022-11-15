public class Powiesc extends Ksiazka {
    String gatunek;

    public Powiesc(String isbn, String tytul, String autor, int rokWydania, String gatunek) {
        super(isbn, tytul, autor, rokWydania);
        this.gatunek = gatunek;
    }

    public void opis() {
        super.opis();
        System.out.println("Gatunek" + gatunek);
    }
}
