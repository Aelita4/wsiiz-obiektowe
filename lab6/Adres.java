public class Adres  {
    String ulica;
    int numerDomu;
    String kodPocztowy;
    String miasto;

    public Adres(String ulica, int numerDomu, String kodPocztowy, String miasto) throws NieprawidlowyAdresException {
        String errs = "";

        if(ulica == null) errs += "Ulica nie moze byc nullem";
        if(numerDomu <= 0) errs += "Numer domu nie moze byc mniejszy lub rowny 0";
        if(kodPocztowy == null) errs += "Kod pocztowy nie moze byc nullem";
        if(miasto == null) errs += "Miasto nie moze byc nullem";

        if(errs.length() > 0) throw new NieprawidlowyAdresException(errs);

        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }
}
