package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sydney Carl
 */
public class C11N14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("Enter five integers for list1: ");
        for (int i = 0; i < 5; i++) {
            list1.add(input.nextInt());
        }
        System.out.print("Enter five integers for list2: ");
        for (int i = 0; i < 5; i++) {
            list2.add(input.nextInt());
        }

        System.out.println("The combined list is " + union(list1, list2));

    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        ArrayList<Integer> temp = new ArrayList<>();
        temp.addAll(list1);
        temp.addAll(list2);
        return temp;
    }
}
