public class Ksiegarnia {
    Ksiazka[] ksiazki = new Ksiazka[20];
    int ksiazkiIndex = 0;
    Klient[] klienci = new Klient[20];
    int klienciIndex = 0;

    public void addKlient(Klient k) {
        klienci[klienciIndex++] = k;
    }

    public void addKlient(String imie, String nazwisko) {
        Klient k = new Klient(imie, nazwisko);
        klienci[klienciIndex++] = k;
    }

    public void addKsiazka(Ksiazka k) {
        ksiazki[ksiazkiIndex++] = k;
    }

    public void getKsiazki() {
        for(int i = 0; i < ksiazkiIndex; i++) {
            ksiazki[i].opis();
        }
    }

    public void getKlienci() {
        for(int i = 0; i < klienciIndex; i++) {
            System.out.println(klienci[i].getImieNazwisko());
        }
    }
}
