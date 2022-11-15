class Trojkat extends Figura {
    double wys=0, podst=0;

    Trojkat(double wys, double podst) {
        super();
        this.wys = wys;
        this.podst = podst;
    }

    public Trojkat(double wys, double podst, String kolor) {
        super(kolor);
        this.wys = wys;
        this.podst = podst;
    }

    String opis(){
        return "Klasa Trojkat. Kolor obiektu: " + kolor + ", wysokosc " + wys + ", podstawa " + podst;
    }
}