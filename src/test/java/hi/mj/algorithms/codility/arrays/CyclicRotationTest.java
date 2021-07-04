package hi.mj.algorithms.codility.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CyclicRotationTest {
    private CyclicRotation cr = new CyclicRotation();

    @Test
    void test1() {
        int[] solution = cr.solution(new int[]{0, 0, 0}, 1);
        assertThat(solution).isEqualTo(new int[]{0, 0, 0});
    }

    @Test
    void test2() {
        int[] solution = cr.solution(new int[]{1, 2, 3, 4}, 4);
        assertThat(solution).isEqualTo(new int[]{1, 2, 3, 4});
    }

    @Test
    void test3() {
        int[] solution = cr.solution(new int[]{3, 8, 9, 7, 6}, 3);
        assertThat(solution).isEqualTo(new int[]{9, 7, 6, 3, 8});
    }
}