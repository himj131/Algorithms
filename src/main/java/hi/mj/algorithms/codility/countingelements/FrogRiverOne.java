package hi.mj.algorithms.codility.countingelements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        int answer = -1;
        Set<Integer> nums = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            nums.add(A[i]);
            if (nums.size() == X) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
