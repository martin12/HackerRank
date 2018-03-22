import java.util.Scanner;

public class Solution001 {

    static void plusMinus(int[] arr) {
        // Complete this function
        double size = arr.length;
        double positive = 0;
        double negative = 0;
        double zero = 0;

        for(int i = 0; i < size; i++) {
            int cell = arr[i];

            if (cell > 0) {
                positive++;
            }
            else if (cell < 0) {
                negative++;
            }
            else {
                zero++;
            }
        }

        System.out.println(positive / size);
        System.out.println(negative / size);
        System.out.println(zero / size);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
