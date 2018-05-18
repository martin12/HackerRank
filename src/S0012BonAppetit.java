import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class S0012BonAppetit {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] itemsOrdered = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            itemsOrdered[ar_i] = in.nextInt();
        }

        int charged = in.nextInt();

        int inCommon = 0;
        for (int i = 0; i < n; i++) {
            if (i != k) {
                inCommon += itemsOrdered[i];
            }
        }

        int sharedCharge = inCommon / 2;
        if ( sharedCharge == charged) {
            System.out.println("Bon Appetit");
        }
        else {
            System.out.println(charged - sharedCharge);
        }
    }
}
