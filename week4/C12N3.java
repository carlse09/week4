package week4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sydney Carl
 */
public class C12N3 {

    public static void main(String[] args) {
        int[] a = new int[100];
        Random gen = new Random();
        for (int i = 0; i < 100; i++) {
            a[i] = gen.nextInt();
        }

        System.out.println("Enter an index: ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        try {
            int result = a[index];
            System.out.println("The number is " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
    }
}
