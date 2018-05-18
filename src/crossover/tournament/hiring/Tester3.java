package crossover.tournament.hiring;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Tester3 {

    /**
     * Complete the function below.
     * DO NOT MODIFY anything outside this method.
     */
    static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {
        int[] resultados = new int[expressions.length];

        for (int i = 0; i < expressions.length; i++) {
            String expression = expressions[i];

            // recorriendo la expresión
            Deque<String> stack = new ArrayDeque<String>();
            for(int j = 0; j < expression.length(); j++) {
                String currentSymbol = String.valueOf(expression.charAt(j));
                if (currentSymbol.equals("<")) {
                    stack.add(currentSymbol);
                }
                else {
                    if (stack.size() > 0) {
                        if (stack.peek().equals("<")) {
                            stack.pop();
                        } else {
                            stack.add(currentSymbol);
                        }
                    }
                    else {
                        stack.add(currentSymbol);
                    }
                }
            }

            if (stack.size() > 0) {
                // se tienen elementos sin su matches correspondientes
                // Se debe verificar si se pueden balancear dado el valor del maxReplacement correspondiente
                int maxReplacement = maxReplacements[i];
                boolean unbalanced = false;
                for (int k = 0; (k < maxReplacement) && (stack.size() > 0); k++) {
                    if (stack.peek().equals(">")) {
                        stack.pop();
                    }
                    else {
                        unbalanced = true;
                        break;
                    }
                }
                if (unbalanced || (stack.size() > 0)) {
                    resultados[i] = 0;
                }
                else {
                    resultados[i] = 1;
                }
            }
            else {
                resultados[i] = 1;
            }
        }

        return resultados;
    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int[] res;

        int _expressions_size = 0;
        _expressions_size = Integer.parseInt(in.nextLine().trim());
        String[] _expressions = new String[_expressions_size];
        String _expressions_item;
        for (int _expressions_i = 0; _expressions_i < _expressions_size; _expressions_i++) {
            try {
                _expressions_item = in.nextLine();
            } catch (Exception e) {
                _expressions_item = null;
            }
            _expressions[_expressions_i] = _expressions_item;
        }

        int _maxReplacements_size = 0;
        _maxReplacements_size = Integer.parseInt(in.nextLine().trim());
        int[] _maxReplacements = new int[_maxReplacements_size];
        int _maxReplacements_item;
        for (int _maxReplacements_i = 0; _maxReplacements_i < _maxReplacements_size; _maxReplacements_i++) {
            _maxReplacements_item = Integer.parseInt(in.nextLine().trim());
            _maxReplacements[_maxReplacements_i] = _maxReplacements_item;
        }

        res = balancedOrNot(_expressions, _maxReplacements);
        for (int res_i = 0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }
    }
}