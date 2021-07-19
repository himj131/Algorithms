package hi.mj.algorithms.codility.timecomplexity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://app.codility.com/c/run/trainingX82P54-ZCZ/
 */
public class TapeEquilibrium {
    public int solution(int[] A) {
        List<Integer> leftSumList = getLeftSum(A);
        List<Integer> rightSumList = getRightSum(A);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            int diff = Math.abs(leftSumList.get(i) - rightSumList.get(i));
            if(minDiff >= diff) minDiff = diff;
        }

        return minDiff;
    }

    private List<Integer> getLeftSum(int[] A) {
        List<Integer> sums = new ArrayList<>();
        for(int i = 0; i < A.length; i++) {
            int pre = i == 0 ? 0 : sums.get(i-1);
            sums.add(pre + A[i]);
        }
        return sums;
    }

    private List<Integer> getRightSum(int[] A) {
        List<Integer> sums = new ArrayList<>();
        for(int i = 0; i < A.length; i++) {
            int totalSum = Arrays.stream(A).sum();
            sums.add(totalSum - A[i]);
        }
        return sums;
    }
//    public int solution(int[] A) {
//        int min = Integer.MAX_VALUE;
//        for(int i = 1; i < A.length; i++) {
//            int leftSum = sumFromTo(A, 0, i);
//            int rightSum = sumFromTo(A, i, A.length);
//            int abs = Math.abs(leftSum - rightSum);
//            if(min >= abs){
//                min = abs;
//            }
//        }
//
//        return min;
//    }
//
//    private int sumFromTo(int[] A, int from, int to) {
//        int sum = 0;
//        for (int i = from; i < to; i++) {
//            sum = sum + A[i];
//        }
//        return sum;
//    }
}
