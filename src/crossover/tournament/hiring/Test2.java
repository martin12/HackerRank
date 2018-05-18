package crossover.tournament.hiring;

import java.util.HashMap;
import java.util.Map;

public class Test2 {

    public static void main(String[] args) {
        Map<Key, Integer> map = new HashMap<>();
        Key firstKey = new Key();
        map.put(firstKey, 0);
        for (int i = 0; i < Integer.parseInt("100"); i++) {
            map.put(new Key(), i);
        }
        long initial = System.currentTimeMillis();
        map.get(firstKey);
        long end = System.currentTimeMillis();
        System.out.println(end-initial);
        System.out.println(map.size());
    }

    static class Key {
        @Override
        public int hashCode() {
            return 42;
        }
    }
}
