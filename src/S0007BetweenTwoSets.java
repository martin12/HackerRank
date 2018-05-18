import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class S0007BetweenTwoSets {

    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
        /*
         * Write your code here.
         */

        Integer minimumInteger = 0;
        for (int i = 0; i < b.length; i++) {
            if (minimumInteger == 0) {
                minimumInteger = b[i];
            }
            else {
                if (minimumInteger > b[i]) {
                    minimumInteger = b[i];
                }
            }
        }

        List<Integer> consideredIntegerArray = new ArrayList<Integer>();

        for (int i = 1; i <= minimumInteger; i++) {

            boolean modAllElements = true;

            for (int j = 0; j < a.length; j++) {

                if ( (i % a[j]) != 0) {
                    modAllElements = false;
                    break;
                }

            }

            if (modAllElements) {
                consideredIntegerArray.add(i);
            }

        }

        List<Integer> consideredIntegerArray2 = new ArrayList<Integer>();

        for (int i = 0; i < consideredIntegerArray.size(); i++) {

            Integer x = consideredIntegerArray.get(i);
            boolean modAllElements = true;

            for (int j = 0; j < b.length; j++) {

                if ( (b[j] % x) != 0) {
                    modAllElements = false;
                    break;
                }

            }

            if (modAllElements) {
                consideredIntegerArray2.add(x);
            }

        }

        return consideredIntegerArray2.size();
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        bw.write(String.valueOf(total));
        bw.newLine();

        bw.close();
    }
}

