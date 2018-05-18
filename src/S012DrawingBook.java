import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class S012DrawingBook {

    static int solve(int n, int p){
        // Complete this function

        // opening book
        int fromFront = 0;
        int fromBack = 0;

        if (p != 1) {
            fromFront = p / 2;
        }

        if ((n % 2) == 0) { // even number of pages
            if (p != n) {
                do {
                    fromBack++;
                    n = n - 2;
                }
                while ((p != n) && (p != (n + 1) && (n > 0)));
            }
        }
        else { // odd number of pages
            if ((p != n) && (p != (n - 1))) {
                n--;
                do {
                    fromBack++;
                    n = n - 2;
                }
                while ((p != n) && (p != (n + 1) && (n > 0)));
            }
        }

        if (fromFront < fromBack) {
            return fromFront;
        }
        return fromBack;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
