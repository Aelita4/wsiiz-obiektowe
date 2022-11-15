public class Kwadrat extends Prostokat {
    public Kwadrat(double bok) {
        super(bok, bok);
    }

    public double getBok() {
        return wys;
    }

    public void setBok(double bok) {
        wys = bok;
        szer = bok;
    }

    String opis(){
        return "Klasa Kwadrat. Kolor obiektu: " + kolor + ", bok " + szer;
    }
}
