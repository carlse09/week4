package week4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Sydney Carl
 */
public class C11N11ListSort {

    public static void sort(ArrayList<Integer> list) {

        list.sort(Comparator.naturalOrder());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            list.add(Integer.parseInt(sc.nextLine()));
        }
        sort(list);
        System.out.println("Sorted list is " + list.toString());
    }

}
