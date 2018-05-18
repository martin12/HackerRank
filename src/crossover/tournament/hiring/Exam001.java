package crossover.tournament.hiring;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public class Exam001 {
    public static void main(String[] args) {

        java.util.Set set = new HashSet(Arrays.asList(1, 2, 2, 3, 3, 5));
        System.out.println(set.size());


        //int num = (int)50.05L;
        byte x = (byte)50L;
        long y = (byte)50;
        byte z = (byte)50L;

        new Foo().foo();

        System.out.println();
        System.out.println(2 + 4 * 9 - 3);
        System.out.println((2 + 4) * 9 - 3);
        System.out.println(2 + (4 * 9) - 3);
        System.out.println(2 + 4 * (9 - 3));
        System.out.println((2 + 4 * 9) - 3);

        System.out.println();
        int i=6, j=4, k=9;
        TestFirstApp.doIt(i, j, k);
        System.out.println(k);


        System.out.println();
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.print("result: ");
        System.out.print((obj1 == obj2) + " ");
        System.out.print(obj1.equals(obj2) + " ");
        obj1 = obj2;
        System.out.print(obj1.equals(obj2) + " ");


        //new MyClass<Integer>();
        MyClass<Integer> myObject1 = new MyClass<>("");
        //MyClass<Integer> myObject2 = new <String> MyClass<>();
        //MyClass<Integer> myObject3 = new <> MyClass("");
        new MyClass<Integer>("");


        /*
        try {
            Scanner in = new Scanner(System.in);

            int n = Integer.parseInt(in.nextLine().trim());
            String[] a = new String[n];
            for (int q = 0; q < n; q++) {
                a[q] = in.nextLine();
                if ((q % 2) == 0) {
                    throw new IOException("hola");
                }
                else {
                    throw new SQLException("mundo");
                }
            }
        }
        catch (IOException | SQLException ex) {

        }
        */

        Exam001 exam001 = new Exam001();
        System.out.println();
        System.out.println(exam001.getSeasonUsingSwitchStatement("January"));

        final Collection<? extends Number> foo = new ArrayList<Number>();

        //foo.add(new Integer(4));
        //foo.add(new Object());
        foo.add(null);
        //foo = null;

        System.out.println();
        long initial = System.currentTimeMillis();
        String s = "";
        for (int i2 = 0; i2 < 1000; i2++) {
            s += String.valueOf(i2);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-initial);
    }

    public String getSeasonUsingSwitchStatement(String seasonOfYearArg) {
        String nameOfSeason;
        switch (seasonOfYearArg) {
            case "March":
            case "April":
            case "May":
                nameOfSeason = "Spring";
                break;
            case "June":
            case "July":
            case "August":
                nameOfSeason = "Summer";
                break;
            case "September":
            case "October":
            case "November":
                nameOfSeason = "Fall";
                break;
            case "December":
            case "January":
            case "February":
                nameOfSeason = "Winter";
                break;
            default:
                    throw new IllegalArgumentException("Invalid month for season of the year: " + seasonOfYearArg);
        }
        return nameOfSeason;
    }
}

final class Foo {
    public void update(Integer x) {
        try {
            x = new Integer(20);
        }
        finally {
            x = new Integer(30);
        }
    }

    public void foo() {
        Integer x = new Integer(10);
        update(x);
        System.out.println(x);
    }
}

