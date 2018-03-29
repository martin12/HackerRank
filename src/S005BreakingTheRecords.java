import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class S005BreakingTheRecords {

    /*
     * Complete the breakingRecords function below.
     */
    static int[] breakingRecords(int[] score) {
        /*
         * Write your code here.
         */
        int games = score.length;
        Integer lowest = null;
        int changeLowest = 0;
        Integer highest = null;
        int changeHighest = 0;

        for (int i = 0; i < games; i++) {
            if ((lowest == null) && (highest == null)) {
                lowest = score[i];
                highest = score[i];
            }
            else {
                if (score[i] < lowest) {
                    lowest = score[i];
                    changeLowest++;
                }
                if (score[i] > highest) {
                    highest = score[i];
                    changeHighest++;
                }
            }
        }

        int[] resultado = {changeHighest, changeLowest};
        return resultado;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] score = new int[n];

        String[] scoreItems = scan.nextLine().split(" ");

        for (int scoreItr = 0; scoreItr < n; scoreItr++) {
            int scoreItem = Integer.parseInt(scoreItems[scoreItr].trim());
            score[scoreItr] = scoreItem;
        }

        int[] result = breakingRecords(score);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write(" ");
            }
        }

        bw.newLine();

        bw.close();
    }
}
