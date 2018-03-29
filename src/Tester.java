import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Tester {

    /**
     * Complete the function below.
     * DONOT MODIFY anything outside this function!
     */
    static int[] rearrange(int[] elements) {

        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < elements.length; i++) {
            list.add(elements[i]);
        }

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer left, Integer right) {

                int oLeft = left - ((left >>> 1) & 0x55555555);
                oLeft = (oLeft & 0x33333333) + ((oLeft >>> 2) & 0x33333333);
                int nLeft = (((oLeft + (oLeft >>> 4)) & 0x0F0F0F0F) * 0x01010101) >>> 24;

                int oRight = right - ((right >>> 1) & 0x55555555);
                oRight = (oRight & 0x33333333) + ((oRight >>> 2) & 0x33333333);
                int nRight = (((oRight + (oRight >>> 4)) & 0x0F0F0F0F) * 0x01010101) >>> 24;

                if (nLeft != nRight) {
                    return nLeft - nRight;
                }

                return left - right;
            }
        };

        Collections.sort(list, comparator);

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int n = 0;
        n = Integer.parseInt(in.nextLine().trim());
        int[] elements = new int[n];
        int element;
        for (int i = 0; i < n; i++) {
            element = Integer.parseInt(in.nextLine().trim());
            elements[i] = element;
        }

        // call rearrange function
        int[] results = rearrange(elements);

        for (int i = 0; i < results.length; i++) {
            System.out.println(String.valueOf(results[i]));
        }
    }
}