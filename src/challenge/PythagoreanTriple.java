package challenge;

import java.util.Scanner;

public class PythagoreanTriple {
    static void main() {
        Scanner scan = new Scanner(System.in);
        boolean isPythagorean = false;

        while(true) {
            System.out.println("Inform the sides of the triangle: ");
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double c = scan.nextDouble();
            scan.nextLine();

            System.out.println(isPythagorean(a, b, c));

            System.out.println("Type 1 to insert the values again...");
            if(scan.nextInt() != 1) break;
            scan.nextLine();

        }

        System.out.println("Thanks for using the program.");

    }

    static boolean isPythagorean(double a, double b, double c) {
        return (a * a + b * b) == (c * c) || (a * a + c * c) == (b * b) || (c * c + b * b) == (a * a);
    }

}
