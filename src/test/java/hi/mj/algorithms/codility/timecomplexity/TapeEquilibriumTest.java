package hi.mj.algorithms.codility.timecomplexity;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TapeEquilibriumTest {
    TapeEquilibrium equilibrium = new TapeEquilibrium();

    @Test
    void test1() {
        int solution = equilibrium.solution(new int[]{3, 1, 2, 4, 3});
        assertThat(solution).isEqualTo(1);
    }

    @Test
    void test2() {
        int solution = equilibrium.solution(new int[]{3, 1});
        assertThat(solution).isEqualTo(2);
    }
}