import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class S0004GradingStudents {

    static int[] solve(int[] grades){
        // Complete this function
        int[] resultados = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            // se verifica si la nota es multiplo de 5
            int cociente = grades[i] / 5;
            if ((grades[i] >= 38) && (cociente > 0)) {
                int notaSuperior = 5 * (cociente + 1);
                //System.out.print(cociente + " - ");
                //System.out.println(notaSuperior);
                if ((notaSuperior - grades[i]) < 3) {
                    resultados[i] = notaSuperior;
                }
                else {
                    resultados[i] = grades[i];
                }
            }
            else {
                resultados[i] = grades[i];
            }
        }

        return resultados;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }
}
