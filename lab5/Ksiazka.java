public class Ksiazka {
    String isbn;
    String tytul;
    String autor;
    int rokWydania;

    public Ksiazka(String isbn, String tytul, String autor, int rokWydania) {
        this.isbn = isbn;
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
    }

    public void opis() {
        System.out.println(tytul + ", " + autor + ", rok " + rokWydania);
        System.out.println("ISBN: " + isbn);
    }
}
