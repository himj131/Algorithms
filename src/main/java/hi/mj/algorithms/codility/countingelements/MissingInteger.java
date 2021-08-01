package hi.mj.algorithms.codility.countingelements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
    public int solution(int[] A) {
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            nums.add(A[i]);
        }

        int max = Arrays.stream(A).max().orElse(0);
        if(max < 0) return 1;
        for (int i = 1; i <= max; i++) {
            if (!nums.contains(i)) return i;
        }
        return max + 1;
    }
}
