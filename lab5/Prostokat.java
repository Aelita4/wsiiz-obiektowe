class Prostokat extends Figura {
    double wys=0, szer=0;

    Prostokat(double wys,double szer){
        super();
        this.wys = wys;
        this.szer = szer;
    }

    public Prostokat(double wys, double szer, String kolor) {
        super(kolor);
        this.wys = wys;
        this.szer = szer;
    }

    double getPowierzchnia() {
        return (szer * wys);
    }

    public void przesun(int x, int y) {
        szer += x;
        wys += y;
    }

    String opis(){
        return "Klasa Prostokat. Kolor obiektu: " + kolor + ", wysokosc " + wys + ", szerokosc " + szer;
    }
}