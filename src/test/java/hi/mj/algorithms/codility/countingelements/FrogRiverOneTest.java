package hi.mj.algorithms.codility.countingelements;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FrogRiverOneTest {
    private FrogRiverOne frogRiverOne = new FrogRiverOne();

    @Test
    void test1() {
        int answer = frogRiverOne.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4});
        assertThat(answer).isEqualTo(6);
    }

    @Test
    void test2() {
        int answer = frogRiverOne.solution(1, new int[]{1});
        assertThat(answer).isEqualTo(0);
    }

    @Test
    void test3() {
        int answer = frogRiverOne.solution(4, new int[]{1, 3});
        assertThat(answer).isEqualTo(-1);
    }
}