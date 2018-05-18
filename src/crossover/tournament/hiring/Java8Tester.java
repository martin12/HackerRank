package crossover.tournament.hiring;

public class Java8Tester {

    public static void main(String args[]) {
        Java8Tester tester = new Java8Tester();

        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        //without parenthesis
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        //with parenthesis
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Mahesh");
        greetService2.sayMessage("Suresh");


        StringOperation NoEsNulo = (String value1) -> value1 != null;
        //StringOperation NoEsNulo = (value2) => value2 != null;
        //StringOperation esNulo3 = [String value3] -> value3 != null;
        //StringOperation esNulo4 = (auto value4) -> value4 != null;

        System.out.println();
        System.out.println("null = " + tester.test(null, NoEsNulo));
        System.out.println("hola = " + tester.test("hola", NoEsNulo));

    }

    interface StringOperation {
        boolean NoEsNulo(String value);
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    private boolean test(String a, StringOperation stringOperation) {
        return stringOperation.NoEsNulo(a);
    }
}