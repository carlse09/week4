package week4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Sydney Carl
 */
public class C12N24 {

    static final String[] ranks = {"assistant", "associate", "full"};

    public static void main(String[] args) throws Exception {

        try (PrintWriter out = new PrintWriter("Salary.txt")) {
            for (int i = 1; i <= 1000; i++) {
                String rank = getRandomRank();
                String salary = String.format("%.2f", getRandomSalaryByRank(rank));

                out.print("FirstName" + i + " LastName" + i + " ");
                out.print(" " + rank + " " + salary);
                if (i != 1000) {
                    out.println();
                }

            }
        }

        System.out.println("File saved...");

    }

    private static void writeToFile(ArrayList<String> members) {

        try (PrintWriter out = new PrintWriter("Salary.txt")) {

            for (String member : members) {
                out.write(member);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();;
        }
    }

    private static String createString(int i) {

        String rank = getRandomRank();
        double salary = getRandomSalaryByRank(rank);

        return "FirstName" + i + " LastName" + i + " " + rank + " " + String.format("%.2f", salary);
    }

    private static String getRandomRank() {
        return ranks[(int) (Math.random() * ranks.length)];
    }

    private static double getRandomSalaryByRank(String rank) {

        int max = 0;
        int min = 0;
        switch (rank) {
            case "assistant":
                min = 50000;
                max = 80000;
                break;
            case "associate":
                min = 60000;
                max = 110000;
                break;
            case "full":
                min = 75000;
                max = 130000;
                break;
        }
        return getRandomSalary(min, max + 1);
    }

    private static double getRandomSalary(int min, int max) {
        int range = max - min;

        return Math.random() * range + min;
    }
}
