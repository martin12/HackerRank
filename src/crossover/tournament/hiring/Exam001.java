import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

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

