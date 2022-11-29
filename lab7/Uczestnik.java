import java.util.Objects;

public class Uczestnik {
    int id;
    String imie;
    int wiek;

    public Uczestnik(int id, String imie, int wiek) {
        this.id = id;
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Uczestnik{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Uczestnik)) return false;
        Uczestnik uczestnik = (Uczestnik) o;
        return this.getId() == o.getId() &&
                this.getImie().equals(o.getImie()) &&
                this.getWiek() == o.getWiek();

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imie, wiek);
    }
}
