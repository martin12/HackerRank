import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class S0010DayOfTheProgrammer {

    static String solve(int year){
        // Complete this function

        int diasEnero = 31;
        int diasFebrero = 28;
        int diasMarzo = 31;
        int diasAbril = 30;
        int diasMayo = 31;
        int diasJunio = 30;
        int diasJulio = 31;
        int diasAgosto = 31;

        // Se verifica si el año es bisiesto
        boolean leapYear = false;
        if ((year >= 1700) && (year <= 1917)) {
            // Calendario Juliano
            if ((year % 4) == 0) {
                leapYear = true;
                diasFebrero = 29;
            }
        }
        else {
            // Calendario Gregoriano
            if (((year % 400) == 0) ||
                    ((year % 4) == 0) && ((year % 100) != 0)) {
                leapYear = true;
                diasFebrero = 29;
            }
        }

        if (year == 1918) {
            // Año de transición entre calendarios
            diasFebrero = 15;
            if (leapYear) {
                diasFebrero = 16;
            }
        }

        int totalDays = diasEnero + diasFebrero + diasMarzo + diasAbril + diasMayo + diasJunio + diasJulio + diasAgosto;
        int day256 = 256 - totalDays;

        return day256 + ".09." + year;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
