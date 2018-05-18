import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class S0009MigratoryBirds {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        int[] totalSightings = new int[n];

        for (int i = 0; i < n; i++) {
            totalSightings[ar[i]]++;
        }

        int maxSighting = 0;
        int indexMaxSighting = -1;
        for (int i = 0; i < totalSightings.length; i++) {
            if (totalSightings[i] > maxSighting) {
                maxSighting = totalSightings[i];
                indexMaxSighting = i;
            }
        }

        return indexMaxSighting;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
