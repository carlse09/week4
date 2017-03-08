package week4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 *
 *
 * @author Sydney Carl
 */
public class C12N15 {

    public static int[] randNums(int n) {
        int[] numArray = new int[n];
        Random gen = new Random();
        for (int i = 0; i < n; i++) {
            numArray[i] = gen.nextInt();
        }
        return numArray;
    }

    public static void writeNums(int[] numArray, String filepath) {
        try (PrintWriter out = new PrintWriter(
                new FileWriter(new File(filepath), false))) {
            for (int myNum : numArray) {
                out.print(myNum + " ");
            }
            out.println();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(C12N15.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(C12N15.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int[] readNums(String filepath) {
        List<Integer> myList = new ArrayList();
        try (Scanner sc = new Scanner(new File(filepath))) {
            while (sc.hasNextInt()) {
                myList.add(sc.nextInt());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(C12N15.class.getName()).log(Level.SEVERE, null, ex);
        }

        return myList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void display(int[] numsArray) {
        for (int myNum : numsArray) {
            System.out.print(myNum + " ");
        }
        System.out.println("");
    }

    public static void sortAsc(int[] numsArray) {
        Arrays.sort(numsArray);
    }

    public static void main(String[] args) {
        // generate 100 ints
        int[] array1 = randNums(100);

        // write to a file
        writeNums(array1, "C12N15.txt");
        display(array1);

        // read from a file
        int[] array2 = readNums("C12N15.txt");
        display(array2);

        // sort into ascending order
        sortAsc(array2);
        display(array2);
    }
}
