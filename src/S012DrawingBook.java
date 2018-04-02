import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class S012DrawingBook {

    static int solve(int n, int p){
        // Complete this function
        int halfBook = n / 2;

        if (p < halfBook) {
            // contar desde la última página
            return p - 1;
        }
        else {
            // contar desde la primera página
            return n - p - 1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
