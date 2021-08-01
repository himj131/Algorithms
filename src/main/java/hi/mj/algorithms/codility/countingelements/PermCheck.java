package hi.mj.algorithms.codility.countingelements;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://app.codility.com/c/run/trainingAEVVRC-VUC/
 */
public class PermCheck {
    public int solution(int[] A) {
        List<Integer> nums = Arrays.stream(A).sorted().boxed().collect(Collectors.toList());
        for (int i = 1; i < nums.size(); i++) {
            if(nums.get(i-1) != i) return 0;
        }
        return 1;
    }
}
