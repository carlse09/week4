package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sydney Carl
 */
public class C11N12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }

        System.out.println("The sum of the 5 numbers = " + sum(list));

    }

    private static double sum(ArrayList<Double> list) {

        double sum = 0;
        for (double i : list) {
            sum += i;
        }
        return sum;
    }

}
