package hi.mj.algorithms.codility.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * https://app.codility.com/c/run/trainingZPF9M3-UPB/
 * */

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        Map<Integer, Integer> numberCntMap = createMap(A);
        return numberCntMap.entrySet()
                .stream()
                .filter(map -> map.getValue() % 2 != 0)
                .findFirst()
                .get()
                .getKey();
    }

    private Map<Integer, Integer> createMap(int[] nums) {
        Map<Integer, Integer> numberCntMap = new HashMap<>();
        for (int num: nums) {
            Integer numCnt = numberCntMap.getOrDefault(num, 0);
            numberCntMap.put(num, numCnt + 1);
        }
        return numberCntMap;
    }
}
