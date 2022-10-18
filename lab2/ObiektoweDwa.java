import java.util.Scanner;

public class ObiektoweDwa {
    public static void z1() {
        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.print("Podaj a: ");
        a = scanner.nextDouble();

        System.out.print("Podaj b: ");
        b = scanner.nextDouble();

        System.out.print("Podaj c: ");
        c = scanner.nextDouble();

        if(a == 0) { // liniowe
            System.out.println("x = " + (-c / b));
        } else { // kwadratowe
            double delta = Math.pow(b, 2) - (4 * a * c);
            if(delta < 0) {
                System.out.println("Brak rozwiązań");
            } else if(delta == 0) {
                System.out.println("x = " + (-b / a));
            } else {
                System.out.println("x1 = " + ((-b - Math.sqrt(delta)) / (2 * a)));
                System.out.println("x2 = " + ((-b + Math.sqrt(delta)) / (2 * a)));
            }
        }
    }

    private static double z2_a(double x) {
        if(x > 0) return 2 * x;
        if(x == 0) return 0;
        return -3 * x;
    }

    private static double z2_b(double x) {
        if(x >= 1) return Math.pow(x, 2);
        return x;
    }

    private static double z2_c(double x) {
        if(x > 2) return 2 + x;
        if(x == 2) return 8;
        return x - 4;
    }

    public static void z2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj x: ");
        double x = scanner.nextDouble();

        System.out.println("a: " + z2_a(x));
        System.out.println("b: " + z2_b(x));
        System.out.println("c: " + z2_c(x));
    }

    public static void z3() {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;

        System.out.print("Podaj a: ");
        a = scanner.nextInt();

        System.out.print("Podaj b: ");
        b = scanner.nextInt();

        System.out.print("Podaj c: ");
        c = scanner.nextInt();

        if(a >= b && a >= c) {
            System.out.print(a + ", ");
            if(b >= c) {
                System.out.println(b + ", " + c);
            } else {
                System.out.println(c + ", " + b);
            }
        } else if(b >= a && b >= c) {
            System.out.print(b + ", ");
            if(a >= c) {
                System.out.println(a + ", " + c);
            } else {
                System.out.println(c + ", " + a);
            }
        } else {
            System.out.print(c + ", ");
            if(a >= b) {
                System.out.println(a + ", " + b);
            } else {
                System.out.println(b + ", " + a);
            }
        }
    }

    public static void z4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Czy pada? (y/n)");
        String pada = scanner.next();
        boolean czyPada = pada == "y" || pada == "Y";

        System.out.print("Jest autobus? (y/n)");
        String autobus = scanner.next();
        boolean jestAutobus = autobus == "y" || autobus == "Y";

        if(czyPada && jestAutobus) System.out.println("Weź parasol, dostaniesz sięna uczelnię");
        if(czyPada && !jestAutobus) System.out.println("Nie dostaniesz się na uczelnię");
        if(!czyPada && jestAutobus) System.out.println("Dostaniesz się na uczelnię, miłego dnia i pięknej pogody");
    }

    public static void z5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jest zniżka? (y/n)");
        String znizka = scanner.next();
        boolean czyZnizka = znizka == "y" || znizka == "Y";

        System.out.print("Podwyżka? (y/n)");
        String podwyzka = scanner.next();
        boolean czyPodwyzka = podwyzka == "y" || podwyzka == "Y";

        if(!czyZnizka || czyPodwyzka) System.out.println("Możesz kupić samochód, zniżki na samochód nie ma");
        if(!czyZnizka && !czyPodwyzka) System.out.println("Zakup samochodu trzeba odłożyć na później, zniżki na samochód nie ma");
        if(czyZnizka || czyPodwyzka) System.out.println("Możesz kupić samochód");
    }

    public static void z6() {
        Scanner scanner = new Scanner(System.in);

        double a, b;
        String oper;

        System.out.print("Podaj 1 liczbę: ");
        a = scanner.nextDouble();

        System.out.print("Podaj operację: ");
        oper = scanner.next();

        System.out.print("Podaj 2 liczbę: ");
        b = scanner.nextDouble();

        if(oper == "/" && b == 0) System.out.println("/0 nie");
        else {
            switch(oper) {
                case "+":
                    System.out.println(a + " + " + b + " = " + (a + b));
                    break;
                 case "-":
                    System.out.println(a + " - " + b + " = " + (a - b));
                    break;
                 case "*":
                    System.out.println(a + " * " + b + " = " + (a * b));
                    break;
                 case "/":
                    System.out.println(a + " / " + b + " = " + (a / b));
                    break;
                 case "%":
                    System.out.println(a + " % " + b + " = " + (a % b));
                    break;
            }
        }
    }
}
