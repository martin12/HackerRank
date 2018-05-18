import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Tester2 {

    /**
     * Complete the function below.
     * DO NOT MODIFY anything outside this method. 
     */
    static boolean[] twins(String[] a, String[] b) {
        boolean[] result = new boolean[a.length];
        int n = a.length;

        String aword = "";
        String bword = "";
        for (int i = 0; i < n; i++) {
            try {
                aword = a[i];
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                result[i] = false;
            }

            try {
                bword = b[i];
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                result[i] = false;
            }

            int length = aword.length();
            if (length != bword.length()) {
                result[i] = false;
            }
            else {

                for (int j = 0; j < length; j++) {
                    char letterA = aword.charAt(j);

                    int modA = j % 2;

                    int letterBPos = bword.indexOf(letterA);
                    if (letterBPos > -1) {
                        int modB = letterBPos % 2;

                        if (modA == modB) {
                            result[i] = true;
                        }
                        else {
                            result[i] = false;
                            break;
                        }
                    }
                    else {
                        result[i] = false;
                        break;
                    }
                }
            }
        }
        return result;
    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine().trim());
        String[] a = new String[n];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextLine();
        }

        int m = Integer.parseInt(in.nextLine().trim());
        String[] b = new String[m];
        for(int i = 0; i < m; i++) {
            b[i] = in.nextLine();
        }

        // call twins function
        boolean[] results = twins(a, b);

        for(int i = 0; i < results.length; i++) {
            System.out.println(results[i]? "Yes" : "No");
        }
    }
}