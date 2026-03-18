package concept_learnt;

// Learnt from Top K Frequency Elements problem, practicing here

import java.util.*;

public class D_MapEntry {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 2);
        map.put(2, 1);
        map.put(3, 4);
        map.put(4, 3);
        map.put(5, 2);
        System.out.print("[ ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            System.out.print("(" + key + ", " + value + ") ");
        }
        System.out.print("]");
    }
}
