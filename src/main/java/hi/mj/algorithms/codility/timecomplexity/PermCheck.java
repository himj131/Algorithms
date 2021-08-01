package hi.mj.algorithms.codility.timecomplexity;

import java.util.Arrays;

/**
 * https://app.codility.com/c/run/trainingAEVVRC-VUC/
 */
public class PermCheck {
    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 1; i <= A.length; i++) {
            if(A[i-1] != i) return 0;
        }
        return 1;
    }
}
