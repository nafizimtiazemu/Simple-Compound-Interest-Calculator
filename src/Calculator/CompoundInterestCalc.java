package Calculator;

import java.util.Scanner;

public class CompoundInterestCalc {
    public static void main(String[] args) {

        // CI calculator
        Scanner input = new Scanner(System.in);
        double A, P, r;
        int n, t;

        System.out.print("Enter principle amount: ");
        P = input.nextDouble();
        System.out.print("Enter annual interest rate(in %): ");
        r  = input.nextDouble();
        System.out.print("Enter number of compounds per years: ");
        n = input.nextInt();
        System.out.print("Enter number of years: ");
        t = input.nextInt();

        A = P * Math.pow((1 + (r/100)/n), n*t);

        System.out.printf("Final amount = $%,.0f%n", A);

        input.close();
    }
}
