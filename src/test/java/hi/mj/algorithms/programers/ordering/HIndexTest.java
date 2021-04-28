package hi.mj.algorithms.programers.ordering;

import org.junit.jupiter.api.Test;

/**
 *
 * 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index입니다.
 *
 * 제한사항
 * 과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
 * 논문별 인용 횟수는 0회 이상 10,000회 이하입니다.
 *
 * 입출력 예
 * citations	    return
 * [3, 0, 6, 1, 5]	3
 *
 * 입출력 예 설명
 * 이 과학자가 발표한 논문의 수는 5편이고, 그중 3편의 논문은 3회 이상 인용되었습니다. 그리고 나머지 2편의 논문은 3회 이하 인용되었기 때문에 이 과학자의 H-Index는 3입니다.
 * */
import static org.assertj.core.api.Assertions.assertThat;

class HIndexTest {
    private HIndex index = new HIndex();

    @Test
    void test1() {
        int solution = index.solution(new int[]{3, 0, 6, 1, 5}); //0 1 3 5 6
        assertThat(solution).isEqualTo(3);
    }

    @Test
    void test2() {
        int solution = index.solution(new int[]{4, 0, 5, 10});
        assertThat(solution).isEqualTo(3);
    }

    @Test
    void test3() {
        int solution = index.solution(new int[]{0});
        assertThat(solution).isEqualTo(0);
    }

    @Test
    void test4() {
        int solution = index.solution(new int[]{4, 3, 3, 3});
        assertThat(solution).isEqualTo(3);
    }

    @Test
    void test5() {
        int solution = index.solution(new int[]{4, 3, 1, 1, 0});
        assertThat(solution).isEqualTo(2);
    }
}