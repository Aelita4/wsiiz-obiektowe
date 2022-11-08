import java.util.Scanner;

public class GetStudentData {
    public static void getStudentData() {
        String name, surname, specialty;
        int age, indexNumber, collegeYear;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        name = scanner.next();

        System.out.print("Surname: ");
        surname = scanner.next();

        System.out.print("Age: ");
        age = scanner.nextInt();

        System.out.print("Index number: ");
        indexNumber = scanner.nextInt();

        System.out.print("Specialty: ");
        specialty = scanner.next();

        System.out.print("College year: ");
        collegeYear = scanner.nextInt();

        Student s = new Student(name, surname, age, indexNumber, specialty, collegeYear);
        s.getStudentData();
    }
}
