package hi.mj.algorithms.codility.timecomplexity;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FrogJmpTest {
    @Test
    void test1() {
        FrogJmp.Solution s = new FrogJmp.Solution();
        int solution = s.solution(10, 85, 30);
        assertThat(solution).isEqualTo(3);
    }
}