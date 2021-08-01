package hi.mj.algorithms.codility.countingelements;

import hi.mj.algorithms.codility.timecomplexity.PermCheck;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PermCheckTest {
    private PermCheck permCheck = new PermCheck();

    @Test
    void test1() {
        int solution = permCheck.solution(new int[]{3, 6});
        assertThat(solution).isEqualTo(0);
    }

    @Test
    void test2() {
        int solution = permCheck.solution(new int[]{4, 1, 3, 2});
        assertThat(solution).isEqualTo(1);
    }

    @Test
    void test3() {
        int solution = permCheck.solution(new int[]{4, 1, 2, 3, 2});
        assertThat(solution).isEqualTo(0);
    }

    @Test
    void test4() {
        int solution = permCheck.solution(new int[]{2, 1});
        assertThat(solution).isEqualTo(1);
    }

}