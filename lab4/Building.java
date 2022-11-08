import java.time.LocalDate;
import java.time.Period;

public class Building {
    LocalDate date;
    String name;
    int floors;

    public Building(LocalDate date, String name, int floors) {
        this.date = date;
        this.name = name;
        this.floors = floors;
    }

    public void displayBuildingData() {
        System.out.println("Building " + name);
        System.out.println("with " + floors + " floors");
        System.out.println("Built " + Math.abs(Period.between(LocalDate.now(), date).getYears()) + " years ago");
    }
}
