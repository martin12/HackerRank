package crossover.tournament.hiring;

public class Inc {

    public static void main(String[] args) {
        int[] i = {1};
        Inc inc = new Inc();
        inc.increment(i);

        System.out.println(i[i.length - 1]);
    }

    void increment(int[] i) {
        i[i.length - 1]++;
    }

}
