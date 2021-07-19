package hi.mj.algorithms.codility.timecomplexity;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;

/**
 * https://app.codility.com/c/run/trainingX4ACSC-KEZ/
 */

public class PermMissingElem {
    public int solution(int[] A) {
        int max = A.length + 1;
        int result = 1;

        for(int i = 1; i < max; i++) {
            int num = i;
            boolean exists = Arrays.stream(A).anyMatch(it -> it == num);
            if(!exists) result = i;
        }

        if (max == result) return max + 1;
        return result;
    }

//    public int solution(int[] A) {
//        Map<Integer, Boolean> map = new HashMap<>();
//        for(int i = 1; i < A.length + 1; i++) {
//            map.put(i, false);
//        }
//        for (int j : A) {
//            map.put(j, true);
//        }
//
//        for(Integer i : map.keySet()) {
//            if(!map.get(i)) return i;
//        }
//
//        return A.length + 1;
//    }
}
