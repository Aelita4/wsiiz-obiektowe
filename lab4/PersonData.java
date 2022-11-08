public class PersonData {
    public static void getPersonData() {
        Person p1 = new Person("Zdzichu", "Zdzichowski", 19);
        Person p2 = new Person("Eustachy", 21);
        Person p3 = new Person();

        p1.getPersonData();
        p2.getPersonData();
        p3.getPersonData();
    }
}
