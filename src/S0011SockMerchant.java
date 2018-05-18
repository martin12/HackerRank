import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class S0011SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        // Complete this function

        HashMap<Integer, Integer> totalSocks = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int currentColorSock = ar[i];

            if (totalSocks.containsKey(currentColorSock)) {
                Integer currentAmount = totalSocks.get(currentColorSock);
                totalSocks.put(currentColorSock, currentAmount + 1);
            }
            else {
                totalSocks.put(currentColorSock, 1);
            }
        }

        int matchedSocks = 0;
        for (Map.Entry<Integer, Integer> entry : totalSocks.entrySet()) {
            matchedSocks += (entry.getValue() / 2);
        }

        return matchedSocks;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
