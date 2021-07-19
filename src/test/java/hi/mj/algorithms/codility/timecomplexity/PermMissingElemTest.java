package hi.mj.algorithms.codility.timecomplexity;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PermMissingElemTest {
    private PermMissingElem elem = new PermMissingElem();
    @Test
    void test1() {
        int solution = elem.solution(new int[]{});
        assertThat(solution).isEqualTo(0);
    }

    @Test
    void test2() {
        int solution = elem.solution(new int[]{1});
        assertThat(solution).isEqualTo(0);
    }

    @Test
    void test3() {
        int solution = elem.solution(new int[]{3});
        assertThat(solution).isEqualTo(3);
    }
}