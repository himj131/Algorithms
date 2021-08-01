package hi.mj.algorithms.codility.countingelements;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MissingIntegerTest {
    private MissingInteger missingInteger = new MissingInteger();
    @Test
    void test1() {
        int solution = missingInteger.solution(new int[]{1, 2, 3});
        assertThat(solution).isEqualTo(4);
    }

    @Test
    void test2() {
        int solution = missingInteger.solution(new int[]{1, 3, 6, 4, 1, 2});
        assertThat(solution).isEqualTo(2);
    }
}