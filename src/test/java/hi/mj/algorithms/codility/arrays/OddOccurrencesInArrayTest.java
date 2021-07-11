package hi.mj.algorithms.codility.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class OddOccurrencesInArrayTest {

    @Test
    void test1() {
        OddOccurrencesInArray odd = new OddOccurrencesInArray();
        int solution = odd.solution(new int[]{9, 3, 9, 3, 9, 7, 9});
        assertThat(solution).isEqualTo(7);
    }
}