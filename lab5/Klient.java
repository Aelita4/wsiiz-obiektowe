public class Klient {
    String imie, nazwisko;

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImieNazwisko() {
        return imie + " " + nazwisko;
    }
}
