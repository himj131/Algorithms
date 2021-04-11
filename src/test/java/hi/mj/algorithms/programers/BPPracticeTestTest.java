package hi.mj.algorithms.programers;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import static java.util.Comparator.comparing;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BPPracticeTestTest {
    @Test
    void test1() {
        BPPracticeTest bp = new BPPracticeTest();
        int[] input = {1,2,3,4,5};
        int[] outPut = {1};
        int[] result = bp.solution(input);
        assertThat(result).isEqualTo(outPut);
    }

    @Test
    void test3() {
        BPPracticeTest bp = new BPPracticeTest();
        int[] input = {1,3,2,4,2};
        int[] outPut = {1, 2, 3};
        int[] result = bp.solution(input);
        assertThat(result).isEqualTo(outPut);
    }

    @Test
    void orderingTest() {
        Map<Integer, Integer> map= new HashMap<>();

        map.put(1, 5);
        map.put(2, 3);
        map.put(3, 4);
        map.put(4, 4);

        int[] results = map.entrySet().stream()
                .filter(it -> it.getValue() > 0)
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .mapToInt(Map.Entry::getKey)
                .toArray();

        assertThat(results).isEqualTo(new int[]{1, 3, 4, 2});
    }
}