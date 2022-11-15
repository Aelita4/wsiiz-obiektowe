public class Okrag extends Figura {
    double promien;

    public Okrag(Punkt srodek, double promien) {
        this.punkt = srodek;
        this.promien = promien;
    }

    public Okrag() {
        punkt = new Punkt();
        promien = 0;
    }

    public double getPowierzchnia() {
        return Math.PI * Math.pow(promien, 2);
    }

    public double getSrednica() {
        return 2 * Math.PI * promien;
    }

    public void setPromien(double p) {
        if(p < 0) throw new IllegalArgumentException("Promien musi byc liczba dodatnia");
        promien = p;
    }

    public double getPromien() {
        return promien;
    }

    public boolean wSrodku(Punkt p) {
        if(p.x > promien || p.y > promien) return false;
        double tempX = Math.pow(p.x - punkt.x, 2);
        double tempY = Math.pow(p.y - punkt.y, 2);
        if(tempX + tempY <= Math.pow(promien, 2)) return true;
        return false;
    }

    String opis(){
        return "Klasa Okrag. Kolor obiektu: " + kolor + ", srodek " + punkt.getX() + ", " + punkt.getY() + ", promien " + getPromien();
    }
}
