package hi.mj.algorithms.codility.iterator;

import java.util.*;

public class BinaryNumber {
    private String binaryNum;

    public BinaryNumber(int n) {
        binaryNum = Integer.toBinaryString(n);
    }

    public int length() {
        return binaryNum.length();
    }

    public int maxBinaryGap() {
        int maxGap = 0;
        List<Integer> oneIndex = new ArrayList<>();
        List<String> numbers = Arrays.asList(binaryNum.split(""));

        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i).equals("1")) {
                oneIndex.add(i);
            }
        }

        for(int i = 1; i < oneIndex.size(); i++) {
            int gap = oneIndex.get(i) - oneIndex.get(i - 1) - 1;
            if (gap > maxGap) maxGap = gap;
        }

        return maxGap;
    }
}
